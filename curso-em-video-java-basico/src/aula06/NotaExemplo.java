package aula06;

import java.util.Scanner;

public class NotaExemplo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
	
	System.out.print("Seu nome é : ");
	String nome = teclado.nextLine();
	
	System.out.print("Sua nota é : ");
	float nota = teclado.nextFloat();
				
	
	
	System.out.print("Seu nome é " + nome + " e sua nota é " + nota);
	
	System.out.println();		
	
	System.out.println("Sua nota é " + nota);
		
	System.out.printf("Sua nota é " + nota );
	
	System.out.println();
	
	System.out.format("Sua nota é " + nota);
	

	}

}
