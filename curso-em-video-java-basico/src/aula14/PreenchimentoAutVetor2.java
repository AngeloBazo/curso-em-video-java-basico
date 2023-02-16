package aula14;

import java.util.Arrays;

public class PreenchimentoAutVetor2 {

	public static void main(String[] args) {

		int y;

		int count;

		int vetor[] = new int[10]; // cria vetor com [N] posições

		for (count = 0; count < vetor.length; count++) {

			y = (int) (1 + Math.random() * (500 - 1)); // sortear n aleatório de 1 a 10
			
			vetor[count] = y;
			
			System.out.println(vetor[count]);

		}

	}

}
