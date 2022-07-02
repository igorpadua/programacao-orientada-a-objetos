public class Questao1_4 {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Junior");
		Empresa empresa1 = new Empresa("82738423");
		Endereco endereco1 = new Endereco("Avenida 23");

		endereco1.numero = 621;
		endereco1.bairro = "Setor sul"; 
		endereco1.completamento = "Ao lado de um prédio";
		endereco1.cidade = "Goiânia";
		endereco1.estado = "Goiâs";

		empresa1.razao = "banco";
		empresa1.endereco = endereco1;

		empregado1.matricula = 2235;
		empregado1.empresa = empresa1;	

		System.out.println("Empregado:" + empregado1);

	}
}

class Empregado {
	String nome;
	int matricula;
	Empresa empresa;

	Empregado(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "\nNome: " + nome +
			"\nMatricula: " + matricula +
			"\nEmpresa: " + empresa;
	}
}

class Empresa {
	String cnpj;
	String razao;
	Endereco endereco;

	Empresa(String cnpj) {
		this.cnpj = cnpj;
	}

	public String toString() {
		return "\nCNPJ: " + cnpj +
			"\nRazã́o: " + razao +
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
