package PacoteJava;

import java.util.Scanner;

public class Execrio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fa?a um programa que receba a idade de uma pessoa e mostre na sa?da em qual categoria ela se encontra: 10-14 infantil 15-17 juvenil 18-25 adulto
			
		int idade;
		
		Scanner ler =new Scanner(System.in);
		{
			System.out.printf("Entre com a sua idade: ");
			idade=ler.nextInt();
			
			
			if (idade>10 && idade<=14)
			{
				System.out.printf("Voce se encontra na categoria Infantil: %d", idade);
			}
			
			else if (idade>15 && idade<=17)
			{
				System.out.printf("Voce se encontra na categoria Juvenil: %d", idade);
			}
			
			else if (idade>18 && idade>=25)
			{
				System.out.printf("Voce se encontra na categoria Adulta: %d", idade);
			}
			}
	}

}
