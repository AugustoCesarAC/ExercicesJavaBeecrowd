package BeecrowdPag2;

import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
//
//Entrada
//O arquivo de entrada contém 1 valor inteiro qualquer.
//
//Saída
//Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

public class Exercicio1067
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for (int x = 1; x <= a; x++)
			if(x%2 != 0)
				System.out.println(x);

	}

}
