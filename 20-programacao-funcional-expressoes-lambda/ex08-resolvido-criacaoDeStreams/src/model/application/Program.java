package model.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream(); // transformando list em stream
		
		st1 = list.stream().map(x -> x * 10); // transformando list em stream e depois aplicando a funcao map, a funcao
												// map aplica uma funcao a cada elemento da stream
		
		System.out.println(st1); // impressao sem formatacao
		
		System.out.println(Arrays.toString(st1.toArray())); // imprimindo a stream (a operacao toArray converte a stream
															// em um vetor)

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
