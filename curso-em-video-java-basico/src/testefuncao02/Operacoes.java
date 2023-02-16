package testefuncao02;

public class Operacoes {

	public static int contador(int i, int f) {

		int count;

		for (count = i; count <= f; count++) {

			System.out.print(count + " ");

		}

		return count;

	}

	public static int contador2(int i, int f) {

		int count2 = i + f;

		return count2;

	}

}
