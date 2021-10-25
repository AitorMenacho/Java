package Actividades;

import java.util.Scanner;

public class Act4_Bucles {

	public Act4_Bucles() {
		
		Scanner leer=new Scanner(System.in);
		
		int cont = 1;
		
		System.out.println("Introduce el número que desee");
		long num = leer.nextLong();
		
		while (num > 10) {
			
			num = num/10;
			System.out.println(num);
			cont++;
			
		}
		
		System.out.println("El número contiene: " + cont + " digitos");
		
	}

}
