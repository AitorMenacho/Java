package Actividades;

import java.util.Scanner;

public class Act7_Bucles {

	public Act7_Bucles() {

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce el número para averiguar si es primo");
		int num = leer.nextInt();
		
		boolean Primo = true;
		
		for (int x = 2; x < num; x++) {
			
			if ((num % x) == 0) {
				
				Primo = false;
				
			}
		}
		
		if (Primo) {
			
			System.out.println("El número " + num + " es primo");
			
		} else {
			
			System.out.println("El número " + num + " no es primo");
			
		}
		
	}

}
