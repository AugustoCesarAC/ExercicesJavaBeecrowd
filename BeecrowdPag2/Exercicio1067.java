package BeecrowdPag2;

import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.
//
//Entrada
//O arquivo de entrada cont�m 1 valor inteiro qualquer.
//
//Sa�da
//Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso.

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
