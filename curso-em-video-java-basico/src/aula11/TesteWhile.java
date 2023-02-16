package aula11;

public class TesteWhile {

	public static void main(String[] args) {
		
		int x = 10;
		
		int y = 20;
		
		while (x < 20) {
			
			x++;
							
			if (x == 15) {
				
				continue; // faz pular o n 15
				
			}


			if (x == 18) {
				
				break; // encerra o laço no n 18
				
				
			}
			
			
			
			System.out.println("N >> " + x);
			
		}
		
		
	}

}
