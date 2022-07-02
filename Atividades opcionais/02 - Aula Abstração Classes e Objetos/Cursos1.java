import java.util.Scanner;

public class Cursos1 {
	public static void main(String[] args) {

		Universidade curso1 = new Universidade();	
		Universidade curso2 = new Universidade();	
		Universidade curso3 = new Universidade();	
		Universidade curso4 = new Universidade();	
		Scanner input = new Scanner(System.in);	

		System.out.println("1 - Informe o nome do curso:");
		curso1.nome = input.next();
		System.out.println("1 - Informe a prática:");
		curso1.pratica = input.next();
		System.out.println("1 - Informe quantos professores tem:");
		curso1.quantProfessores = input.nextInt();
		System.out.println("1 - Informe a mensalidade:");
		curso1.valor = input.nextFloat();

		System.out.println("2 - Informe o nome do curso:");
		curso2.nome = input.next();
		System.out.println("2 - Informe a prática:");
		curso2.pratica = input.next();
		System.out.println("2 - Informe quantos professores tem:");
		curso2.quantProfessores = input.nextInt();
		System.out.println("2 - Informe a mensalidade:");
		curso2.valor = input.nextFloat();

		System.out.println("3 - Informe o nome do curso:");
		curso3.nome = input.next();
		System.out.println("3 - Informe a prática:");
		curso3.pratica = input.next();
		System.out.println("3 - Informe quantos professores tem:");
		curso3.quantProfessores = input.nextInt();
		System.out.println("3 - Informe a mensalidade:");
		curso3.valor = input.nextFloat();

		System.out.println("4 - Informe o nome do curso:");
		curso4.nome = input.next();
		System.out.println("4 - Informe a prática:");
		curso4.pratica = input.next();
		System.out.println("4 - Informe quantos professores tem:");
		curso4.quantProfessores = input.nextInt();
		System.out.println("4 - Informe a mensalidade:");
		curso4.valor = input.nextFloat();

		System.out.println(curso1);	
		System.out.println(curso2);	
		System.out.println(curso3);	
		System.out.println(curso4);	
	}
}

class Universidade {
	String nome, pratica;
	int quantProfessores;
	float valor;

	public void sala() {
		System.out.println("O curso tem salas");	
	}

	public void prova() {
		System.out.println("O curso tem provas");
	}

	public void tarefa() {
		System.out.println("O curso tem tarefa");
	}

	public void alunos() {
		System.out.println("O curso tem alunos");
	}

	public String toString() {
		return "Nome: " + nome + "\nPratica: " + pratica + "\nQuantidade de professores: " + quantProfessores + "\nValor mensal: " + valor;
	}
}
