
public class Aluno {
	public String nome;
	double n1,n2,n3;
	
	public void status() {
		System.out.printf("FINAL GRADE = %.2f%n",n1+n2+n3);
		System.out.printf((n1+n2+n3)>60?"PASS":"FAILED%nMISSING %.2f POINTS",60-(n1+n2+n3));
	}
}
