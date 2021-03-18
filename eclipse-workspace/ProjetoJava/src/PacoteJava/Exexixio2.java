package PacoteJava;

import java.util.Scanner;

public class Exexixio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Faça um programa que entre com três números e coloque em ordem crescente.
		
		int num1, num2, num3;
		
		Scanner ler =new Scanner(System.in);
		{
			System.out.printf("Entre com o primeiro numero? ");
			num1=ler.nextInt();
			System.out.printf("Entre com o segundo numero? ");
			num2=ler.nextInt();
			System.out.printf("Entre com o terceiro numero? ");
			num3=ler.nextInt();
			
			if (num1 >= num2 && num1 >= num3)
			{
				System.out.printf("A ordem é: %d, %d, %d ", num1, num2, num3);
			}
			else if (num2 >= num1 && num2 >= num3)
			{
				System.out.printf("A ordem é: %d, %d, %d ", num2, num3, num1);
			}
			else if (num3 >= num1 && num3 >= num2)
			{
				System.out.printf("A ordem é: %d, %d, %d ", num3, num2, num1);
			}
			
		}
		
		
	}

}
