package aula06;

import java.util.Scanner;

public class NotaExemplo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
	
	System.out.print("Seu nome � : ");
	String nome = teclado.nextLine();
	
	System.out.print("Sua nota � : ");
	float nota = teclado.nextFloat();
				
	
	
	System.out.print("Seu nome � " + nome + " e sua nota � " + nota);
	
	System.out.println();		
	
	System.out.println("Sua nota � " + nota);
		
	System.out.printf("Sua nota � " + nota );
	
	System.out.println();
	
	System.out.format("Sua nota � " + nota);
	

	}

}
