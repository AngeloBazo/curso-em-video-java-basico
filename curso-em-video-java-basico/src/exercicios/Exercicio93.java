package exercicios;

import java.util.Scanner;

public class Exercicio93 {

	static void contador(int a, int b, int c) {

		for (int count = a; count <= b; count += c) {

			System.out.print(count + " - ");
		}
		
		System.out.print("FIM!");
		
	}

	
		

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Início : ");

		int inicio = teclado.nextInt();

		System.out.print("Fim : ");

		int fim = teclado.nextInt();

		System.out.print("Incremento : ");

		int incremento = teclado.nextInt();

		contador(inicio, fim, incremento);

	}

}
