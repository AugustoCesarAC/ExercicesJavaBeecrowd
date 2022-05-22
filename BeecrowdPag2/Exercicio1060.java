package BeecrowdPag2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1060
{

	public static void main(String[] args)
	{
		ArrayList<Double> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		int pos=0;
		
		for(int x = 0; x < 6; x++)
		{
			list.add(input.nextDouble());
			if(list.get(x) > 0)
				pos++;
		}
		
		System.out.println(pos + " valores positivos");
		
	}

}
