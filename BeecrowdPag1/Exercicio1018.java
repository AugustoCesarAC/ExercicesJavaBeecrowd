package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1018
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cedulas, quantidadeLista;
		int listCedula[] = {100,50,20,10,5,2,1};
		
		cedulas = input.nextInt();
		
		System.out.println(cedulas);
		
		for(int posicao = 0; posicao < listCedula.length; posicao++)
		{
			quantidadeLista = cedulas/listCedula[posicao];
			cedulas = cedulas-(quantidadeLista*listCedula[posicao]);
			System.out.println(quantidadeLista + " nota(s) de R$ "+ listCedula[posicao] + ",00");
		}

	}

}
