import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int sai, x = 0;
		Cadastro moradores = new Cadastro();
		Condominio[] dados = new Condominio[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			dados[i] = new Condominio();
			moradores.cadastro(dados[i]);
			x++;
			System.out.println("Quer cadastra mais? 1 - sim ou 2 - não");
			sai = input.nextInt();
			if (sai == 2) {
				break;
			}
		}

		for (int i = 0; i < x; i++) {
			System.out.println(dados[i] + "\n");	
		}
		
	}
}

class Condominio {
	String nome, sexo;
	long cpf, celular;
	int dataNascimento, bloco, apartamento, codigoAcesso;
	public String toString() {
		return "Nome da pessoa: " + nome + "\nCPF:" + cpf + "\nNúmero celular: " + celular + "\nData de nascimento: " + dataNascimento 
			+ "\nSexo: " + sexo + "\nBloco: " + bloco + "\nNúmero apartamento: " + apartamento + "\nCódigo de acesso: " + codigoAcesso;
	}
}

class Cadastro {

	Scanner input = new Scanner(System.in);

	public void cadastro(Condominio pessoa) {
		System.out.println("Digite o primeiro nome da pessoa:");
		pessoa.nome = input.next();
		System.out.println("Digite o CPF da pessoa:");
		pessoa.cpf = input.nextLong();
		System.out.println("Digite o número de celular da pessoa:");
		pessoa.celular = input.nextLong();
		System.out.println("Digite a data de nascimento da pessoa:");
		pessoa.dataNascimento = input.nextInt();
		System.out.println("Digite o sexo da pessoa:");
		pessoa.sexo = input.next();
		System.out.println("Digite o bloco que a pessoa mora:");
		pessoa.bloco = input.nextInt();
		System.out.println("Digite o número do apartamento:");
		pessoa.apartamento = input.nextInt();
		System.out.println("Digite o código de acesso:");
		pessoa.codigoAcesso = input.nextInt();
	}

}
