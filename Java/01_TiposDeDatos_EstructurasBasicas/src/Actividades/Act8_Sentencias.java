package Actividades;

import java.util.Scanner;

public class Act8_Sentencias {

	public Act8_Sentencias() {
		
		//8- Escribe un programa que diga cu�l es la primera cifra de un n�mero entero introducido por teclado. Se permiten
		//n�meros de hasta 5 cifras.

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero de hasta 5 cifras");
		int num = leer.nextInt();
		
		if (num > 10 && num < 100) {
			
			num = num/10;
			
		}
		
		else if (num > 100 && num < 1000) {
			
			num = num/100;
			
		}
		
		else if (num > 1000 && num < 10000) {
			
			num = num/1000;
			
		}
		
		else if (num > 10000 && num < 100000) {
			
			num = num/10000;
			
		}
		
		System.out.println("El primer n�mero es: " + num);
		
	}

}
