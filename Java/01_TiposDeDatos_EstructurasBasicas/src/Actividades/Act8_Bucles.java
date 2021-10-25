package Actividades;

import java.util.Scanner;

public class Act8_Bucles {
	
	public Act8_Bucles() {

		Scanner leer=new Scanner(System.in);

		System.out.println("Introduce el primer número");
		int num1 = leer.nextInt();
		
		System.out.println("Introduce el segundo número");
		int num2 = leer.nextInt();
		
		int x = num1;
		
		System.out.println("=============================");
		
		while ( x <= num2 ) {
			
			
			System.out.println(x);
			x++;
		}
		
	}

}
