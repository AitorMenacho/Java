package tiposDeDatos;

import java.util.Scanner;

public class EstudioTiposDeDatos {

	public EstudioTiposDeDatos() {
		
		System.out.println("Estudio Tipos de datos");
		byte tipoByte = 0;
		tipoByte = 24;
		System.out.println("tipoByte = "+tipoByte);
		int x; // Declara la variable x como entera.
		x = 5; // Asigna el valor 5 a la variable x.
		
		//Muestra el valor de x
		System.out.println("El valor actual de mi variable es "+x);
		x = 7; // Asigna el valor 7 a la variable x.
		
		//Muestra de nuevo el valor de x
		System.out.println("y ahora es "+ x);
		
		//long tipolong=76568897377777777; // Da error
		long tipolong2 = 76578897377777777L; // Correcto
		char letra1 = 'c';
		char letra2 = 'a';
		char letra3 = 's';
		char letra4 = 'a';
		System.out.println("letra1: " + letra1);
		System.out.println("letra3: " + letra3);
		System.out.println("todas las letras juntas: " + letra1 + letra2 + letra3 + letra4);
		char c = 'A';
		int codAscii = c;
		System.out.println("Caracter " + c + " Ascii =" + codAscii);
		c=77;
		System.out.println("Caracter " + c );
		// los decimales son considerados como double si queremos utilizar float,
		// tendremos que hacer un casting.
		float tipoFloat;
		//tipoFloat 23.4; //da error.
		float tipoFloat2 = 23.4F;
		double a; // Se declaran las variables x e y.
		double b; // de tal forma que puedan almacenar decimales.
		a = 7;
	}

}
