package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount<=this.getLoanLimit()) {
			this.balance=amount-10.0;
			System.out.println("DEPOSITO DE EMPRÉSTIMO EFETUADO NO VALOR DE +$"+String.format("%.2f",amount));
			System.out.println("DESCONTO DE TAXA NO VALOR DE -$10,00");
		} else
			System.out.println("VALOR DE EMPRÉSTIMO NÃO DISPONÍVEL.");
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", balance=" + balance + "]";
	}
	
}
