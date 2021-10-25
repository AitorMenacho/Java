package TiposDeDatos;

public class EstudioOperadoresAritmeticos {

	public EstudioOperadoresAritmeticos() {

		System.out.println("Operadores Aritméticos");
		
		int suma;
		int a = -5;
		int b = 3;
		int multi;
		double sumaDoble;
		double num1 = 5.5;
		double num2 = 2.3;
		
		suma = a - b;
		multi = a * b;
		
		System.out.println("Suma: " + suma);
		System.out.println("Multiplicación: " + multi);
		
		sumaDoble = num1 + num2;
		
		System.out.println("SumaDoble = " + sumaDoble);
		
		sumaDoble = num1 + a;
		suma = (int)sumaDoble;
		
		int divEntera;
		int divid = 7;
		int div = 3;
		double divReal;
		double div2 = 3;
		
		divEntera = divid/div;
		
		System.out.println("Divi entera =" + divEntera);
		
		divReal = divid / (double)div; //División de enteros
		
		System.out.println("Divi real =" + divReal);
		
		divReal = divid/div2; //Entero/real
		
		System.out.println("Divi real 2 =" + divReal);
		
		int resto = 0;
		
		resto = divid % div;
		
		System.out.println("El resto de la división es = " + resto);
		
		int cont = 0;
		
		cont = cont+1; //Contador
		
		System.out.println("Contador =" + cont);
		
		cont++;
		
		System.out.println("Contador =" + cont);
		
		++cont;
		
		System.out.println("Contador =" + cont);
		
		int y = cont++;
		
		y = ++cont;
		
		//Contadores
		
		cont = cont+2;
		cont += 2;
		cont *= 4;
		cont /= 2;
		
		//Acumuladores
		
		int acu=3;
		
		acu = acu+cont;
		acu += cont;
		acu *= cont;
		
		//Operadores de relación
		
		int z = 3;
		int r = 4;
		boolean sw = false;
		boolean sw1;
		boolean sw2;
		
		sw = z == r; //Es igual
		sw = z != r; //Es distinto
		sw = z >= r; //Es mayor o igual
		
		System.out.println("sw =" + sw);
		
		//Operadores ternario en java
		
		int resultado = (z > r) ? z : r;
		int notanumerica = 6;
		String notaCadena = notanumerica < 5 ? "Suspenso" : "Aprobado";
		
		System.out.println("El mayor es : " + resultado);
		System.out.println("Resultado del examen : " + notaCadena);
		
		sw1 = true;
		sw2 =  false;
		
		//Operadores lógicos
		
		System.out.println(!sw1); //Devuelve lo contrario de sw.
		System.out.println(sw1 || sw2); //Devuelve true si al menos uno es verdadero.
		System.out.println(sw1 && sw2); //Devuelve true solo cuando los dos son verdaders.
		System.out.println(sw1 ^ sw2); //Devuelve true solo si uno es verdadero.
	
		boolean h = true;
		boolean j = false;
		
		System.out.println("h = " + h);
		System.out.println("j = " + j);
		System.out.println("h && j = " + (h && j));
		System.out.println("h || j = " + (h || j ));
		System.out.println("!h = " + !h);
		System.out.println("h || (6 > 10) = " + (h || (6 > 10)));
		System.out.println("((4 <= 4) || false) && (!h) = " + (((4 <= 4) || false) && (!h)));
		
	}

}
