public class Main_3 {
	public static void main(String[] args) {
		Servicos stream = new Servicos();

		stream.codigo = 53632;
		stream.quantFuncionario = 322;
		stream.tempoEstimado = 24;
		stream.descServico = "Serviços de streaming";
		stream.status = "Disponível";
		stream.categoria = "Streaming";
		stream.valorHora = 2.35;

		System.out.println(stream);

	}
}

class Servicos {
	int codigo, quantFuncionario, tempoEstimado;
	String descServico, status, categoria;
	double valorHora;

	public String toString(){
		return "Código: " + codigo + "\nQuantidade de funcionarios: " + quantFuncionario + "\nTempo Estimado: " + tempoEstimado + "\nDescrição do serviço: " + descServico + "\nStatus: " + status + "Categoira: " + categoria + "\nValor por hora: " + valorHora;
	}
}

