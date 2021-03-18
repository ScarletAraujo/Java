package PacoteJava;

import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		int num1, num2, num3;
		
		Scanner ler=new Scanner(System.in);
		{
			System.out.printf("Entre com o primeiro numero? ");
			num1=ler.nextInt();
			System.out.printf("Entre com o segundo numero? ");
			num2=ler.nextInt();
			System.out.printf("Entre com o terceiro numero? ");
			num3=ler.nextInt();
			
			if (num1 > num2 && num1 > num3)
			{
				System.out.printf("O número maior é: %d ", num1);
			}
			else if (num2 > num1 && num2 > num3)
			{
				System.out.printf("O número maior é: %d ", num2);
			}
			else if (num3 > num1 && num3 > num2)
			{
				System.out.printf("O número maior é: %d ", num3);
			}
			
		}
		
		
		

	}

}
