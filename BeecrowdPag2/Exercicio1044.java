package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1044
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(b%a==0 || a%b==0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");

	}

}
