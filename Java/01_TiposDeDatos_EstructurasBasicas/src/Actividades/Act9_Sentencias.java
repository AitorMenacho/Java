package Actividades;

import java.util.Scanner;

public class Act9_Sentencias {

	public Act9_Sentencias() {
		
		//9- Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero entero que puede ser positivo o negativo. Se
		//permiten n�meros de hasta 5 d�gitos.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero de hasta 5 cifras");
		int num = leer.nextInt();
		
		//Positivo
		
		if (num > 0 && num < 10) {
			
			System.out.println("Tiene 1 d�gito.");
			
		}
		
		else if (num > 10 && num < 100) {
			
			System.out.println("Tiene 2 d�gitos.");
			
		}
		
		else if (num > 100 && num < 1000) {
			
			System.out.println("Tiene 3 d�gitos.");
			
		}

		else if (num > 1000 && num < 10000) {
	
			System.out.println("Tiene 4 d�gito.");
	
		}

		else if (num > 10000 && num < 100000) {
	
			System.out.println("Tiene 5 d�gito.");
	
		}
		
		
		//Negativos
		
		if (num < 0 && num > -10) {
			
			System.out.println("Tiene 1 d�gito.");
			
		}
		
		else if (num < -10 && num > -100) {
			
			System.out.println("Tiene 2 d�gitos.");
			
		}
		
		else if (num < -100 && num > -1000) {
			
			System.out.println("Tiene 3 d�gitos.");
			
		}

		else if (num < -1000 && num > -10000) {
	
			System.out.println("Tiene 4 d�gito.");
	
		}

		else if (num < -10000 && num > -100000) {
	
			System.out.println("Tiene 5 d�gito.");
	
		}
		
	}

}
