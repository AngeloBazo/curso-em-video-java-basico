package exercicios;

import java.util.Scanner;

public class Exercicio63 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x, somaDosValores, menorValorDigitado, contador, totalDePares;

		somaDosValores = 0;
		menorValorDigitado = 9999999;
		contador = 0;
		totalDePares = 0;

		do {

			System.out.print("Digite um N inteiro : ");
			int nDigitado1 = scan.nextInt();

			somaDosValores = somaDosValores + nDigitado1;

			contador++;

			if (menorValorDigitado > nDigitado1) {
				menorValorDigitado = nDigitado1;
			}

			if (nDigitado1 % 2 == 0) {
				totalDePares++;
			}

			System.out.println("Deseja digitar outro número ? Digite :\n (1) para SIM\n (2) para não ");
			int opcaoSn = scan.nextInt();
			x = opcaoSn;

		}

		while (x == 1);

		System.out.println("A soma de todos os valores digitados é : " + somaDosValores);

		System.out.println("O menor valor digitado foi : " + menorValorDigitado);

		System.out.println("A média dos valores digitados é : " + (somaDosValores / contador));

		System.out.println("O total de n pares digitados é : " + totalDePares);

	}

}
