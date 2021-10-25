package Actividades;

import java.util.Scanner;

public class Act9_Sentencias {

	public Act9_Sentencias() {
		
		//9- Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se
		//permiten números de hasta 5 dígitos.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca un número de hasta 5 cifras");
		int num = leer.nextInt();
		
		//Positivo
		
		if (num > 0 && num < 10) {
			
			System.out.println("Tiene 1 dígito.");
			
		}
		
		else if (num > 10 && num < 100) {
			
			System.out.println("Tiene 2 dígitos.");
			
		}
		
		else if (num > 100 && num < 1000) {
			
			System.out.println("Tiene 3 dígitos.");
			
		}

		else if (num > 1000 && num < 10000) {
	
			System.out.println("Tiene 4 dígito.");
	
		}

		else if (num > 10000 && num < 100000) {
	
			System.out.println("Tiene 5 dígito.");
	
		}
		
		
		//Negativos
		
		if (num < 0 && num > -10) {
			
			System.out.println("Tiene 1 dígito.");
			
		}
		
		else if (num < -10 && num > -100) {
			
			System.out.println("Tiene 2 dígitos.");
			
		}
		
		else if (num < -100 && num > -1000) {
			
			System.out.println("Tiene 3 dígitos.");
			
		}

		else if (num < -1000 && num > -10000) {
	
			System.out.println("Tiene 4 dígito.");
	
		}

		else if (num < -10000 && num > -100000) {
	
			System.out.println("Tiene 5 dígito.");
	
		}
		
	}

}
