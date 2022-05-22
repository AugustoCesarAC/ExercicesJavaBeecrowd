package BeecrowdPag2;
//Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.
//
//Entrada
//O arquivo de entrada contém 5 valores inteiros quaisquer.
//
//Saída
//Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1065
{

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int a, cont = 0;
		
		for(int x = 0; x < 5; x++)
		{
			list.add(a = input.nextInt());
			if(list.get(x)%2 == 0)
				cont++;
		}
		System.out.println(cont + " valores pares");
		

	}

}
