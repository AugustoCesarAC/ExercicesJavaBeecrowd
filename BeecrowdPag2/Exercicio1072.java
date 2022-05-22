package BeecrowdPag2;

import java.util.ArrayList;
import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
//
//Entrada
//A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
//Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
// 
//
//Saída
//Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
//



public class Exercicio1072
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int in = 0, out = 0, qnt = input.nextInt();
		
		for(int x = 0; x < qnt; x++)
		{
			list.add(input.nextInt());
			if(list.get(x) >= 10 && list.get(x) <= 20)
				in++;
			else
				out++;
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		

	}

}
