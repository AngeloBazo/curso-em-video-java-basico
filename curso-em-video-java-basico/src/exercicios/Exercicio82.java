package exercicios;

import java.util.Scanner;

public class Exercicio82 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double vetor[] = new double[3];

		int count;

		double somaNotas = 0, mediaTurma;

		for (count = 0; count < vetor.length; count++) {

			System.out.print("Nota do aluno : ");

			double notaAluno = teclado.nextDouble();

			vetor[count] = notaAluno;

			somaNotas = somaNotas + notaAluno;

		}

		mediaTurma = somaNotas / vetor.length;

		System.out.println("A média das notas é : " + mediaTurma);

		int acimaDaMedia = 0;
		double maiorNotaDigitada = 0;
		int posicaoMaiorNota = 0;

		for (count = 0; count < vetor.length; count++) {

			if (vetor[count] > mediaTurma) {

				acimaDaMedia++;

			}

			if (vetor[count] > maiorNotaDigitada) {

				maiorNotaDigitada = vetor[count];
				
				posicaoMaiorNota = count;

			}

		}

		System.out.print("Qtd alunos acima da média da turma  : " + acimaDaMedia);
		System.out.println(" ");
		System.out.print("Maior nota digitada  : " + maiorNotaDigitada);
		System.out.println(" ");
		System.out.print("Posição no vetor da maior nota digitada  : " + posicaoMaiorNota);

	}

}
