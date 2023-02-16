package exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		int nSorteado = (int) (1 + Math.random()* (5-1));

		System.out.println("nSorteado : " + nSorteado);
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite o número sorteado entre 1 e 5 : ");
		
		int nDigitado = teclado.nextInt();
		
		
		
		
		if (nSorteado == nDigitado ) {
		
			System.out.print("Acertou !!!");

	} else { 

		System.out.print("NÃO acertou, tente novamente ! ");
	
	}
	}

		
		
}
