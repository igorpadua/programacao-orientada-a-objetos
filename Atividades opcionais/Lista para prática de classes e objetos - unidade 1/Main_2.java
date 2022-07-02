public class Main_2 {
	public static void main(String[] args) {
		Produtos produto = new Produtos();	

		produto.nomeProduto = "Sorvete de chocolate";
		produto.marca = "creme mel";
		produto.tipoEmbalagem = "branco";
		produto.categoira = "Sorvete";
		produto.preco = 15.34;
		produto.quantidadeEmbalagem = 15;
		produto.validade = 23092023;

		System.out.println(produto);
	}
}

class Produtos {

	String nomeProduto, marca, tipoEmbalagem, categoira;
	double preco;
	int quantidadeEmbalagem, validade;

	public String toString() {
		return "Nome do produto: " + nomeProduto + "\nMarca: " + marca + "\nTipo de embalagem: " + tipoEmbalagem + "\nCategoira: " + categoira + "\nPreço: " + preco + "\nQuantidade de embalagem: " + quantidadeEmbalagem + "\nValidade: " + validade;
	}

}
