package exercicios;

public class Exercicio46 {

	public static void main(String[] args) {

		int count, totalValores;

		totalValores = 0;

		for (count = 6; count <= 100 ; count += 2) {

			System.out.println(count);

			totalValores = totalValores + count;

		}

		System.out.println("A soma dos valores é : " + totalValores);

	}

}
