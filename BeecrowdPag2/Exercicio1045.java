package BeecrowdPag2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1045
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a,b,c;
		double lstTria[] = new double[3], newLstTria[] = new double[3];
		
		for(int x = 0; x < 3; x++)
			lstTria[x] = input.nextDouble();
		
		Arrays.sort(lstTria);
		
		newLstTria[0] = lstTria[2];
		newLstTria[1] = lstTria[1];
		newLstTria[2] = lstTria[0];
		
		a = Math.pow(newLstTria[0], 2);
		b = Math.pow(newLstTria[1], 2);
		c = Math.pow(newLstTria[2], 2);
				
		if(newLstTria[0] >= (newLstTria[1] + newLstTria[2]))
				System.out.println("NAO FORMA TRIANGULO");
		else if(a == b+c)
			System.out.println("TRIANGULO RETANGULO");
		else if(a > b+c) 
			System.out.println("TRIANGULO OBTUSANGULO");
		else if(a < b+c)  
			System.out.println("TRIANGULO ACUTANGULO");
		
		if(a == b && b == c)
			System.out.println("TRIANGULO EQUILATERO");
		else if (a == b || b == c || c == a)
			System.out.println("TRIANGULO ISOSCELES");
	}

}
