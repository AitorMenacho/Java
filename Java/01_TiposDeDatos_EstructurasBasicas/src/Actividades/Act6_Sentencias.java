package Actividades;

import java.util.Scanner;

public class Act6_Sentencias {
	
	public Act6_Sentencias() {
		
		//6- Escribe un programa que ordene tres n�meros enteros introducidos por teclado.

		Scanner leer=new Scanner(System.in);
		
		int x;
		
		System.out.println("Introduzca el primer n�mero");
		int a = leer.nextInt();
		
		System.out.println("Introduzca el segundo n�mero");
		int b = leer.nextInt();
		
		System.out.println("Introduzca el tecer n�mero");
		int c = leer.nextInt();
	
		if (a > b) {
			
			x = a;
			a = b;
			b = x;
			
		}
		
		if (b > c) {
					
			x = b;
			b = c;
			c = x;
					
		}

		if (a > b) {
			
			x = a;
			a = b;
			b = x;
			
		}
		
		System.out.println("El orden es: " + a + " " + b + " " + c);
	}

}
