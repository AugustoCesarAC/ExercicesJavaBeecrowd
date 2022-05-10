package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1038
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double lstPre[] = {4,4.5,5,2,1.5};
		int cod, qnt;
		
		cod = input.nextInt();
		qnt = input.nextInt();
		
		System.out.printf("Total: R$ %.2f%n", (lstPre[cod-1]*qnt));

	}

}
