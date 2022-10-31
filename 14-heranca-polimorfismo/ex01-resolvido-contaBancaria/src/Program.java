import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account c1=new Account(1001,"Alex",0.0);
		BusinessAccount bc1=new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING, fazer um objeto de uma superclasse receber o objeto de uma subclasse conforme abaixo:
		
		Account c2=bc1;
		
		System.out.println(c2.getBalance());
		System.out.println(c2);
		
		Account c3=new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account c4=new SavingsAccount(1004, "Ana", 0.0, 0.01);
	}

}
