package exercicios;

import java.util.Scanner;

public class Exercicio100 {

	static double mediaAluno(double a, double b) {

		double media = (a + b) / 2;

		return media;

	}

	static double situacaoAluno(double mediaAluno10) {

		if (mediaAluno10 >= 7) {

			System.out.println("APROVADO !!!");

		} else if (mediaAluno10 >= 5 && mediaAluno10 < 7) {

			System.out.println("RECUPERA��O !!!");

		} else {

			System.out.println("REPROVADO !!!");

		}

		return mediaAluno10;

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("1� nota : ");
		double nota1 = teclado.nextDouble();

		System.out.print("2� nota : ");
		double nota2 = teclado.nextDouble();


		double sm = mediaAluno(nota1, nota2);

		System.out.println("A m�dia do aluno � : " + sm);
		
		situacaoAluno(sm);

	}

}