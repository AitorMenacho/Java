package Actividades;

import java.util.Scanner;

public class Act7_Sentencias {

	public Act7_Sentencias() {
		
		//7-Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca el número deseado");
		long num =  leer.nextInt();
		
		num = num%10;
		
		System.out.println("La última cifra del número ingresado es: " + num);
		
	}
}
