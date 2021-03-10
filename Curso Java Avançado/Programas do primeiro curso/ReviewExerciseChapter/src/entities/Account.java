package entities;

public class Account {

	private final double TAXA = 5.0;
	private String usuario;
	private double saldoConta;
	private int numeroConta;

	public Account(String usuario, int numeroConta) {
		this.usuario = usuario;
		this.numeroConta = numeroConta;
	}

	public Account(String usuario, double depositoInicial, int numeroConta) {
		this.usuario = usuario;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void deposito(double montante) {
		saldoConta += montante;
	}

	public void saque(double montante) {
		saldoConta -= montante + TAXA;
	}

	public String toString() {
		return "Conta " 
				+ numeroConta 
				+ ", Titular da conta: " 
				+ usuario + ", Saldo atual: R$"
				+ String.format("%.2f", saldoConta);
	}
}
