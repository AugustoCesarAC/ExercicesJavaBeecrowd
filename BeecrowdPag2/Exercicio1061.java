package BeecrowdPag2;

/*
Pedrinho est� organizando um evento em sua Universidade. O evento dever� ser no m�s de Abril, iniciando e terminando dentro do m�s. O problema � que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a v�rios dias, voc� dever� ajudar Pedrinho a calcular a dura��o deste evento.

Entrada
Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o e o dia do m�s no qual o evento vai come�ar. Na linha seguinte, ser� informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haver� outra informa��o no mesmo formato das duas primeiras linhas, indicando o t�rmino do evento.

Sa�da
Na sa�da, deve ser apresentada a dura��o do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem dura��o m�nima de 1 minuto.

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
