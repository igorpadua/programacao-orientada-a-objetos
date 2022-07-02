public class Questao1_1 {
	public static void main(String[] args) {
		
		Musica rock = new Musica("Numb");	
		Compositor link = new Compositor("Linkin Park");
		
		link.nacionalidade = "USA";

		rock.ano = 2007;
		rock.tipo = "Rock";
		rock.compositor = link;

		System.out.println("Música: " + rock);
	}
}

class Musica {
	String nome;
	int ano;
	String tipo;
	Compositor compositor;	

	Musica(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nAno: " + ano +
			"\nTipo: " + tipo +
			"\nCompositor: " + compositor;
	}
}

class Compositor {
	String nome;
	String nacionalidade;

	Compositor(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nNacionalidade: " + nacionalidade;
	}
}
