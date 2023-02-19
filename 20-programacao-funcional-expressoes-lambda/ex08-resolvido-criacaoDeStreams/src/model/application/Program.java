package model.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream(); // transformando list em stream (criando stream a partir de colecao)

		st1 = list.stream().map(x -> x * 10); // transformando list em stream e depois aplicando a funcao map, a funcao
												// map aplica uma funcao a cada elemento da stream

		System.out.println(st1); // impressao sem formatacao

		System.out.println(Arrays.toString(st1.toArray())); // imprimindo a stream (a operacao toArray converte a stream
															// em um vetor)

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // criando stream a partir de Stream.of()
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // primeiro argumento sera o primeiro elemento da stream e
																// os proximos serao de acordo com a regra pre definida
																// no segundo argumento

		System.out.println(Arrays.toString(st3.limit(10).toArray())); // usaremos a funcao limit pra limitar a saida
																		// pois a stream st3 criada acima é
																		// potencialmente infinita

		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
