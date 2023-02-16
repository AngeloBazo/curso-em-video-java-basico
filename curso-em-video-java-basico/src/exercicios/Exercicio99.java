package exercicios;

public class Exercicio99 {

	static int potencia(int base, int expoente) {

		int resultPotencia = (int) Math.pow(base, expoente);

		return resultPotencia;

	}

	public static void main(String[] args) {

		int resultado = potencia(5, 4);

		System.out.println("Resultado no main : " + resultado);

	}

}
