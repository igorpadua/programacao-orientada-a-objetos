public class Exercicio5 {
	public static void main(String[] args) {

		// Bancanista
		CaixaDeBanco bancanista1 = new CaixaDeBanco("Roberto", 234823);
		bancanista1.setHorario("8:30");
		bancanista1.setTefone("6292349234");
		bancanista1.setSalario(1200);
		bancanista1.aumentoSalario(10);
		System.out.format("Bancanista:\n%s - Salario: %.2f - Tel: %s - Mat: %d - Horario: %s - Recibemento anual: %.2f\n", 
				bancanista1.getNome(), bancanista1.getSalario(), bancanista1.getTelefone(), 
				bancanista1.getMatricula(), bancanista1.getHorario(), bancanista1.totalRecebimentoAnual());

		// Gerente
		Gerente gerente1 = new Gerente("Fábio", 29341);
		gerente1.setTefone("6242134123");
		gerente1.setSalario(3500);
		gerente1.setBonificacao(120);
		gerente1.setTipo("Comercial");
		gerente1.aumentoSalario(20);	
		System.out.format("Gerente:\n%s - Salario: %.2f - Tel: %s - Mat: %d - Bonificação: %.2f - Recibemento anual: %.2f\n", 
				gerente1.getNome(), gerente1.getSalario(), gerente1.getTelefone(), 
				gerente1.getMatricula(), gerente1.getBonificacao(), gerente1.totalRecebimentoAnual());

		// Clientes
		Cliente cliente1 = new Cliente("João", "622342341", 31, "21342134-01");
		Cliente cliente2 = new Cliente("Aline", "624121294", 21, "23405324-01");
		Cliente cliente3 = new Cliente("Paulo", "624236932", 49, "8394322-01");

		cliente2.desativar();

		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
	}
}

class Pessoas {
	protected String nome;	
	protected String telefone;

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTefone(String telefone) {
		this.telefone = telefone;
	}
}

class Funcionario extends Pessoas {
	protected int matricula;
	protected double salario;

	Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public void aumentoSalario(double porcetagem) {
		this.salario = (this.salario * (porcetagem/100)) + this.salario;
	}

	public double totalRecebimentoAnual() {
		return this.salario * 12;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

class CaixaDeBanco extends Funcionario {
	protected String horario;

	CaixaDeBanco(String nome, int matricula) {
		super(nome, matricula);
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}

class Gerente extends Funcionario {
	protected double bonificacao;
	protected String tipo;

	Gerente(String nome, int matricula) {
		super(nome, matricula);
	}

	public double totalRecebimentoAnual() {
		return super.totalRecebimentoAnual() + (bonificacao * 12);
	}

	public double getBonificacao() {
		return this.bonificacao;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}

class Cliente extends Pessoas {
	protected int idade;
	private String cpf;
	protected char status;
	
	Cliente(String nome, String telefone, int idade, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
		this.status = 'A';
	}

	public void desativar() {
		if (this.status == 'A') {
			this.status = 'I';
		} else {
			System.out.println("O cliente já está inativo");
		}
	}

	public String getCpf() {
		return this.cpf;	
	}

	public int getIdade() {
		return this.idade;
	}

	public char getStatus() {
		return this.status;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		String mensagem = String.format("%s - Tel: %s - Idade: %d anos - cpf: %s - %s", this.nome, this.telefone, this.idade, this.cpf, this.status);
		return mensagem;
	}

}
