public class Questao1_3 {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João");
		Endereco endereco1 = new Endereco("T-10");

		endereco1.numero = 551;
		endereco1.bairro = "Centro";
		endereco1.completamento = "Ao lado do Giraffas";
		endereco1.cidade = "Goiânia";
		endereco1.estado = "Goiâs";

		cliente1.endereco = endereco1;
		cliente1.cpf = "709283412";

		System.out.println("Cliente: " + cliente1);

	}
}

class Cliente {
	String nome;
	String cpf;
	Endereco endereco;	

	Cliente(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nCPF: " + cpf +
			"\nEndereço: " + endereco;
	}
}

class Endereco {
	String rua;
	int numero;
	String bairro;
	String completamento;
	String cidade;
	String estado;

	Endereco(String rua) {
		this.rua = rua;
	}

	public String toString() {
		return "\nRua: " + rua + 
			"\nNumero: " + numero +
			"\nBairro: " + bairro +
			"\nCompletamento: " + completamento +
			"\nCidade " + cidade +
			"\nEstado: " + estado;
	}
}
