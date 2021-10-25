package Actividades;

import java.util.Scanner;

public class Act6_Bucles {

	public Act6_Bucles() {

		Scanner leer=new Scanner(System.in);
	
		System.out.println("¿Cuantos números de Fibonacci quieres?");
		int num = leer.nextInt();
		
		int ant = 0;
		int sig = 1;
		int suma = 0;
		int cont = 1;
		
		while (cont <= num) {
			
			cont++;
			
			ant = sig;
			sig = suma;
			suma = sig + ant;
			
			System.out.println(suma);
			
		}
		
	}

}
