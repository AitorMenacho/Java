package Actividades;

import java.util.Scanner;

public class Act_Operadores {

	public Act_Operadores() {

		 Scanner leer=new Scanner(System.in); 
		
		System.out.println("Introduzca nota del primer examen de programación");
		double nota1 = leer.nextInt(); //Pido el dato por teclado
		
		System.out.println("Introduzca la nota deseada");
		double notafinal = leer.nextInt();
		
		double nota2; //Declaro variable,
		
		nota2 = ((notafinal*100) - (nota1 * 40)) / 60; //Calculamos el 60% restante para llegar a la nota deseada restandole el 40% conseguido.
		
		System.out.println("Tendrías que sacar en el siguiente un " + nota2); //Muestro en pantalla el resultado.
		
		
	}

}
