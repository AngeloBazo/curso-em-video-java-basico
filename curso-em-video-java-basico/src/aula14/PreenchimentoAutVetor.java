package aula14;

import java.util.Arrays;

public class PreenchimentoAutVetor {

	public static void main(String[] args) {

		int num[] = new int[5];

		Arrays.fill(num, 8); // preenche todas as casas do vetor com o n 8

		for (int valor : num) {

			System.out.print(valor + " - ");

		}

	}

}
