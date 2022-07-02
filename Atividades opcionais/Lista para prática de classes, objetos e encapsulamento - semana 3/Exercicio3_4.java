public class Exercicio3_4 {
	public static void main(String[] args) {

		Condominio[] moradores = new Condominio[3]; 

		for (int i = 0; i < 3; i++) {
			moradores[i] = new Condominio();
		}
		
		moradores[0].setNome("Igor");
		moradores[0].setSexo("Masculino");
		moradores[0].setCpf(807283192);
		moradores[0].setCelular(982134402);
		moradores[0].setDataNascimento(12052001);
		moradores[0].setBloco(120);
		moradores[0].setApartamento(32);
		moradores[0].setCodigoAcesso(231);

		moradores[1].setNome("Marcio");
		moradores[1].setSexo("Masculino");
		moradores[1].setCpf(807282382);
		moradores[1].setCelular(982824402);
		moradores[1].setDataNascimento(02122000);
		moradores[1].setBloco(130);
		moradores[1].setApartamento(52);
		moradores[1].setCodigoAcesso(143);

		moradores[2].setNome("Julia");
		moradores[2].setSexo("Feminino");
		moradores[2].setCpf(323282382);
		moradores[2].setCelular(98282234);
		moradores[2].setDataNascimento(12022005);
		moradores[2].setBloco(133);
		moradores[2].setApartamento(26);
		moradores[2].setCodigoAcesso(832);

		for (int i = 0; i < 3; i++) {
			System.out.println("\n" + moradores[i] + "\n");
		}

	}
}

class Condominio {
	private String nome, sexo;
	private long cpf, celular;
	private int dataNascimento, bloco, apartamento, codigoAcesso;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setBloco(int bloco) {
		this.bloco = bloco;
	}

	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}	

	public void setCodigoAcesso(int codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	public String toString() {
		return "Nome da pessoa: " + nome + "\nCPF:" + cpf + "\nNúmero celular: " + celular + "\nData de nascimento: " + dataNascimento 
			+ "\nSexo: " + sexo + "\nBloco: " + bloco + "\nNúmero apartamento: " + apartamento + "\nCódigo de acesso: " + codigoAcesso;
	}
}


