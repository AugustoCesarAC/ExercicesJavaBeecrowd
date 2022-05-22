package BeecrowdPag2;

/*
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

 */

import java.util.Scanner;

public class Exercicio1061
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] SdiaInicial = input.nextLine().split(" ");
        String[] ShoraInicial = input.nextLine().replaceAll(" ", "").split(":");
        String[] SdiaFinal = input.nextLine().split(" ");
        String[] ShoraFinal = input.nextLine().replaceAll(" ", "").split(":");
        int dI = Integer.parseInt(SdiaInicial[1])*86400;
        int hI = Integer.parseInt(ShoraInicial[0])*3600;
        int mI = Integer.parseInt(ShoraInicial[1]) * 60;
        int sI = Integer.parseInt(ShoraInicial[2]);
        int dF = Integer.parseInt(SdiaFinal[1])*86400;
        int hF = Integer.parseInt(ShoraFinal[0])*3600;
        int mF = Integer.parseInt(ShoraFinal[1]) * 60;
        int sF = Integer.parseInt(ShoraFinal[2]);
		
		int resDif;
		
		resDif = (dF+hF+mF+sF)-(dI+hI+mI+sI);
		
		System.out.println(resDif/86400 + " dia(s)");
		System.out.println((resDif%86400)/3600 + " hora(s)");
		System.out.println(((resDif%86400)%3600)/60 + " minuto(s)");
		System.out.println(((resDif%86400)%3600)%60 + " segundo(s)");

	}

}
