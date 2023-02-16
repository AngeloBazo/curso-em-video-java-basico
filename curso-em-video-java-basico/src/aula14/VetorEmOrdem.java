package aula14;

import java.util.Arrays;

public class VetorEmOrdem {

	public static void main(String[] args) {

		
		int num[] = {3,5,1,8,4,99,100,500,6};

		Arrays.sort(num);
		
		for (int valor: num) {

			System.out.print(valor + " - ");

		}

			
		
	}

}
