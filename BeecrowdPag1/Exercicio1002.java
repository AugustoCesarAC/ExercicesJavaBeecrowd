package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1002
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double n = 3.14159;
		double raio;
		raio = input.nextDouble();
		raio = raio*raio*n;
		System.out.printf("A=%.4f",raio);
		System.out.println("");
	}

}
