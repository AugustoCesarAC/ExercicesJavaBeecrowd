package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1014
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int km;
		double comGasto;
		
		km = input.nextInt();
		comGasto = input.nextDouble();
		
		System.out.printf("%.3f",(km/comGasto));
		System.out.println(" km/l");
	}

}
