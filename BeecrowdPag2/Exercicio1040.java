package BeecrowdPag2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1040
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");
		double n1, n2, n3, n4, exame, media;
		
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		n4 = input.nextDouble();
				
		media = ((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;
		
		if(media >= 7)
		{
			System.out.printf("Media: %.1f%n",media);
			System.out.println("Aluno aprovado.");
		}
		else if(media >= 5 && media < 7)
		{
			exame = input.nextDouble();
			if((exame+media)/2 >= 5)
			{
				System.out.println("Media: "+df.format(media));
				System.out.println("Aluno em exame.\nNota do exame: "+df.format(media));
				System.out.printf("Aluno aprovado.%nMedia final: %.1f%n", ((exame+media)/2));
			}
			else
			{
				System.out.printf("Media: %.1f%n",media);
				System.out.println("Aluno em exame.\nNota do exame: "+df.format(media));
				System.out.printf("Aluno reprovado.%nMedia final: %.1f%n",((exame+media)/2));
			}
		}
		else
		{
			System.out.println("Media: "+df.format(media));
			System.out.println("Aluno reprovado.");
		}
	}

}
