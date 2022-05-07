package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1010
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int peca1, numPeca1, peca2, numPeca2;
		double valorPeca1, valorPeca2;
		
		peca1 = input.nextInt();
		numPeca1 = input.nextInt();
		valorPeca1 = input.nextDouble();
		peca2 = input.nextInt();
		numPeca2 = input.nextInt();
		valorPeca2 = input.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", ((numPeca1*valorPeca1)+(numPeca2*valorPeca2)));
		System.out.println("");
		
	}

}
