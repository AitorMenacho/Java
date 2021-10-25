package Actividades;

import java.util.Scanner;

public class Act5_Sentencias {

	public Act5_Sentencias() {
		
		//5-Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar
		//a la medianoche.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("¿Que hora es?");
		int hora = leer.nextInt();
		
		System.out.println("¿Que minutos?");
		int min = leer.nextInt();
		
		hora = hora*3600;
		min = min*60;
		
		int resto = 86400 - (hora+min);
		
		
		System.out.println("Quedan: " + resto + " segundos");
	}

}
