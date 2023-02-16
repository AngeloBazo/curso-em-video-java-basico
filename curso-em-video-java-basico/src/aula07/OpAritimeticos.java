package aula07;

public class OpAritimeticos {

	public static void main(String[] args) {
		
		double a, b, x, y, count;
		
		
		x = 10.9;
	
		System.out.println(x);
			
		//y = (int) (1 + Math.random() * (10-1));	// sortear n aleatório de 1 a 10
	
		y = (6 + Math.random()); 
		
	System.out.println(y + " oi");
	
	
	
		System.out.println("");
			
		System.out.println("a = 10 ; b = 3");
	
		
		a = 10;
		b = 3;
		a += b; // a = a + b 

		System.out.println("");
		System.out.println("a += b; // a = a + b   " + a);

		a = 10;
		b = 3;
		a -= b; // a = a - b
		System.out.println("");
		System.out.println("a -= b; // a = a - b   " + a);

		a = 10;
		b = 3;
		a *= b; // a = a * b
		System.out.println("");
		System.out.println("a *= b; // a = a * b   " + a);

		a = 10;
		b = 3;
		a /= b; // a = a / b
		System.out.println("");
		System.out.println("a /= b; // a = a / b   " + a);

		a = 10;
		b = 3;
		a %= b; // a = a % b
		System.out.println("");
		System.out.println("a %= b; // a = a % b   " + a);
	
	}

}
