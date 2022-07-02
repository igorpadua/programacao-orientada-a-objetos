public class Questao1_2 {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Igor");
		Cursos curs = new Cursos("Engenharia de software"); 
		Departamento deper = new Departamento("Instituto de Informatica");

		curs.sigla = "ES";
		deper.sigla = "INF";  
		curs.departamento = deper;

		aluno.tipo = "Graduando";
		aluno.ano = 2020;
		aluno.curso = curs;

		System.out.println("Aluno:" + aluno);
	}
}

class Aluno {
	String nome;
	String tipo;
	int ano;
	Cursos curso;

	Aluno(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nTipo: " + tipo +
			"\nAno: " + ano +
			"\nCursos: " + curso;
	}
}

class Cursos {
	String nome;
	String sigla;
	Departamento departamento;

	Cursos(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nSigla: " + sigla +
			"\nDepertamento: " + departamento;
	}
}

class Departamento {
	String nome;
	String sigla;

	Departamento(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nSigla: " + sigla;
	}
}
