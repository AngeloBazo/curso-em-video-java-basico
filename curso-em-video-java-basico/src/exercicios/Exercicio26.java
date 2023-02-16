package exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner (System.in);
		
		System.out.println("Digite n1 : ");
		
		int n1 = numero.nextInt();
				
		System.out.println("Digite n2 : ");
		
		int n2 = numero.nextInt();
		
		
		if (n1 > n2) {

			System.out.println("n1 é maior que n2");	
		
		} else if (n1 < n2) {
		
			System.out.println("n2 é maior que n1");
						
		}		else 
		
			System.out.println("n1 é igual a n2");
		

	}

}
