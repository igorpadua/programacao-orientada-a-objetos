public class Cursos {
	public static void main(String[] args) {
		Universidade curso1 = new Universidade();	

		curso1.nome = "Engenharia de Software";
		curso1.pratica = "Sim";
		curso1.quantProfessores = 23;
		curso1.valor = 1532;

		System.out.println(curso1);
		curso1.sala();
		curso1.prova();
		curso1.tarefa();
		curso1.alunos();
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
