public class Exercicio4 {
	public static void main(String[] args) {

		int numero;
		String remetente, tipo;

		FabricaDocumentos carta = new FabricaDocumentos();
		numero = 234;
		remetente = "Fabricio";
		tipo = "Cartas";
		carta.criaDocumento(numero, remetente, tipo);

		FabricaDocumentos telegrama = new FabricaDocumentos();
		numero = 521;
		remetente = "José";
		tipo = "Telegramas";
		carta.criaDocumento(numero, remetente, tipo);

		FabricaDocumentos notificacoes= new FabricaDocumentos();
		numero = 191;
		remetente = "Ana Júlia";
		tipo = "Notificacoes";
		carta.criaDocumento(numero, remetente, tipo);

	}
}

abstract class Documento {
	int numero;
	String remetente;
	String tipo;

	Documento(int numero, String remetente) {
		this.numero = numero;
		this.remetente = remetente;
	}
}

class Cartas extends Documento {
	Cartas(int numero, String remetente) {
		super(numero, remetente);

		System.out.format("A carta n°: %d - Remetente: %s\n", numero, remetente);
	}

}

class Telegramas extends Documento {
	Telegramas(int numero, String remetente) {
		super(numero, remetente);
		System.out.format("O telegrama n°: %d - Remetente: %s\n", numero, remetente);
	}
}

class Notificacoes extends Documento {
	Notificacoes(int numero, String remetente) {
		super(numero, remetente);
		System.out.format("A Notificacoes n°: %d - Remetente: %s\n", numero, remetente);
	}
}

abstract class Fabrica {
	public abstract Documento criaDocumento(int numero, String remetente, String tipo);
}

class FabricaDocumentos extends Fabrica {
	
	public Documento criaDocumento(int numero, String remetente, String tipo) {
		if (tipo.equals("Cartas")) {
			return new Cartas(numero, remetente);
		} else if (tipo.equals("Telegramas")) {
			return new Telegramas(numero, remetente);
		} else if (tipo.equals("Notificacoes")) {
			return new Notificacoes(numero, remetente);
		} else {
			System.out.println("Tipo errado");
		}
		return null;
	}
}
