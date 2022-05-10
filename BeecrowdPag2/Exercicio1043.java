package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1043
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a,b,c, bc, ac, ab;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		bc = Math.abs(b-c);
		ac = Math.abs(a-c);
		ab = Math.abs(a-b);
		
		if(bc < a && a < (b+c) && ac < b && a < (a+c) && ab < c && c < (b+a))
			System.out.printf("Perimetro = %.1f%n", (a+b+c));
		else
			System.out.printf("Area = %.1f%n", ((a+b)*c)/2);

	}

}
