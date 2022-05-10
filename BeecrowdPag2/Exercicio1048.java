package BeecrowdPag2;

import java.util.Scanner;

public class Exercicio1048
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double salary;
		
		salary = input.nextDouble();
		
		if(salary<=400)
		{
			System.out.printf("Novo salario: %.2f%n",(salary*0.15)+salary);
			System.out.printf("Reajuste ganho: %.2f%n",(salary*0.15));
			System.out.println("Em percentual: 15 %");
		}
		else if(salary<=800)
		{
			System.out.printf("Novo salario: %.2f%n",(salary*0.12)+salary);
			System.out.printf("Reajuste ganho: %.2f%n",(salary*0.12));
			System.out.println("Em percentual: 12 %");
		}
		else if(salary<=1200)
		{
			System.out.printf("Novo salario: %.2f%n",(salary*0.10)+salary);
			System.out.printf("Reajuste ganho: %.2f%n",(salary*0.10));
			System.out.println("Em percentual: 10 %");
		}
		else if(salary<=2000)
		{
			System.out.printf("Novo salario: %.2f%n",(salary*0.07)+salary);
			System.out.printf("Reajuste ganho: %.2f%n",(salary*0.07));
			System.out.println("Em percentual: 7 %");
		}
		else if(salary>2000)
		{
			System.out.printf("Novo salario: %.2f%n",(salary*0.04)+salary);
			System.out.printf("Reajuste ganho: %.2f%n",(salary*0.04));
			System.out.println("Em percentual: 4 %");
		}

	}

}
