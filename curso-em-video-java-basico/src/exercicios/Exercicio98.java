package exercicios;

public class Exercicio98 {

	static int superSomador(int a, int b) {

		int superSs = 0;
		
		for (int count = a; count <=b; count++)	{
		
		superSs = superSs + count;
		
		}
		
		return superSs;
				
		}
		
				

	public static void main(String[] args) {

		int ss = superSomador(1, 6);

		System.out.println("Retorno da função (1,6) = " + ss );

		int dd = superSomador(15, 19);

		System.out.println("Retorno da função (15,19) = " + dd);

		
	}

}
