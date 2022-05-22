package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1051
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double dinheiro = input.nextDouble();
		
		if(dinheiro > 4500)
			System.out.printf("R$ %.2f%n", ((dinheiro-4500)*0.28)+(999.99*0.08)+(1499.99*0.18));
		else if(dinheiro > 3000 && dinheiro <= 4500)
			System.out.printf("R$ %.2f%n", (999.99*0.08)+((dinheiro - 3000)*0.18));
		else if(dinheiro > 2000 && dinheiro <= 3000)
			System.out.printf("R$ %.2f%n", ((dinheiro - 2000)*0.08));
		else
			System.out.println("Isento");

	}

}
