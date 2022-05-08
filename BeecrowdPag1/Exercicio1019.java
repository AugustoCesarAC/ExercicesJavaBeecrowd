package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1019
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int segundos;
		
		segundos = input.nextInt();
		
		System.out.println((segundos/3600) + ":" + ((segundos%3600)/60) + ":" + ((segundos%3600)%60));

	}

}
