package BeecrowdPag2;



//Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
//
//Entrada
//A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.
//
//Saída
//O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

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
