package TiposDeDatos;

import java.util.Scanner;

public class EstudioTiposDeDatos {

	public EstudioTiposDeDatos() {

		System.out.println("Estudio Tipos de datos");
		byte tipoByte = 0;
		tipoByte = 24;
		
		System.out.println("tipoByte = "+ tipoByte);
		
		int x; //Declara la variable x como entera.
		x = 5; //Asigna el valor 5 a la variable x.
		
		//Muestra el valor de x
		System.out.println("y ahora es "+ x);
		
		//long tipoLong = 765788973777777777; //Da error.
		long tipoLong2 = 765788973777777777L; //Correcto.
		
		char letra1 = 'c';
		char letra2 = 'a';
		char letra3 = 's';
		char letra4 = 'a';
		
		System.out.println("letra1: " + letra1);
		System.out.println("letra3: " + letra3);
		System.out.println("Todas las letras juntas: " + letra1 + letra2 + letra3 + letra4);
		
		char c = 'A';
		int codAscii = c;
		
		System.out.println("Caracter " + c + " Ascii = " + codAscii);
	
		//Los decimales son considerados como double si queremos utilizar float,
		//tendremos que hacer un casting
		
		float tipoFloat;
		
		//tipoFloat = 23.4; //Da error.
		tipoFloat = (float) 23.4;
		
		float tipoFloat2 = 23.4F;
		
		double a; //Se declaran las variables x e y
		double b; //de tal forma que pueden almacenar decimales.
		
		a = 7;
		b = 25.01;
		
		System.out.println(" a vale " + a);
		System.out.println(" b vale " + b);
		
		//Constantes
		
		final double PI = 3.14;
		
		//Conversión de tipos .....casting
		
		double div;
		int cociente, divisor;
		
		cociente = 7;
		divisor = 3;
		
		div = cociente / divisor;
		
		System.out.println("La división de "+ cociente + "/" + divisor + " = " + div);
		
		//boolean
		
		boolean sw=false;
		sw=true;
		
		//Cadenas
		
		String miPalabra = "Cerveza";
		String miFrase = "¿Dónde está mi cerveza?";
		
		System.out.println("Una palabra que uso con frecuencia: " + miPalabra);
		System.out.println("Una frase que uso a veces: " + miFrase);
		
		//Pedir por teclado
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = s.nextLine();
		
		//String nombre = s.next();
		//s=null; s = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = s.nextInt();
		
		System.out.println("Tu nombre es " + nombre + " y  tu edad es " + edad);
	}

}
