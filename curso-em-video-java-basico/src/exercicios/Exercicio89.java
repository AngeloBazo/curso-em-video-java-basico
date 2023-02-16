package exercicios;

import java.util.Scanner;

public class Exercicio89 {

	static void gerador(String a, int b, int c) {
		
		System.out.println(" ");

		if (c == 1) {
			System.out.println("+++-----------------+++");
			for (int count = 0; count < b; count++) {
				System.out.println(a);
			}
			System.out.println("+++-----------------+++");
		}

		if (c == 2) {
			System.out.println("///-----------------///");
			for (int count = 0; count < b; count++) {
				System.out.println(a);
			}
			System.out.println("///-----------------///");
		}

		if (c == 3) {
			System.out.println("&&&-----------------&&&");
			for (int count = 0; count < b; count++) {
				System.out.println(a);
			}
			System.out.println("&&&-----------------&&&");
		}

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("1) BORDA: +++-----------------+++");
		System.out.println("2) BORDA: ///-----------------///");
		System.out.println("3) BORDA: &&&-----------------&&&");

		System.out.println(" ");
		
		System.out.print("Qual borda deseja ? Digite o nº: ");

		
		
		int bordaDigitada = teclado.nextInt();

		gerador("  Aprendendo JAVA !!!", 3, bordaDigitada);

	}

}
