package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1042
{

	public static void main(String[] args)
	{
		int listLength = 3;
		int chave, troca, posicao;
		Scanner input = new Scanner(System.in);
		
		//listLength = input.nextInt();
		
		int[] vetor2 = new int[listLength];
		int[] vetor = new int[listLength];
		
		for (posicao = 0; posicao < vetor.length; posicao++)
		{
			vetor[posicao] = input.nextInt();
			vetor2[posicao] = vetor[posicao];
		}
				
		for (posicao = 0; posicao < vetor.length; posicao++)
		{
			chave = vetor[posicao];
			troca = posicao - 1;
			while (troca >= 0 && vetor[troca] > chave)
			{
				vetor[troca+1] = vetor[troca];
				troca = troca-1;
			}
			vetor[troca+1] = chave;
		}
		
		for (posicao = 0; posicao < vetor.length; posicao++)
			System.out.println(vetor[posicao]);
		
		System.out.println("");
		for (posicao = 0; posicao < vetor.length; posicao++)
			System.out.println(vetor2[posicao]);
		

	}

}
