package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1012
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a,b,c, pi=3.14159;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f", (a*c)/2);
		System.out.printf("\nCIRCULO: %.3f", (Math.pow(c, 2)*pi));
		System.out.printf("\nTRAPEZIO: %.3f", ((a+b)*c)/2);
		System.out.printf("\nQUADRADO: %.3f", (b*b));
		System.out.printf("\nRETANGULO: %.3f", (a*b));
		System.out.println("");
	}

}
