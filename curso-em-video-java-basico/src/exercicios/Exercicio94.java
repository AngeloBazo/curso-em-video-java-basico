package exercicios;

import java.util.Scanner;

public class Exercicio94 {

	static void fibonacci(int a) {

		int n0 = 0;
		int n1 = 1;
		int n2;

		System.out.print(n0 + " >> ");

		for (int count = 0; count < a; count++) {

			n2 = n0 + n1;

			System.out.print(n2 + " >> ");

			n1 = n0;

			n0 = n2;

		}

		System.out.println("FIM !!!");
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite até qual termo deseja ver a sequência de Fibonacci : ");

		int nDigitado = teclado.nextInt();
		
		System.out.println("\nSequência : \n");

		fibonacci(nDigitado);

	}

}
