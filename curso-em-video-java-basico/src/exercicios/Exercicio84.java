package exercicios;

import java.util.Scanner;

public class Exercicio84 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String vetorNome[] = new String[4];

		int vetorIdade[] = new int[4];

		int count;

		for (count = 0; count < vetorNome.length; count++) {

			System.out.print("Seu nome : ");

			String nomeDigitado = teclado.next();

			vetorNome[count] = nomeDigitado;

			System.out.print("Idade : ");

			int idadeDigitada = teclado.nextInt();

			vetorIdade[count] = idadeDigitada;

		}

		System.out.println(" ");

		System.out.println("VETOR COMPLETO : ");

		for (count = 0; count < vetorNome.length; count++) {

			System.out.println("Nome: " + vetorNome[count] + "	 - 	Idade : " + vetorIdade[count]);

		}

		System.out.println(" ");

		System.out.println("MENORES DE 18 ANOS : ");

		for (count = 0; count < vetorNome.length; count++) {

			if (vetorIdade[count] < 18) {

				System.out.println("Nome: " + vetorNome[count] + "	 - 	Idade : " + vetorIdade[count]);

			}
		}

	}

}
