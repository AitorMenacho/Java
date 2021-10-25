package Actividades;

import java.util.Scanner;

public class Act9_Bucles {

	public Act9_Bucles() {
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce los números que quieras, uno negativo acaba el programa");
		
		int num = 1;
		int numtotal = 0;
		int cont = 0;
		int imp = 0;
		double mediaimp = 0;
		int par = 0;
		
		while (num > 0) {
			
			num = leer.nextInt();
			
			numtotal++;
			
			if (num >= 0 && num % 2 != 0) {
			
				cont++;
				
				imp = imp+num;
				
			}else {
				
				if (num >= 0 && num > par) {
					par = num;
				}
				
			}
		
		}
		
		numtotal = numtotal - 1;
		
		System.out.println("suma de impares es: " + imp);
		System.out.println("Cantidad de impares es: " + cont);
		
		mediaimp = imp / cont;
		
		System.out.println("Has introducido " + numtotal + " números");
		System.out.println("La medía de los impartes ha sido: " + mediaimp);
		System.out.println("El número par más grande ha sido: " + par);
		
	}

}
