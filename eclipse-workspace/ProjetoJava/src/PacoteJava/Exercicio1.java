package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1,nota2,nota3,peso, notas;
		double mediaponderada;
		
		Scanner ler = new Scanner(System.in);
		{
			
			System.out.println("Digite a primeira nota: ");
			nota1 = ler.nextInt();
			System.out.println("Digite a segunda nota: ");
			nota2 = ler.nextInt();
			System.out.println("Digite a terceira nota: ");
			nota3 = ler.nextInt();
			
			notas=nota1*2+nota2*3+nota3*5;
			mediaponderada=notas/10;
			
			System.out.println("A média ponderada é: "+ mediaponderada);

		}
		
		
}

}
