public class Exercicio3 {
	public static void main(String[] args) {
		
		Robo primeiro = new Robo(500);

		primeiro.identificacao = 1;

		System.out.println("1 - Ligando o robo:");
		primeiro.ligar();

		System.out.println(primeiro + "\n");
		
		System.out.println("1 - Movendo o robo:");
		primeiro.andar(5, 10);
		
		System.out.println(primeiro + "\n");

		System.out.println("1 - Aspirar o pó:");
		primeiro.aspirar(237);
		
		System.out.println(primeiro + "\n");

		System.out.println("1 - Para o robo:");
		primeiro.parar();

		System.out.println(primeiro + "\n");

		System.out.println("1 - Desligar o robo:");
		primeiro.desligar();

		System.out.println(primeiro + "\n");

		Robo segundo = new Robo(1200);

		segundo.identificacao = 2;

		System.out.println("2 - Ligando o robo:");
		segundo.ligar();
		
		System.out.println(segundo + "\n");

		System.out.println("2 - Movendo o robo:");
		segundo.andar(32, 20);

		System.out.println(segundo + "\n");

		System.out.println("2 - Aspirar o pó:");
		segundo.aspirar(533);

		System.out.println(segundo + "\n");

		System.out.println("2 - Para o robo:");
		segundo.parar();
		
		System.out.println(segundo + "\n");

		System.out.println("2 - Desligar o robo:");
		segundo.desligar();

		System.out.println(segundo + "\n");
	}
}

class Robo {
	int identificacao, posicaoX, posicaoY;
	double limiteDePo, quantidadeDePo;
	String status;

	Robo(double limite) {
		this.status = "Desligado";
		this.posicaoX = 0;
		this.posicaoY = 0;
		this.quantidadeDePo = 0;
		this.limiteDePo = limite;
	}

	public void ligar() {
		this.status = "Ligado";
	}

	public void desligar() {
		this.status = "Desligado";
	}

	public void aspirar(double poAspirar) {
		if (this.status == "Desligado") {
			System.out.println("Ligue o aspirador primeiro");
		} else if (poAspirar + quantidadeDePo > limiteDePo) {
			System.out.println("Utrapassou o limite de Pó");
		} else {
			quantidadeDePo += poAspirar;
		}
	}

	public void andar(int novaX, int novaY) {
		if (this.status == "Desligado") {
			System.out.println("Ligue o aspirador primeiro");
		} else {
			this.status = "Andando";	
			this.posicaoX += novaX;
			this.posicaoY += novaY;
		}
	}

	public void parar() {
		if (this.status == "Desligado") {
			System.out.println("Ligue o aspirador primeiro");
		} else {
			this.status = "Parado";
		}
	}

	public String toString() {
		return "Identificação: " + identificacao
			+ "\nPosição X: " + posicaoX
			+ "\nPosição Y: " + posicaoY
			+ "\nQuantidade de pó: " + quantidadeDePo
			+ "\nLimite de pó: " + limiteDePo
			+ "\nStatus: " + status;
	}
}

