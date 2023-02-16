package aula10;

import java.util.Scanner;

public class PainelElevadorSwitch {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o andar ");
		System.out.println("(1)   (2) ");
		System.out.println("(3)   (4) ");
		System.out.println("(5)   (6) ");

		int andar = teclado.nextInt();

		switch (andar) {

		case 1:
			System.out.println("Andar 1");
			
			break;
		case 2:
			System.out.println("Andar 2");
			System.out.println("Andar |");


			break;
		case 3:
			System.out.println("Andar 3");
			System.out.println("Andar |");
			System.out.println("Andar |");


			break;
		case 4:
			System.out.println("Andar 4");
			System.out.println("Andar |");
			System.out.println("Andar |");
			System.out.println("Andar |");


			break;
		case 5:
			System.out.println("Andar 5");
			System.out.println("Andar |");
			System.out.println("Andar |");
			System.out.println("Andar |");
			System.out.println("Andar |");


			break;
		case 6:
			System.out.println("Andar 6");
			System.out.println("Andar |");
			System.out.println("Andar |");
			System.out.println("Andar |");
			System.out.println("Andar |");
			System.out.println("Andar |");
			

			break;

		}

	}

}
