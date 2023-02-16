package aula15;

public class TesteMetodos {

	static void soma(int a, int b) {

		int s = a + b;

		System.out.println("Soma de " + a + " + " + b + " é igual a " + s);
		System.out.println(" ");
		
	}

	public static void main(String[] args) {

		soma(5, 2);

		soma(8, 80);

		soma(5000, 6);

	}

}
