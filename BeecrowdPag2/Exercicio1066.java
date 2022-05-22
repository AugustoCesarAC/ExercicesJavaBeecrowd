package BeecrowdPag2;

//Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.
//
//Entrada
//O arquivo de entrada contém 5 valores inteiros quaisquer.
//
//Saída
//Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.



import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1066
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int pos = 0, neg = 0, par = 0, imp = 0;
		
		for(int x = 0; x < 5; x++)
		{
			list.add(input.nextInt());
			if(list.get(x)%2 == 0)
				par++;
			else
				imp++;
			if(list.get(x) > 0)
				pos++;
			else if(list.get(x) < 0)
				neg++;
		}
		
		System.out.println(par+" valor(es) par(es)\r\n"
				+ imp + " valor(es) impar(es)\r\n"
				+ pos + " valor(es) positivo(s)\r\n"
				+ neg + " valor(es) negativo(s)");

	}

}
