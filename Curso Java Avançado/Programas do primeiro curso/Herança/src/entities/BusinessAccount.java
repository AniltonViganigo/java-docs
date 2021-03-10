package entities;

public class BusinessAccount extends Account {
// Declaramos que a "BusinessAccount é uma subclasse da Account. Usamos para isso o comando "extends" //"

	private Double loanLimit;

	// Geramos o construtor da subclasse. Obs: acrescentamos o comando "super();" para ter acesso a Superclass Account //
	public BusinessAccount() {
		super();
	}

	// Geramos os contrutores da subclass. OBS: incluimos os membros da Superclass //
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // os membros da Superclass são instanciados aqui//
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount + 10.0;
		}
	}

}
