package entities;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void withdraw(Double amount) {
		this.balance=this.getBalance()-amount;
		System.out.println("WITHDRAW VALUE: -$"+String.format("%.2f",amount));
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}
	
}
