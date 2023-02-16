package aula10;

import java.util.Scanner;

public class TesteSwitch {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Quantas pernas ? : ");

		int pernas = teclado.nextInt();

		switch (pernas) {

		case 1:
			System.out.println("caso 1");
			break;
		case 2:
			System.out.println("caso 2");
			break;
		case 3:
			System.out.println("caso 3");
			break;
		default:
			System.out.println("OUTROS CASOS");
		}

	}

}
