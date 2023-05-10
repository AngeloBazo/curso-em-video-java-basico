package exercicios;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String pedra = "pedra";
		String papel = "papel";
		String tesoura = "tesoura";

		System.out.println("Jogador 1: ");

		String jogador1 = teclado.next();

		System.out.println("Jogador 2: ");

		String jogador2 = teclado.next();

		if ((jogador1.equalsIgnoreCase(pedra)) && (jogador2.equalsIgnoreCase(pedra))) {

			System.out.println("*** Empate *** ");

		} else if ((jogador1.equalsIgnoreCase(pedra)) && (jogador2.equalsIgnoreCase(papel))) {

			System.out.println("*** Jogador 2 com papel ganha *** ");

		} else if ((jogador1.equalsIgnoreCase(pedra)) && (jogador2.equalsIgnoreCase(tesoura))) {

			System.out.println("*** Jogador 1 com pedra ganha *** ");

		}

		if ((jogador1.equalsIgnoreCase(papel)) && (jogador2.equalsIgnoreCase(papel))) {

			System.out.println("*** Empate *** ");

		} else if ((jogador1.equalsIgnoreCase(papel)) && (jogador2.equalsIgnoreCase(pedra))) {

			System.out.println("*** Jogador 1 com papel ganha *** ");

		} else if ((jogador1.equalsIgnoreCase(papel)) && (jogador2.equalsIgnoreCase(tesoura))) {

			System.out.println("*** Jogador 2 com tesoura ganha *** ");

		}

		if ((jogador1.equalsIgnoreCase(tesoura)) && (jogador2.equalsIgnoreCase(tesoura))) {

			System.out.println("*** Empate *** ");

		} else if ((jogador1.equalsIgnoreCase(tesoura)) && (jogador2.equalsIgnoreCase(pedra))) {

			System.out.println("*** Jogador 2 com pedra ganha *** ");

		} else if ((jogador1.equalsIgnoreCase(tesoura)) && (jogador2.equalsIgnoreCase(papel))) {

			System.out.println("*** Jogador 1 com tesoura ganha *** ");

		} else
			System.out.println("--- Inválido ---");

	}

}
