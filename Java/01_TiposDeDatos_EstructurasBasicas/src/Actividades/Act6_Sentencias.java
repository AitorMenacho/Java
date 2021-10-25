package Actividades;

import java.util.Scanner;

public class Act6_Sentencias {
	
	public Act6_Sentencias() {
		
		//6- Escribe un programa que ordene tres números enteros introducidos por teclado.

		Scanner leer=new Scanner(System.in);
		
		int x;
		
		System.out.println("Introduzca el primer número");
		int a = leer.nextInt();
		
		System.out.println("Introduzca el segundo número");
		int b = leer.nextInt();
		
		System.out.println("Introduzca el tecer número");
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
