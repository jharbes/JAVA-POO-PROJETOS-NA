package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		System.out.println("SALDO ATUALIZADO DE JUROS EM +$"+String.format("%.2f",this.balance*this.getInterestRate())+"\n");
		this.balance+=this.balance*this.getInterestRate();
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", balance=" + balance + "]";
	}
	
}
