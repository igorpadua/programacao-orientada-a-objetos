public class Pessoa{
	String nome;
	double salario;
	int dependentes;
	int idade;

	Pessoa(String nome, double salario, int dependentes, int idade) {
		this.nome = nome;
		this.salario = salario;
		this.dependentes = dependentes;
		this.idade = idade;
	}

	public double calculaImposto() {
		double reducaoDep = 179.71 * dependentes;
		double imposto;
		if (idade >= 65 || salario <= 1787.77)
			return 0;
		else if (salario <= 2679.29) {
			imposto = (salario * 7.5 / 100 - 134.08) - reducaoDep;
			return imposto > 0 ? imposto : 0;
		} else if (salario <= 3572.43) {
			imposto = (salario * 15 / 100 - 335.03) - reducaoDep;
			return imposto > 0 ? imposto : 0;
		} else if (salario <= 4463.81) {
			imposto = (salario * 22.5 / 100 - 602.96) - reducaoDep;
			return imposto > 0 ? imposto : 0;
		} else {
			imposto = (salario * 27.5 / 100 - 826.15) - reducaoDep;
			return imposto > 0 ? imposto : 0;
		}
	}
}
