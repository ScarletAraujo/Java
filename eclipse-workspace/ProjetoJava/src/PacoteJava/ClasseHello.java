package PacoteJava;

import java.util.Scanner;

public class ClasseHello {
	public static void main (String args[]) {
		
		System.out.println("Ol� participantes da Generation!!");
		
		// TODO Auto-generated method stub
				int totaldias,anos,meses,dias;
				
				try (Scanner entrada = new Scanner(System.in)) {
					System.out.println("Entre com o total de dias: ");
					totaldias = entrada.nextInt();
				}
				
				anos = totaldias / 365;
				meses = (totaldias%365)/30;
				dias = (totaldias%365)%30;
				
				System.out.printf("\nEu tenho: %d ano(s), %d mes(es) e %d dia(s)",anos,meses,dias);

	}

	
}
