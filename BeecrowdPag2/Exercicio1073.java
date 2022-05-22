package BeecrowdPag2;

import java.util.Scanner;

//Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso.
//
//Entrada
//A entrada contém um valor inteiro N (5 < N < 2000).
//
//Saída
//Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.
//
//Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.

public class Exercicio1073
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for (int x = 1; x <= a; x++)
			if(x%2 == 0)
				System.out.println(x+"^2 = " + x*x);

	}

}
