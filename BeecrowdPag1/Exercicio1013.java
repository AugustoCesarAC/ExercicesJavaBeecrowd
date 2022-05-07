package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1013
{

	public static void main(String[] args)
	{
		int chave, troca, posicao;
		Scanner input = new Scanner(System.in);
			
		int[] vetor = new int[3];
		
		for (posicao = 0; posicao < vetor.length; posicao++)
		{
			vetor[posicao] = input.nextInt();
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
		
			System.out.println(vetor[2] + " eh o maior");

	}

}
