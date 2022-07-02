public class Exercicio2 {
	public static void main(String[] args) {

		// Matriz:
		LojaConcreta matriz = new LojaConcreta("23748234", "Indrustria peças");	

		matriz.endereco = "Rua 912, qt 99";
		matriz.gerente = "Lucas";
		matriz.identificador = 162;
		matriz.registra_abertura_dia();

		// Filial 1:
		LojaConcreta filial1 = new LojaConcreta("435212", "Vendas de peças");

		filial1.endereco = "Rua 521, qt 85";
		filial1.gerente = "Roberto";
		filial1.identificador = 563;
		filial1.registra_abertura_dia();

		// Filial 2:
		LojaConcreta filial2 = new LojaConcreta("882340", "Compra de peças usadas");

		filial2.endereco = "Rua 198, qt 23";
		filial2.gerente = "Sabrina";
		filial2.identificador = 329;
		filial2.registra_fechamento_dia();

		// Fechamento da matriz
		matriz.registra_fechamento_dia();

		System.out.println(matriz);
		System.out.println(filial1);
		System.out.println(filial2);
	}
}

abstract class Loja {

	protected int identificador;
	protected String cnpj;
	protected String razaoSocial;
	protected boolean aberta;

	Loja(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		aberta = false;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public boolean getAberta() {
		return aberta;
	}

	public String toString() {
		return "Identificador: " + identificador +
			" - Cnpj: " + cnpj +
			" - Razão social: " + razaoSocial +
			" - Aberta: " + aberta;
	}
}

interface Registro {
	public void registra_abertura_dia();
	public void registra_fechamento_dia();
}

class LojaConcreta extends Loja implements Registro {

	protected String endereco;
	protected String gerente;

	LojaConcreta(String cnpj, String razaoSocial) {
		super(cnpj, razaoSocial);
	}

	public void registra_abertura_dia() {
		if (this.aberta == true) {
			System.out.format("A loja %d já está aberta.\n", this.identificador);
		} else {
			this.aberta = true;
			System.out.format("A loja %d foi aberta.\n", this.identificador);
		}
	}

	public void registra_fechamento_dia() {
		if (this.aberta == false) {
			System.out.format("A loja %d já está fechada.\n", this.identificador);
		} else {
			this.aberta = false;
			System.out.format("A loja %d foi fechada.\n", this.identificador);
		}
	}

	public String toString() {
		return super.toString() +
			" - Endereço: " + endereco +
			" - Gerente: " + gerente;
	}
}
