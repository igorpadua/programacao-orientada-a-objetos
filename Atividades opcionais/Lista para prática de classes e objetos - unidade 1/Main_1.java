public class Main_1 {
	public static void main(String[] args) {

		Cadastro aluno = new Cadastro();

		aluno.nome = "Igor";
		aluno.endereco = "Rua 10";
		aluno.instrumento = "Guitarra";
		aluno.cpf = 703234121;
		aluno.telefone = 993510294;
		aluno.dataNascimento = 12052001;
		
		System.out.println(aluno);

	}
}

class Cadastro {
		String nome, endereco, instrumento;
		int dataNascimento;
		long cpf, telefone;

		public String toString() {
			return "Nome: " + nome + "\nEndereco: " + endereco + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nData de Nascimento: " + dataNascimento + "\nInstrumento de interesse: " + instrumento; 
		} 
}
