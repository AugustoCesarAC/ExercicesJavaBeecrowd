package BeecrowdPag2;

import java.util.ArrayList;
import java.util.Scanner;

//Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos n�meros impares entre eles.
//
//Entrada
//O arquivo de entrada cont�m dois valores inteiros.
//
//Sa�da
//O programa deve imprimir um valor inteiro. Este valor � a soma dos valores �mpares que est�o entre os valores fornecidos na entrada que dever� caber em um inteiro.
//


public class Exercicio1071
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int a = input.nextInt(), b = input.nextInt();
		
		int soma = 0;
		
		while(a > b)
		{
			list.add(b);
			b++;
		}
		while(b > a)
		{
			list.add(a);
			a++;
		}
		
		list.remove(0);
		
		for(int x = 0; x < list.size(); x++)
			if(list.get(x)%2 != 0)
				soma+=list.get(x);
		
		System.out.println(soma);

	}

}
