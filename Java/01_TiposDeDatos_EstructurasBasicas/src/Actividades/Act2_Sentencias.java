package Actividades;

import java.util.Scanner;

public class Act2_Sentencias {

	public Act2_Sentencias() {

		Scanner leer=new Scanner(System.in);
		
		System.out.println("¿Que hora es? (Escribe la hora sin minutos.)");
		int hora = leer.nextInt();
		
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días");
		}
		else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		} else {
			System.out.println("Buenas noches");
		}
		
	}

}
