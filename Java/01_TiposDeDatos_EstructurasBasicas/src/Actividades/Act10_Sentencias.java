package Actividades;

import java.util.Scanner;

public class Act10_Sentencias {

	public Act10_Sentencias() {
		
		//10-Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten
		//números de hasta 5 cifras.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int num = leer.nextInt();
		
		boolean capicua = false;
		
		if (num < 10) {
			
			capicua = true;
			
		}
		
		if (num >= 10 && num <= 100) {
			
			if ((num/10) == (num%10)) {
				
				capicua = true;
				
			}
			
		}
		
		if (num >= 100 && num <= 1000) {
			
			if ((num/100) == (num%10)) {
				
				capicua = true;
				
			}
			
		}
		
		if (num >= 1000 && num <= 10000) {
			
			if ((num/1000) == (num%10) && (((num/100)%10) == ((num/10)%10))) {
				
				capicua =true;
			
			}
			
		}
		
		if (num >= 10000 && num < 100000) {
			
			if ((num/10000) == (num%10) && (((num/1000)%10) == ((num/10)%10))) {
				
				capicua =true;
			
			}
			
		}
		
		if (capicua) {
			
			System.out.println("El número " + num + " es capicua");
			
		}else {
			
			System.out.println("El número " + num + " no es capicua");
			
		}
		
	}

}
