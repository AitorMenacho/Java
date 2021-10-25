package Actividades;

import java.util.Scanner;

public class Act1_Sentencias {

	public Act1_Sentencias() {

		//Escribre un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
	
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escriba en minúsculas el día que quiere ver: ");
		String dia = leer.nextLine();
		
		switch (dia) {
		
			case "lunes" :
				System.out.println("Los "+ dia + " tenemos SI con Pepa");
				break;
		
			case "martes" :
				System.out.println("Los "+ dia + " tenemos PRO con Jesus");
				break;
			
			case "miercoles" :
				System.out.println("Los "+ dia + " tenemos FOL con Cristobalina");
				break;
				
			case "jueves" :
				System.out.println("Los "+ dia + " tenemos FOL con Cristobalina");
				break;
				
			case "viernes" :
				System.out.println("Los "+ dia + " tenemos FOL con Cristobalina");
				break;
			
			default :
				System.out.println("El día seleccionado no existe o no tenemos clase.");
		}
		
	}

}
