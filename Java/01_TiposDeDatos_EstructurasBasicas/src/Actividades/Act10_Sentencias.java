package Actividades;

import java.util.Scanner;

public class Act10_Sentencias {

	public Act10_Sentencias() {
		
		//10-Realiza un programa que diga si un n�mero entero positivo introducido por teclado es capic�a. Se permiten
		//n�meros de hasta 5 cifras.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero");
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
			
			System.out.println("El n�mero " + num + " es capicua");
			
		}else {
			
			System.out.println("El n�mero " + num + " no es capicua");
			
		}
		
	}

}
