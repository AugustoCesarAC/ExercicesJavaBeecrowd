package BeecrowdPag2;

//Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
//
//Entrada
//A entrada ser� um valor inteiro positivo.
//
//Sa�da
//A sa�da ser� uma sequ�ncia de seis n�meros �mpares.



import java.util.Scanner;

public class Exercicio1070
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for (int x = a; x <= a+11; x++)
			if(x%2 != 0)
				System.out.println(x);


	}

}
