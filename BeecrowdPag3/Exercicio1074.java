package BeecrowdPag3;

//Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida. Para cada valor lido, mostre uma mensagem em ingl�s dizendo se este valor lido � par (EVEN), �mpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri��o correta seja (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir apenas NULL.
//
//Entrada
//A primeira linha da entrada cont�m um valor inteiro N(N < 10000) que indica o n�mero de casos de teste. Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
//
//Sa�da
//Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras dever�o ser mai�sculas e sempre dever� haver um espa�o entre duas palavras impressas na mesma linha.
//


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1074
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		String resultado = "NULL";
		
		int entrada = input.nextInt();
		
		for (int x = 0; x < entrada; x++)
		{
			list.add(input.nextInt());
			if(list.get(x) == 0)
				resultado = "NULL";
			else if(list.get(x) %2 == 0 && list.get(x) != 0)
				resultado = "EVEN ";
			else if(list.get(x) %2 != 0 && list.get(x) != 0)
				resultado = "ODD ";
			if(list.get(x) > 0)
				resultado += "POSITIVE";
			else if(list.get(x) < 0)
				resultado += "NEGATIVE";
			
			System.out.println(resultado);	
			
			
		}
		

	}

}
