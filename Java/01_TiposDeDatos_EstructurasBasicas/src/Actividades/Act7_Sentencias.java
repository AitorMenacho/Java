package Actividades;

import java.util.Scanner;

public class Act7_Sentencias {

	public Act7_Sentencias() {
		
		//7-Escribe un programa que diga cu�l es la �ltima cifra de un n�mero entero introducido por teclado.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduzca el n�mero deseado");
		long num =  leer.nextInt();
		
		num = num%10;
		
		System.out.println("La �ltima cifra del n�mero ingresado es: " + num);
		
	}
}
