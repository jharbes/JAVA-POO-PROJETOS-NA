import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account c1 = new Account(1001, "Alex", 0.0);
		BusinessAccount bc1 = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING, fazer um objeto de uma superclasse receber o objeto de uma
		// subclasse conforme abaixo:

		Account c2 = bc1;

		System.out.println(c2.getBalance());
		System.out.println(c2);

		Account c3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account c4 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		// DOWNCASTING, fazer um objeto de uma subclasse receber um objeto de uma
		// superclasse (inverso de upcasting):

		BusinessAccount c5 = (BusinessAccount) c3;
		c5.loan(100.0);

		// Opera��o abaixo n�o � permitida, embora o compilador n�o gere erro, pois c4 �
		// uma SavingsAccount e nao pode ser convertida para BusinessAccount pois
		// SavingsAccount N�O � uma BusinessAccount

		// BusinessAccount c6=(BusinessAccount)c4; ****

		// Precisamos primeiramente testar se o objeto faz parte da classe
		// BusinessAccount, para isso utilizaremos o instanceof conforme segue abaixo:
		
		if (c4 instanceof BusinessAccount) {
			BusinessAccount c6=(BusinessAccount)c4;
			c6.loan(200.0);
		} 
		else if (c4 instanceof SavingsAccount) {
			SavingsAccount c6=(SavingsAccount)c4;
			c6.updateBalance();
		}
		
	}

}
