package lista_5_questao_4_conta;

public class Poucanca extends Conta{
	private int diasRendimento;
	
	public Poucanca(double saldo) {
		super(saldo);
	}
	
	public Poucanca(double saldo, int diasRendimento) {
		super(saldo);
		this.diasRendimento = diasRendimento;
	}

	public int getDiasRendimento() {
		return diasRendimento;
	}
	
	public void setDiasRendimento(int diasRendimento) {
		this.diasRendimento = diasRendimento;
	}
}