package BeecrowdPag2;

import java.util.Scanner;

//Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 at� N, inclusive N, se for o caso.
//
//Entrada
//A entrada cont�m um valor inteiro N (5 < N < 2000).
//
//Sa�da
//Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme o exemplo abaixo.
//
//Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da 1e+006 ao inv�s de 1000000 o que ocasionar� resposta errada. Neste caso, configure a precis�o adequadamente para que isso n�o ocorra.

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
