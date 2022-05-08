package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1015
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;
		double dis;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		dis = (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		dis = Math.sqrt(dis);
		
		System.out.printf("%.4f",dis);
		System.out.println("");
	}

}
