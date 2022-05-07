package BeecrowdPag1;

import java.util.Scanner;

public class Exercicio1008
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int funcCod, workHour;
		double hourPay;
		
		funcCod = input.nextInt();
		workHour = input.nextInt();
		hourPay = input.nextDouble();
		
		System.out.printf("NUMBER = " + funcCod + "\nSALARY = U$ %.2f", (workHour*hourPay));
		System.out.println("");

	}

}
