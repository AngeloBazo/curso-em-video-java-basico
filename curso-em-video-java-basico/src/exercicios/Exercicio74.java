package exercicios;

public class Exercicio74 {

	public static void main(String[] args) {
			
		int vetor [] = new int [9];
				
		for (int count = 0; count <vetor.length; count++) {
			
			if (count % 2 == 0) {
			vetor [count] = 5;
			} else
				vetor [count] = 3;
			


		}

		for (int count = 0; count <vetor.length; count++) {
		System.out.print(vetor[count] + " - ");
		}
	
		
		
	}

}
