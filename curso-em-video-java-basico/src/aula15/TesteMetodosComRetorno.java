package aula15;

public class TesteMetodosComRetorno {

	static int soma(int a, int b) {

		int s = a + b;

		return s;
	}

	public static void main(String[] args) {

		int sm = soma(5, 2);
				
		System.out.println("A soma de 'a' + 'b' � igual a " + sm);

	}

}
