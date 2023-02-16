package exercicios;

import java.util.Scanner;

public class Exercicio85 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String vetorNome[] = new String[3];
		String vetorSexo[] = new String[3];
		double vetorSalario[] = new double[3];

		int count;

		String nomeDigitado;
		String sexoDigitado;
		double salarioDigitado = 0;

		for (count = 0; count < vetorNome.length; count++) {

			System.out.print("Nome : ");

			nomeDigitado = teclado.next();

			vetorNome[count] = nomeDigitado;

			System.out.print("Sexo (M/F) : ");

			sexoDigitado = teclado.next();

			vetorSexo[count] = sexoDigitado;

			System.out.print("Salário : ");

			salarioDigitado = teclado.nextDouble();

			vetorSalario[count] = salarioDigitado;

		}

		System.out.println(" ");
		System.out.println("> VETOR COMPLETO :  ");

		for (count = 0; count < vetorNome.length; count++) {

			System.out.print(vetorNome[count] + " 	- 	" + vetorSexo[count] + " 	- 	" + vetorSalario[count]);
			System.out.println(" ");

		}

		System.out.println("> VETOR MULHERES + 5 MIL :  ");

		for (count = 0; count < vetorNome.length; count++) {

			if (vetorSexo[count].equalsIgnoreCase("F") && vetorSalario[count] >= 5.000) {

				System.out.print(vetorNome[count] + " 	- 	" + vetorSexo[count] + " 	- 	" + vetorSalario[count]);

				System.out.println(" ");

			}
		}

	}

}
