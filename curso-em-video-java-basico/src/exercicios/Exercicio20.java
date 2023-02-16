package exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner (System.in);
		
		System.out.print("Digite um n inteiro : ");
		
		int parImpar = numero.nextInt();
	
		
		if (parImpar % 2 == 0) {
		
		System.out.print(parImpar + " é um nº PAR");
				
		} else
		
			System.out.print(parImpar + " é um nº IMPAR");
	
		
	}

}
