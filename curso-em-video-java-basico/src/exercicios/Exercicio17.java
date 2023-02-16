package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner velocidade = new Scanner (System.in);
		
		System.out.print("Velocidade do carro : ");
		
		int velocidadeDoCarro = velocidade.nextInt();
		
		if (velocidadeDoCarro > 80) {
				
			System.out.println("\nA velocidade da via é 80km/h; \n\nVocê foi multado, pois estava a " + velocidadeDoCarro + "km/h");
					
		}
		
		System.out.println("");
		
		double valorDaMulta;
		
		valorDaMulta = (velocidadeDoCarro - 80)* 5;
		
				System.out.println("O valor da multa é : R$"+valorDaMulta);
				
		
		
		
		
		
		
	}

}
