import java.util.ArrayList;

public class Heranca {
	public static void main(String[] args) {
		ArrayList<Item> midias = new ArrayList<Item>();

		// Primeiro CD
		Cd mixtape = new Cd("Bem vindo ao natal");	
		mixtape.comentarios = "Mixtape mano";
		mixtape.ano = 2016;
		mixtape.tempoDuracao = 14.26;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 5;
		midias.add(mixtape);

		// Segundo CD
		mixtape = new Cd("KPOP");
		mixtape.comentarios = "Cash";
		mixtape.ano = 2017;
		mixtape.tempoDuracao = 14.21;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 5;
		midias.add(mixtape);

		// Terceiro CD
		mixtape = new Cd("Rockstar");
		mixtape.comentarios = "AFF";
		mixtape.ano = 2016;
		mixtape.tempoDuracao = 14.39;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 6;
		midias.add(mixtape);

		// Quarto CD
		mixtape = new Cd("Raff Raff");
		mixtape.comentarios = "Sukyia";
		mixtape.ano = 2017;
		mixtape.tempoDuracao = 11.16;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 5;
		midias.add(mixtape);

		// Quinta CD
		mixtape = new Cd("GUAPO");
		mixtape.comentarios = "Rincon";
		mixtape.ano = 2017;
		mixtape.tempoDuracao = 14.36;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 6;
		midias.add(mixtape);

		// Sexto CD
		mixtape = new Cd("Gojushiho... Sho!");
		mixtape.comentarios = "Meus ganhos";
		mixtape.ano = 2017;
		mixtape.tempoDuracao = 9.30;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 4;
		midias.add(mixtape);

		// Setimo CD
		mixtape = new Cd("HEYYY RAFF!");
		mixtape.comentarios = "Dalua";
		mixtape.ano = 2016;
		mixtape.tempoDuracao = 18.34;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 6;
		midias.add(mixtape);

		// Oitava CD
		mixtape = new Cd("Trap baby");
		mixtape.comentarios = "Sempre jovens";
		mixtape.ano = 2017;
		mixtape.tempoDuracao = 20.24;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 6;
		midias.add(mixtape);

		// Nono CD
		mixtape = new Cd("Raw Raw Emo");
		mixtape.comentarios = "POP tipo...";
		mixtape.ano = 2017;
		mixtape.tempoDuracao = 11.22;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 5;
		midias.add(mixtape);

		// Decimo CD
		mixtape = new Cd("Mj Mixtape");
		mixtape.comentarios = "Tipo o Cirilo na corrida de carro";
		mixtape.ano = 2016;
		mixtape.tempoDuracao = 12.22;
		mixtape.artista = "Raffa";
		mixtape.quantidadeFaixas = 6;
		midias.add(mixtape);

		// Primeiro Filme
		Filme filme = new Filme("O poderoso chefão");
		filme.comentarios = "10 Oscars";
		filme.ano = 1972;
		filme.tempoDuracao = 2.0;
		filme.diretor = "Mario Puzo";
		midias.add(filme);

		// Segundo filme
		filme = new Filme("A procura da felicidade");
		filme.comentarios = "O homem que perdeu tudo";
		filme.ano = 2006;
		filme.tempoDuracao = 1.6;
		filme.diretor = "Gabriele Muccino";
		midias.add(filme);

		// Terceiro filme
		filme = new Filme("Forrest Gump");
		filme.comentarios = "6 Oscars";
		filme.ano = 1994;
		filme.tempoDuracao = 2.3;
		filme.diretor = "Tom Hanks";
		midias.add(filme);

		// Quarto filme
		filme = new Filme("Clube da luta");
		filme.comentarios = "História surpreende";
		filme.ano = 1999;
		filme.tempoDuracao = 1.2;
		filme.diretor = "David Fincher";
		midias.add(filme);

		// Quinto filme
		filme = new Filme("Laranja Mecânica");
		filme.comentarios = "Amante da violência";
		filme.ano = 1971;
		filme.tempoDuracao = 2.2;
		filme.diretor = "Stanley Kubrick";
		midias.add(filme);

		// Sexto filme
		filme = new Filme("Pulp Fiction");
		filme.comentarios = "Melhor filme do ano";
		filme.ano = 1994;
		filme.tempoDuracao = 2.0;
		filme.diretor = "Quentin Tarantino";
		midias.add(filme);

		// Setimo filme
		filme = new Filme("A corrida do Ouro");
		filme.comentarios = "Duas indicações ao Oscar";
		filme.ano = 1925;
		filme.tempoDuracao = 1.3;
		filme.diretor = "Charles Chaplin";
		midias.add(filme);

		// Oitavo filme
		filme = new Filme("2001: Uma Odisseia no Espaço");
		filme.comentarios = "Pioneiro nos efeitos visuais";
		filme.ano = 1968;
		filme.tempoDuracao = 2.8;
		filme.diretor = "Stanley Kubrick";
		midias.add(filme);

		// Nono filme
		filme = new Filme("Brilho Eterno de uma Mente sem Lembranças");
		filme.comentarios = "1 Oscar";
		filme.ano = 2004;
		filme.tempoDuracao = 1.8;
		filme.diretor = "Michael Gondry";
		midias.add(filme);

		// Decimo filme
		filme = new Filme("Closer");
		filme.comentarios = "2 indicações ao Oscar";
		filme.ano = 2004;
		filme.tempoDuracao = 1.3;
		filme.diretor = "Mike Nichols";
		midias.add(filme);

		// Primeiro jogo
		Jogo jogo = new Jogo("God of war 2");
		jogo.comentarios = "Kratos";
		jogo.ano = 2007;
		jogo.tempoDuracao = 5;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("PS2");
		midias.add(jogo);

		// Segundo jogo
		jogo = new Jogo("Shadow of the Colossus");
		jogo.comentarios = "Gigante";
		jogo.ano = 2005;
		jogo.tempoDuracao = 8;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("PS2");
		midias.add(jogo);

		// Terceiro jogo
		jogo = new Jogo("FarCry");
		jogo.comentarios = "Gigante";
		jogo.ano = 2004;
		jogo.tempoDuracao = 6;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("PC");
		midias.add(jogo);

		// Quarto jogo
		jogo = new Jogo("Need for speed");
		jogo.comentarios = "Carro EA";
		jogo.ano = 2005;
		jogo.tempoDuracao = 3;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("PC");
		midias.add(jogo);

		// Quinto jogo
		jogo = new Jogo("PES 2010");
		jogo.comentarios = "Futebol";
		jogo.ano = 2009;
		jogo.tempoDuracao = 100;
		jogo.numeroJogadores = 2;
		jogo.setPlataforma("XBOX 360");
		midias.add(jogo);

		// Sexto jogo
		jogo = new Jogo("Call of Duty 4");
		jogo.comentarios = "FPS";
		jogo.ano = 2007;
		jogo.tempoDuracao = 10;
		jogo.numeroJogadores = 2;
		jogo.setPlataforma("XBOX 360");
		midias.add(jogo);

		// Setimo jogo
		jogo = new Jogo("Call of Duty 4");
		jogo.comentarios = "FPS";
		jogo.ano = 2007;
		jogo.tempoDuracao = 10;
		jogo.numeroJogadores = 2;
		jogo.setPlataforma("XBOX 360");
		midias.add(jogo);

		// Oitava jogo
		jogo = new Jogo("Dead Space");
		jogo.comentarios = "Oscar efeitos sonoros";
		jogo.ano = 2008;
		jogo.tempoDuracao = 3;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("XBOX 360");
		midias.add(jogo);

		// Nono jogo
		jogo = new Jogo("GTA san Andreas");
		jogo.comentarios = "Melhor jogo";
		jogo.ano = 2004;
		jogo.tempoDuracao = 8;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("PS2");
		midias.add(jogo);

		// Decimo jogo
		jogo = new Jogo("Black");
		jogo.comentarios = "EA FPS";
		jogo.ano = 2006;
		jogo.tempoDuracao = 4;
		jogo.numeroJogadores = 1;
		jogo.setPlataforma("PS2");
		midias.add(jogo);

		for (int i = 0; i < midias.size(); i++) {
			System.out.println(midias.get(i));
		}
	}
}

class Item {
	protected String titulo, comentarios;
	protected int ano;
	protected double tempoDuracao;

	public String toString() {
		String mensagem = String.format("Titulo: %s\nComentarios: %s\nAno: %d\nTempo de duração: %.2f\n", titulo, comentarios, ano, tempoDuracao);
		return mensagem;
	}
}

class Cd extends Item {
	protected String artista;
	protected int quantidadeFaixas;

	Cd(String titulo) {
		this.titulo = titulo;
	}

	public String toString() {
		String mensagem = String.format("Artista: %s\nQuantidade de faixas: %d\n", artista, quantidadeFaixas);
		return super.toString() + mensagem;
	}
}

class Filme extends Item {
	protected String diretor;

	Filme(String titulo) {
		this.titulo = titulo;
	}

	public String toString() {
		String mensagem = String.format("Diretor: %s\n", diretor);
		return super.toString() + mensagem;
	}
}

class Jogo extends Item {
	protected int numeroJogadores;
	protected String plataforma;

	Jogo(String titulo) {
		this.titulo = titulo;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String toString() {
		String mensagem = String.format("Numero de jogadores: %d\nPlatafomra: %d\n", numeroJogadores, plataforma);
		return super.toString() + mensagem;
	}
}
