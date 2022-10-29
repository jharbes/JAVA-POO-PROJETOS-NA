import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		Department d1=new Department(teclado.nextLine());
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String name=teclado.nextLine();
		
		System.out.print("Level: ");
		String level=teclado.nextLine();
		
		System.out.print("Base salary: ");
		Double baseSalary=teclado.nextDouble();
		
		Worker w1=new Worker(name,WorkerLevel.valueOf(level),baseSalary,d1);
		
		System.out.print("How many contracts to this worker? ");
		Integer numeroContratos=teclado.nextInt();
		
		Date date1=new Date();
		Integer day;
		Integer month;
		Integer year;
		Double valuePerHour;
		Integer duration;
		
		List<HourContract>=new List
		
		for (int i=0;i<numeroContratos;i++) {
			
		}
		
		
		teclado.close();
	}

}
