package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1036
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a,b,c, delta;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		delta = (b*b)-(4*a*c);
		
		if(a == 0 || delta < 0)
			System.out.println("Impossivel calcular");
		else
		{
			delta = Math.sqrt(delta);
			
			System.out.printf("R1 = %.5f%n",((b*-1) + delta) / (2*a));
			System.out.printf("R2 = %.5f%n",((b*-1) - delta) / (2*a));
		}

	}

}
