package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio80 {

	public static void main(String[] args) {

		int count;

		int vetor[] = new int[30];

		for (count = 0; count < vetor.length; count++) {

			vetor[count] = (int) (1 + Math.random() * (15 - 1));

			System.out.println("Na casa " + count + " do vetor temos o nº " + vetor[count]);

		}

		System.out.println(" -------------------------------- ");

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero inteiro entre 1 e 15 :");

		int nDigitado = teclado.nextInt();

		System.out.println("O n digitado foi : " + nDigitado);

		int qtVezesNdigitado = 0;

		for (count = 0; count < vetor.length; count++) {

			if (nDigitado == vetor[count]) {
				qtVezesNdigitado = qtVezesNdigitado + 1;
			}

			if (nDigitado == vetor[count]) {
				System.out.println("O n digitado encontra-se na casa " + count + " do vetor");
			
			} 

		}

		System.out.println("O n digitado apareceu " + qtVezesNdigitado + " vezes no vetor");

	}
}
