package aula14;

import java.util.Arrays;

public class TesteVetorDecrescente {

	public static void main(String[] args) {

		int valor[] = new int[20];

		for (int i = 0; i < valor.length; i++) {

			valor[i] = valor.length - i;

			System.out.print(valor[i] + " - ");

		}

	}

}
