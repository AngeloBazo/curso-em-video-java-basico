package aula08;

public class OpTernario {

	public static void main(String[] args) {
		
		int n1, n2, maior;
		
		n1 = 10;
		n2 = 20;
		
		maior = n1 > n2 ? 14 : 50;
		
		System.out.println(maior);
		
		maior = n1 > n2 ? n1 : n2;
		
		System.out.println(maior);
		
		maior = n1 > n2 ? n1 - n2 : n2;
		
		System.out.println(maior);
		
		
		
		

	}

}
