package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1017
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int tempo, kmH;
		double kmL = 12.0;
		
		tempo = input.nextInt();
		kmH = input.nextInt();
		
		
		System.out.printf("%.3f",(kmH*tempo)/kmL);
		System.out.println("");

	}

}
