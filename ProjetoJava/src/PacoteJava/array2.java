package PacoteJava;

import java.util.Scanner;

	public static main(String[] args) {
		// TODO Auto-generated method stub
		
float nota[][] = new float[3][3],medianota,somanota=0,contnota=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("Entre com a sua nota: ");
				nota[l][c] = leia.nextFloat();
				somanota = somanota + nota[l][c];
				contnota++;
			}
		}
		medianota = somanota / contnota;
		for(int x=0;x<=20;x++)
		{
			System.out.println("\n");
		}
		for(int l=0;l<3;l++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.println("\nNota: "+nota[l][c]);
			}
		}
		System.out.println("A média das notas foi de: "+medianota);
	}
}

