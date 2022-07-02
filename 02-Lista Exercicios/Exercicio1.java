public class Exercicio1 {
	public static void main(String[] args) {
		Funcionarios[] funcionario = new Funcionarios[10];

		// Gerente:
		funcionario[0] = new Gerente("Roberto", "Silva");
		
		((Gerente) funcionario[0]).setSalario(2500);
		((Gerente) funcionario[0]).setBonificacao(150);

		// Horistas:
		funcionario[1] = new Horistas("Luiza", "Rodrigues");

		((Horistas) funcionario[1]).setHorasTrabalhadas(80);
		((Horistas) funcionario[1]).setValorHora(15);

		funcionario[2] = new Horistas("Patrick", "Alvez");

		((Horistas) funcionario[2]).setHorasTrabalhadas(75);
		((Horistas) funcionario[2]).setValorHora(12);

		// Comissionados
		funcionario[3] = new Comissionados("Felipe", "Mendez");
		
		((Comissionados) funcionario[3]).setSalario(1200);
		((Comissionados) funcionario[3]).setTotalVendas(100);
		((Comissionados) funcionario[3]).setPorcentualComissao(12);

		funcionario[4] = new Comissionados("Santiago", "Cardoso");
		
		((Comissionados) funcionario[4]).setSalario(1250);
		((Comissionados) funcionario[4]).setTotalVendas(93);
		((Comissionados) funcionario[4]).setPorcentualComissao(10);

		funcionario[5] = new Comissionados("Marcelo", "Junior");

		((Comissionados) funcionario[5]).setSalario(1030.12);
		((Comissionados) funcionario[5]).setTotalVendas(120);
		((Comissionados) funcionario[5]).setPorcentualComissao(15);

		// Administradores
		funcionario[6] = new Administradores("Diana", "Melo");

		((Administradores) funcionario[6]).setSalario(1950.92);

		funcionario[7] = new Administradores("Rodrigo", "Maia");

		((Administradores) funcionario[7]).setSalario(2000.50);

		funcionario[8] = new Administradores("Ana", "Julia");

		((Administradores) funcionario[8]).setSalario(1823);

		funcionario[9] = new Administradores("Fabiano", "Abreu");

		((Administradores) funcionario[9]).setSalario(2150.56);

		for (int i = 0; i < 10; i++) {
			System.out.println(funcionario[i]);
			funcionario[i].mostraSalario();
		}

	}
}
abstract class Funcionarios {

	protected String nome;	
	protected String sobrenome;

	Funcionarios(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public abstract void mostraSalario(); 

	public String toString() {
		return "Nome: " + nome +
			" - Sobrenome: " + sobrenome;
	}
}

class Administradores extends Funcionarios {

	private double salario;

	Administradores(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	public void mostraSalario() {
		System.out.format("O salário mensal é R$ %.2f\n", salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return super.toString() + " - Salario: " + salario; 
	}
}

class Gerente extends Funcionarios {

	private double salario;
	private double bonificacao;

	Gerente(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void mostraSalario() {
		System.out.format("O salário mensal é R$ %.2f\n", salario + bonificacao);
	}

	public String toString() {
		return super.toString() + " - Salario: " + salario +
			" - Bonificação: " + bonificacao;
	}
}

class Comissionados extends Funcionarios {

	private double salario;
	private int totalVendas;
	private double porcentualComissao;
	
	Comissionados(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	public double getSalario() {
		return salario;
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public double getPorcentualComissao() {
		return porcentualComissao;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public void setPorcentualComissao(double porcentualComissao) {
		this.porcentualComissao = porcentualComissao;
	}

	public void mostraSalario() {
		System.out.format("O sálario é R$ %.2f\n", salario + (totalVendas * (porcentualComissao / 100)));
	}

	public String toString() {
		return super.toString() + " - Sálario: " + salario +
			" - Total de Vendas: " + totalVendas +
			" - Porcentual de comissão: " + porcentualComissao;
	}
}

class Horistas extends Funcionarios {
	
	private double horasTrabalhadas;
	private double valorHora;

	Horistas(String nome, String sobrenome) {
		super(nome, sobrenome);
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public void mostraSalario() {
		System.out.format("O sálario é R$ %.2f\n", horasTrabalhadas * valorHora);
	}

	public String toString() {
		return super.toString() + " - Horas trabalhadas:" + horasTrabalhadas +
			" - Valor da hora:" + valorHora;
	}
}
