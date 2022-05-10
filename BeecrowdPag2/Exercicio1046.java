package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1046
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int hInicial, hFinal, hora;
		
		hInicial = input.nextInt();
		hFinal = input.nextInt();
		
		hora = (24-hInicial)+hFinal;
		
		if(hInicial == hFinal)
			System.out.println("O JOGO DUROU 24 HORA(S)");
		else if(hInicial > hFinal)
			System.out.printf("O JOGO DUROU %d HORA(S)",hora,"\n");
		else
			System.out.printf("O JOGO DUROU %d HORA(S)",(hFinal-hInicial),"\n");
		
		input.close();

	}

}
