package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1021
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int quantCedula, listCedula[] = {100,50,20,10,5,2};
		int quantMoeda;
		double dinheiro, listMoeda[] = {1, 0.50, 0.25, 0.10, 0.05, 0.01}; 
		
		dinheiro = input.nextDouble();
		
		System.out.println("NOTAS:");
		
		for(int posicao = 0; posicao < listCedula.length; posicao++)
		{
			quantCedula = (int) (dinheiro/listCedula[posicao]);
			dinheiro = dinheiro-(quantCedula*listCedula[posicao]);
			System.out.println(quantCedula + " nota(s) de R$ "+ listCedula[posicao] + ".00");
		}
		
		System.out.println("MOEDAS:");
		
		dinheiro *= 100;
		
		for(int posicao = 0; posicao < listMoeda.length; posicao ++)
		{
			quantMoeda = (int) (dinheiro/(listMoeda[posicao]*100));
			dinheiro = dinheiro-(quantMoeda*(listMoeda[posicao]*100));
			System.out.printf(quantMoeda + " moeda(s) de R$ %.2f%n", listMoeda[posicao]);
		}

	}

}
