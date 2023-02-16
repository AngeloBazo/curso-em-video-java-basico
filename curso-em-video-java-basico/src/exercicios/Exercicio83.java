package exercicios;

import java.util.Arrays;

public class Exercicio83 {

	public static void main(String[] args) {
		
		int count;

		int vetor[] = new int[20];

		System.out.println("VETOR CRIADO ALEATÓRIAMENTE : ");
		
		for (count = 0; count < vetor.length; count++) {

			vetor[count] = (int) (0 + Math.random() * (99 - 0));

			System.out.println("Casa " + count + " tem o nº " + vetor[count]);

		}

		System.out.println(" ");
		System.out.println("VETOR ORDENADO : ");
				
		Arrays.sort(vetor);
		
		for (count = 0; count < vetor.length; count++) {
			
			System.out.println("Casa " + count + " tem o nº " + vetor[count]);
		}
		

	}

}
