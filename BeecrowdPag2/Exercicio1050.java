package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1050
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int ddd[] = {61,71,11,21,32,19,27,31}, num, cont = 0;
		String cidade[] = {"Brasilia","Salvador","Sao Paulo",
				"Rio de Janeiro","Juiz de Fora","Campinas","Vitoria","Belo Horizonte"};

		
		num = input.nextInt();
		
		for(int x = 0; x < 8; x++)
		{
			if(num == ddd[x])
				System.out.println(cidade[x]);
			else
				cont++;
		}
		if (cont == 8)
			System.out.println("DDD nao cadastrado");
		
	}

}
