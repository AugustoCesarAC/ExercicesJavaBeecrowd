package BeecrowdPag2;



//Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na pr�xima linha, deve-se mostrar a m�dia de todos os valores positivos digitados, com um d�gito ap�s o ponto decimal.
//
//Entrada
//A entrada cont�m 6 n�meros que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes n�meros ser� positivo.
//
//Sa�da
//O primeiro valor de sa�da � a quantidade de valores positivos. A pr�xima linha deve mostrar a m�dia dos valores positivos digitados.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1064
{

	public static void main(String[] args)
	{
		ArrayList<Double> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int pos=0;
		double media = 0;
		
		for(int x = 0; x < 6; x++)
		{
			list.add(input.nextDouble());
			if(list.get(x) > 0)
			{
				pos++; 
				media+=list.get(x);
			}
		}
		
		System.out.println(pos + " valores positivos");
		System.out.printf("%.1f%n", media/pos);

	}

}
