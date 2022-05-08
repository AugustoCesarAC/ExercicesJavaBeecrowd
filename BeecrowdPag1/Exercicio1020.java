package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1020
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int dias;
		
		dias = input.nextInt();
		
		System.out.println((dias/365) + " ano(s)\n" + ((dias%365)/30) + " mes(es)\n" + ((dias%365)%30) + " dia(s)");

	}

}
