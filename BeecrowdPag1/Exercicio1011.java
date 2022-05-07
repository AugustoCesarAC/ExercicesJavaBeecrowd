package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1011
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double R;
		
		R = input.nextDouble();
		System.out.printf("VOLUME = %.3f", (4/3.0*(3.14159*Math.pow(R, 3))));
		System.out.println("");

	}

}
