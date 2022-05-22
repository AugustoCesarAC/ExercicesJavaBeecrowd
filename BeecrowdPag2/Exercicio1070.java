package BeecrowdPag2;

//Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
//
//Entrada
//A entrada será um valor inteiro positivo.
//
//Saída
//A saída será uma sequência de seis números ímpares.



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
