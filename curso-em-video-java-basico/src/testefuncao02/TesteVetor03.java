package testefuncao02;

public class TesteVetor03 {

	public static void main(String[] args) {
 
		int vetor[] = { 1, 3, 5, 6 };

		int vetor2[] = new int[10];

		for (int count = 0; count < vetor.length; count++) {

			System.out.println(vetor[count]);

		}

		System.out.println("--------------------------");

		for (int count = 0; count < vetor2.length; count++) {

			vetor2[count] = count;

			System.out.println(vetor2[count]);

		}

	}

}
