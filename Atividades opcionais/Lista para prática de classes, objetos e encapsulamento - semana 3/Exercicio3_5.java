import java.util.Scanner;

public class Exercicio3_5 {
	public static void main(String[] args) {
		
		Cadastro moradores = new Cadastro();
		Condominio[] dados = new Condominio[3];

		for (int i = 0; i < 3; i++) {
			dados[i] = new Condominio();
			moradores.cadastro(dados[i]);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(dados[i]);
		}

	}
}

class Condominio {
	private String nome, sexo;
	private long cpf, celular;
	private int dataNascimento, bloco, apartamento, codigoAcesso;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setBloco(int bloco) {
		this.bloco = bloco;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}	

	public void setCodigoAcesso(int codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	public String toString() {
		return "Nome da pessoa: " + nome + "\nCPF:" + cpf + "\nNúmero celular: " + celular + "\nData de nascimento: " + dataNascimento 
			+ "\nSexo: " + sexo + "\nBloco: " + bloco + "\nNúmero apartamento: " + apartamento + "\nCódigo de acesso: " + codigoAcesso;
	}
}

class Cadastro {

	Scanner input = new Scanner(System.in);

	public void cadastro(Condominio pessoa) {
		System.out.println("Digite o nome da pessoa:");
		pessoa.setNome(input.next());
		System.out.println("Digite o CPF da pessoa:");
		pessoa.setCpf(input.nextLong());
		System.out.println("Digite o número de celular da pessoa:");
		pessoa.setCelular(input.nextLong());
		System.out.println("Digite a data de nascimento da pessoa:");
		pessoa.setDataNascimento(input.nextInt());
		System.out.println("Digite o sexo da pessoa:");
		pessoa.setSexo(input.next());
		System.out.println("Digite o bloco que a pessoa mora:");
		pessoa.setBloco(input.nextInt());
		System.out.println("Digite o número do apartamento:");
		pessoa.setApartamento(input.nextInt());
		System.out.println("Digite o código de acesso:");
		pessoa.setCodigoAcesso(input.nextInt());
	}

	
}
