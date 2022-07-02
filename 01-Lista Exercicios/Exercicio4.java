import java.util.ArrayList;

public class Exercicio4 {
	public static void main(String[] args) {
		Morador mor1 = new Morador();

		mor1.setNome("Igor");
		mor1.setSexo('M');
		mor1.setCpf("7023182234");
		mor1.setBloco(742);
		mor1.setCelular("6298423423");
		mor1.setApartamento(302);
		mor1.setCodigoAcesso("8431");
		mor1.setDataNascimento(12052001);

		Apartamento ap1 = new Apartamento();

		ap1.adicionaMorador(mor1);
		ap1.setNumero(21);
		ap1.setAndar(4);
		ap1.setMetragem(500);
		ap1.setSituacao("Alugado");

		Morador mor2 = new Morador();

		mor2.setNome("Regina");
		mor2.setSexo('F');
		mor2.setCpf("702342832");
		mor2.setBloco(239);
		mor2.setCelular("52023482321");
		mor2.setApartamento(291);
		mor2.setCodigoAcesso("391");
		mor2.setDataNascimento(21091992);

		Apartamento ap2 = new Apartamento();

		ap2.adicionaMorador(mor2);
		ap2.setNumero(53);
		ap2.setAndar(6);
		ap2.setMetragem(500);
		ap2.setSituacao("Quitado");

		String mensagem = ap1 + "\n\n" + ap2;
		System.out.println(mensagem);

	}
}

class Apartamento {
	private int numero, andar;
	private double metragem;
	private String situacao;
	ArrayList<Morador> moradores = new ArrayList<Morador>();

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAndar(int andar){
		this.andar = andar;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public void adicionaMorador(Morador mor) {
		moradores.add(mor);
	}

	public String toString() {
		String retorno = "Numero: " + numero 
			+ "\nAndar: " + andar 
			+ "\nMetragem: " + metragem 
			+ "\nSituação: " + situacao;
		for (int i = 0; i < moradores.size(); i++) {
			retorno = retorno + " " +  moradores.get(i);
		}
		return retorno; 
	}
}

class Morador {
	private String nome, cpf, celular, codigoAcesso;
	private int dataNascimento, bloco, apartamento;
	private char sexo;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCelular(String celular) {
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

	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}

	public String toString() {
		return "\nNome da pessoa: " + nome 
			+ "\nCPF:" + cpf 
			+ "\nNúmero celular: " + celular 
			+ "\nData de nascimento: " + dataNascimento 
			+ "\nSexo: " + sexo 
			+ "\nBloco: " + bloco 
			+ "\nNúmero apartamento: " + apartamento 
			+ "\nCódigo de acesso: " + codigoAcesso;
	}
}


