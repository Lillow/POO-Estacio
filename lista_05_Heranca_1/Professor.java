package lista_05_Heranca_1;

public class Professor extends Funcionario {
	private double salario;

	public Professor(String nome, String sobrenome, double salario) {
		super(nome, sobrenome, salario);
		this.salario = salario;

	}

	public double getSalarioPrimeiraParcela() {
		return salario;
	}

	public double getSalarioSegundaParcela() {
		return 0;
	}
}
