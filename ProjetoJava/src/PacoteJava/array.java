package PacoteJava;

import java.util.Scanner;

public class array {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num[] = new int[10],maior,menor,soma=0;
			
			Scanner leia = new Scanner(System.in);
			
			for(int x=0;x<10;x++)
			{
				System.out.println("Entre com um número: ");
				num[x] = leia.nextInt();//10
				soma = soma + num[x];
			}
			maior = num[0];
			menor = num[0];
			for(int x=0;x<10;x++)
			{
				if(maior<num[x])
				{
					maior = num[x];
				}
				if(menor>num[x])
				{
					menor = num[x];
				}
			}
			for(int x=0;x<10;x++)
			{
				if(maior == num[x])
				{
					System.out.println("\nNúmero: "+num[x]+"\t\t <-- este é o maior");
				}
				else if(menor == num[x])
				{
					System.out.println("\nNúmero: "+num[x]+"\t\t <-- este é o menor");
				}
				else
				{
					System.out.println("\nNúmero: "+num[x]);
				}
			}
			System.out.println("\nSomatório: "+soma);
			
		}

	}

	}

}
