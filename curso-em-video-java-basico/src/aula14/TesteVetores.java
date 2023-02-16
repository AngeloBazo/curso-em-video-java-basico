package aula14;

public class TesteVetores {

	public static void main(String[] args) {

		int n[] = { 5, 2, 9, 10, 50, 999 };

		int count;

		for (count = 0; count < 6; count++) {

			System.out.print(n[count] + " - ");

		}

		// pode ser assim tb

		System.out.println(" ");
		System.out.println(" ------------------------- ");

		int v[] = new int[4];

		v[0] = 0;
		v[1] = 1;
		v[2] = 2;
		v[3] = 3;

		for (count = 0; count < 4; count++) {

			System.out.print(v[count] + " - ");

		}

		System.out.println(" ");
		System.out.println(" ------------------------- ");

		// assim com length (é um atributo)

		int z[] = { 1, 7, 10, 99, 66, 105 };

		System.out.println("Total de casas do vetor Z : " + z.length);

		System.out.println(" ");

		for (count = 0; count < n.length; count++) {

			System.out.print(z[count] + " - ");

		}

	}

}
