package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1037
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a;
		int lst[] = {0,25,50,75,100};
		
		a = input.nextDouble();
		
		if(a < 0 || a > 100)
			System.out.println("Fora de intervalo");
		else
		{
			for(int i = 0; i < lst.length; i++)
			{
				if ((a > lst[i]) && (a <= lst[i+1]) || (a == lst[i]) && (a == 0))
		            if (a == 0)
		            	System.out.println("Intervalo [" + lst[0] + "," + lst[1] + "]");
		            else if (a <= 25) 
		            	System.out.println("Intervalo [" + (lst[0]) + "," + lst[1] + "]");
		            else if (a == lst[i])
		            	System.out.println("Intervalo (" + lst[i-1] + "," + lst[i] + "]");   
		            else
		            	System.out.println("Intervalo (" + lst[i] + "," + lst[i+1] + "]");
			}
		}
	}

}
