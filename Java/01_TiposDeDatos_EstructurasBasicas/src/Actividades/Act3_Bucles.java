package Actividades;

import java.util.Scanner;

public class Act3_Bucles {

	public Act3_Bucles() {
		
		Scanner leer=new Scanner(System.in);
		
		int cod = 0;
		int intentos = 1;
		boolean error = false;
		
		while (intentos <= 4) {	
			
			System.out.println("Coloque el código secreto (recuerde que son 4 cifras)");
			cod = leer.nextInt();
			
			if (cod == 1234) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			} else {
				System.out.println("Lo siento, esa no es la combinación, intentos hasta ahora " + intentos);
				error = true;
			}
			
			intentos++;
		}
		
		if (error == true) {
			System.out.println("--------------------------------");
			System.out.println("La caja fuerte ha sido bloqueada");
			
		}
		
	}

}
