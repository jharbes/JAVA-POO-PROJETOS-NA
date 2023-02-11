package model.application;

import java.util.Arrays;

public class Program {

	public static int globalValue = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	// o comportamente do que acontece na funcao nao depende so do que acontece
	// dentro da funcao, na verdade depende de um valor externo (globalValue) por
	// isso dizemos que essa funcao nao tem transparecia referencial
	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}

}
