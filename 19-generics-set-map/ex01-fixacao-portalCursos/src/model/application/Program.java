package model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.application.entities.Curso;
import model.application.entities.Professor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner teclado = new Scanner(System.in);

		Set<Integer> setCursoA = new HashSet<>();
		System.out.print("How many students for course A? ");
		Integer numAlunos = teclado.nextInt();
		for (int i = 1; i <= numAlunos; i++) {
			Integer idAluno = teclado.nextInt();
			setCursoA.add(idAluno);
		}
		
		Set<Integer> setCursoB = new HashSet<>();
		System.out.print("How many students for course A? ");
		numAlunos = teclado.nextInt();
		for (int i = 1; i <= numAlunos; i++) {
			Integer idAluno = teclado.nextInt();
			setCursoB.add(idAluno);
		}

		teclado.close();
	}

}
