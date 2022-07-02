import java.util.ArrayList;

public class Exercicio3 {
	public static void main(String[] args) {

		ArrayList<Pessoa> pessoa = new ArrayList<>();

		// Aparelho 1:
		Aparelho ap1 = new Aparelho("4326", 2018, "Samsung", "A320");
		Atendimento aten1 = new Atendimento("12/02/2020", "Dividiu em 3x", ap1);
		// Adicionando um atendimento ao aparelho 1
		ap1.adicionaAtendimento(aten1);
		Funcionario fun1 = new Funcionario("Daniel", "235827384", 5321, aten1);
		// Dono do aparelho ap1
		Cliente cli1 = new Cliente("Roberto", "23478231", "6282439813", ap1);
		pessoa.add(cli1);
		pessoa.add(fun1);

		// Aparelho 2:
		Aparelho ap2 = new Aparelho("23952", 2019, "Xiomi", "23X");
		Atendimento aten2 = new Atendimento("26/08/2019", "Comprou a vista", ap2);
		// Adicionando um atendimento ao aparelho 2
		ap2.adicionaAtendimento(aten2);
		Funcionario fun2 = new Funcionario("Jorges", "3589243", 1831, aten2);
		// Dono do aparelho ap2
		Cliente cli2 = new Cliente("Daniela", "9384521", "629342623", ap2);
		pessoa.add(cli2);
		pessoa.add(fun2);

		for (int i = 0; i < pessoa.size(); i++) {
			System.out.println(pessoa.get(i));
			if (i == 1) {
				System.out.println();
			}
		}
	}
}

abstract class Pessoa {

	String nome;
	String cpf;

	Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String toString() {
		return "Nome: " + nome +
			" - CPF: " + cpf;
	}
}

class Funcionario extends Pessoa {

	int matricula;
	ArrayList<Atendimento> atendimento = new ArrayList<>();

	Funcionario(String nome, String cpf, int matricula, Atendimento atendimento) {
		super(nome, cpf);
		this.matricula = matricula;
		this.atendimento.add(atendimento);
	}

	public String toString() {

		String retorno = " - Matricula: " + matricula;

		for (int i = 0; i < atendimento.size(); i++) {
			retorno = retorno + "\nAtendimento " + i + ": " + atendimento.get(i);
		}

		return "Funcionario: " + super.toString() + retorno;
	}

}

class Cliente extends Pessoa {

	String telefone;
	ArrayList<Aparelho> aparelho = new ArrayList<>();

	Cliente(String nome, String cpf, String telefone, Aparelho aparelho) {
		super(nome, cpf);
		this.telefone = telefone;
		this.aparelho.add(aparelho);
	}

	public String toString() {
		String retorno = " - Telefone: " + telefone; 

		for (int i = 0; i < aparelho.size(); i++) {
			retorno = retorno + "\nAparelho: " + aparelho.get(i);
		}

		return "Cliente: " + super.toString() + retorno;
	}
}

class Atendimento {

	Aparelho aparelho;
	String data;
	String descricao;

	Atendimento(String data, String descricao, Aparelho aparelho) {
		this.data = data;
		this.descricao = descricao;
		this.aparelho = aparelho;
	}

	public String toString() {
		return "Data: " + data +
			" - Descrição: " + descricao;
	}
}

class Aparelho {

	ArrayList<Atendimento> atendimento = new ArrayList<>();
	String codigo;
	int ano;
	String marca;
	String modelo;

	public void adicionaAtendimento(Atendimento atendimento) {
		this.atendimento.add(atendimento);
	}

	Aparelho(String codigo, int ano, String marca, String modelo) {
		this.codigo = codigo;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String toString() {
		String atendi = "Codigo: " + codigo +
			" - Ano: " + ano +
			" - Marca: " + marca +
			" - Modelo: " + modelo;

		return atendi; 
	}
}
