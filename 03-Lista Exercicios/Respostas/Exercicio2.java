import java.io.*;

public class Exercicio2 {
	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[200];
		try {
			// Leitura
			InputStream arquivo = new FileInputStream("11-1 - funcionarios.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input);
			//Escrita	
			FileOutputStream arquivo1 = new FileOutputStream("11-1 - funcionarios - Copia.txt");
			PrintWriter pr = new PrintWriter(arquivo1);

			String linha = br.readLine();

			while (linha != null) {
				pr.println(linha);
				linha = br.readLine();
			}

			br.close();
			pr.close();
			arquivo1.close();
			arquivo.close();

			arquivo = new FileInputStream("11-1 - funcionarios - Copia.txt");
			input = new InputStreamReader(arquivo);
			br = new BufferedReader(input);

			double impostoMasculino = 0, impostoFeminino = 0, impostoTotal;

			int i = 0;
			linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split("#");

				funcionarios[i] = new Funcionario(campos[0], campos[1].charAt(0), Double.parseDouble(campos[2]), Integer.parseInt(campos[3]));

				if (Character.compare('F', funcionarios[i].sexo) == 0) {
					impostoFeminino += funcionarios[i].impostoRenda();
				} else {
					impostoMasculino += funcionarios[i].impostoRenda();
				}
				i++;
				linha = br.readLine();
			}

			br.close();
			arquivo.close();

			impostoTotal = impostoMasculino + impostoFeminino;
			System.out.format("Imposto total masculino: %.2f\n", impostoMasculino);
			System.out.format("Imposto total feminino: %.2f\n", impostoFeminino);
			System.out.format("Imposto total: %.2f\n", impostoTotal);

		} catch(Exception e){
			System.out.println("Arquivo não existe");
		}	
	}
}

class Funcionario {
	String nome;
	char sexo;
	double salario;
	int dependentes;

	Funcionario(String nome, char sexo, double salario, int dependentes) {
		this.nome = nome;
		this.sexo = sexo;
		this.salario = salario;
		this.dependentes = dependentes;
	}

	public double impostoRenda() {
		double reducaoDep = 189.59 * dependentes;
		if (salario <= 1903.98)
			return 0;
		else if (salario <= 2826.65)
			return (salario * 7.5 / 100 - 142.80) - reducaoDep;
		else if (salario <= 3751.05)
			return (salario * 15 / 100 - 354.80) - reducaoDep;
		else if (salario <= 4664.68)
			return (salario * 22.5 / 100 - 636.13) - reducaoDep;
		else
			return ((salario * 27.5 / 100) - 869.36) - reducaoDep;
	}

	public String mostraFuncionario() {
		return nome + ' ' + sexo + ' ' + salario + ' ' + dependentes + ' ' +
			impostoRenda();
	} 
}

