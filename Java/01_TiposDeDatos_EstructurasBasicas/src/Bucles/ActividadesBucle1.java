package Bucles;

import java.util.Scanner;

public class ActividadesBucle1 {

	public ActividadesBucle1() {
		
		//Ejercicio 1 Bucle while hasta que se introduzca número negativo, muestra la suma y la cantidad de números introducidos.
		
		Scanner leer=new Scanner(System.in);
		
		//Declaramos las variables.
		
		int num = 1; //Esta variable la usaremos para que se ejecute el while.
		int numant = 0; //Aquí guardaremos la suma de los números introducidos.
		int numtotal = 0; //Lo usaremos como contador para guardar cuantos números hemnos introducido.

		System.out.println("Escriba números y pulse enter, para terminar introduce un número negativo.");

		while (num > 0) {
		
			numtotal = numtotal+1; //sumaremos 1 por cada vuelta del while.
			
			num = leer.nextInt(); //Leemos el número introducido.
		
			numant = numant+num; //Sumamos el número introducido con el anterior.

		}
		
		numant = numant - num; //Usamos la resta para sumar el número negativo introducido antes.
		numtotal = numtotal - 1; //Le restamos una vuelta al contador para quitar el número negativo
		
		//Mostramos en pantalla los resultados.
		
		System.out.println("***************************************");
		System.out.println("La suma de los números introducidos es: "+numant);
		System.out.println("Se han introducido "+numtotal+" números");
	}

}
