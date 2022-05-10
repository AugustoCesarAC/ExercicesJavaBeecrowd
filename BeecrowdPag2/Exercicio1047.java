package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1047
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int hI, mI;
		int hF, mF;
		int minI, minF;
		int difFinalMaiorInicial, difInicialMaiorFinal;
		
		hI = input.nextInt();
		mI = input.nextInt();
		
		hF = input.nextInt();
		mF = input.nextInt();
		
		minI = (60*hI) + mI;
		minF = (60*hF) + mF;
		
		difInicialMaiorFinal = ((24*60)-minI)+minF;
		difFinalMaiorInicial = minF-minI;
		
		if(minI == minF)
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else if(minI > minF)
			System.out.println("O JOGO DUROU "+(difInicialMaiorFinal/60)+" HORA(S) E "+(difInicialMaiorFinal%60)+" MINUTO(S)");
		else
			System.out.println("O JOGO DUROU "+(difFinalMaiorInicial/60)+" HORA(S) E "+(difFinalMaiorInicial%60)+" MINUTO(S)");
		
		input.close();
		

	}

}
