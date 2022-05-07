package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1009
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String nome;
		double salaryFixed, bonus;
		
		nome = input.nextLine();
		salaryFixed = input.nextDouble();
		bonus = input.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f",(salaryFixed+(bonus*0.15)) );
		System.out.println("");


	}

}
