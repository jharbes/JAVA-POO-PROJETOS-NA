package model.application;

import java.util.Scanner;

import model.application.entities.Curso;
import model.application.entities.Professor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Professor professorAlex = new Professor(1, "Alex");

		Curso cursoA = new Curso("A", professorAlex);
		Curso cursoB = new Curso("B", professorAlex);
		Curso cursoC = new Curso("C", professorAlex);
		
		System.out.println(professorAlex);

		teclado.close();
	}

}
