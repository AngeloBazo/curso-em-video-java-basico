package exercicios;

public class Exercicio88 {

	static void gerador(String a, int b) {

		System.out.println("------------------");

		for (int count = 0; count < b; count++) {
			System.out.println(a);
		}

		System.out.println("------------------");

	}

	public static void main(String[] args) {

		gerador("Aprendendo Java !", 4);

	}

}
