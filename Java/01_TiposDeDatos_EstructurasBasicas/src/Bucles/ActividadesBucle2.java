package Bucles;

import java.util.Scanner;

public class ActividadesBucle2 {

	public ActividadesBucle2() {
		
		//Bucle do while que termina cuando se introduce por teclado un número impar.
		
		Scanner leer=new Scanner(System.in);
		
		//Declaramos variables
		
		int num=0; //Aquí guardaremos los números introducidos.
		boolean par=false; //Aquí guardaremos si es par o impar el número introducido.

		System.out.println("Jueguemos, introduce números pares, el bucle termina con un número impar");
		
		do {
			
			num = leer.nextInt(); //Leemos el número.
			
			par = num % 2 == 0; //Comprobamos si es par o impar.
			
			if (par) {
				
				System.out.println("Número par, sigue jugando."); //Si es par ejecutamos esto y continuamos el bucle.
				
			}else {
				
				System.out.println("Numero impar, perdiste"); //Si es impar ejecutamos esto y terminamos el bucle.
				
			}
			
		}while(par);
		
	}

}
