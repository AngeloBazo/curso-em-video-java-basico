package exercicios;

import java.util.Arrays;

public class Exercicio71 {

	public static void main(String[] args) {

		int num[] = new int[7];

		Arrays.fill(num, 999); // preenche todas as casas do vetor com o n 999

		for (int valor : num) {

			System.out.print(valor + " - ");

		}

		System.out.println(" - ");
		
		int count;
		
		for (count = 0; count <=7; count++) {

			System.out.print(count + " - ");
		}

	}

}
