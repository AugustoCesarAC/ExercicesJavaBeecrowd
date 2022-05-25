package BeecrowdPag3;

//Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
//
//Entrada
//A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
//
//Saída
//Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
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
