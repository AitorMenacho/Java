package Actividades;

import java.util.Scanner;

public class Act_Bucles {

	public Act_Bucles() {
		
		Scanner leer=new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int cont = 0;
		int x = 0;
		System.out.println("Introduce los n�meros que quieras, mete uno negativo para terminar");
		
		while ( num >= 0 ) {
		
			num = leer.nextInt();
			suma = suma + num;
			cont = x++;
		}
		
		suma = suma - num;
		
		System.out.println("Has introducido: " + cont + " n�meros");
		System.out.println("La suma de los n�meros es: " + suma);
		
	}

}
