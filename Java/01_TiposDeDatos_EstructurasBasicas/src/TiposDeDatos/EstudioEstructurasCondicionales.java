package TiposDeDatos;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {

	public EstudioEstructurasCondicionales() {

		System.out.println("Estudio Estructuras Basicas");

		int edad = 14;
		boolean esbisiesto = true;
		
		if (esbisiesto) {
			System.out.println("El a�o es bisiesto");
		}else {
			System.out.println("El a�o no es bisiesto");
		}
		
		if (edad>=18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}
		
		Scanner leer=new Scanner(System.in);
		
		System.out.print("�Cual es la capital de Kiribati?");
		String respuesta = leer.next();
		
		if (respuesta.equals("Tarawa")) {
			System.out.println("�La respuesta correcta!");
		} else {
			System.out.println("Lo siento, la respuesta es incorrecta");
		}
		
		System.out.print("Por favor, introduce un n�mero entero: ");
		int x = leer.nextInt();
		
		if (x < 0) {
			System.out.println("El n�mero introducido es negativo.");
		} else {
			System.out.println("El n�mero introducido es positivo.");
		}
		
		//########## if else if.... #################################
		
		int edadPedro = 15;
		int edadLuis = 17;
		
		if (edadPedro >= 18 && edadLuis >= 18) {
			System.out.println("Los dos son mayores de edad y pueden votar");
		}
		else if (edadPedro < 18 && edadLuis >= 18) {
			System.out.println("Luis puede votar pero Pedro no por que es menor de edad");
		}
		else if (edadPedro < 18 && edadLuis < 18) {
			System.out.println("Los dos son menores y no pueden votar");
		} else {
			
			System.out.println("Ninguna de las tres");
		}
		
		//########## Estudio switch #################################
		
		System.out.println("Por favor, introduzca un n�mero de mes: ");
		
		int mes = leer.nextInt();
		
		String nombreDelMes;
		
		switch (mes) {
		
			case 1:
				nombreDelMes = "Enero";
				break;
				
			case 2:
				nombreDelMes = "Febrero";
				break;
				
			case 3:
				nombreDelMes = "Marzo";
				break;
				
			case 4:
				nombreDelMes = "Abril";
				break;
				
			case 5:
				nombreDelMes = "Mayo";
				break;
				
			case 6:
				nombreDelMes = "Junio";
				break;
				
			case 7:
				nombreDelMes = "Julio";
				break;
				
			case 8:
				nombreDelMes = "Agosto";
				break;
				
			case 9:
				nombreDelMes = "Septiembre";
				break;
				
			case 10:
				nombreDelMes = "Octubre";
				break;
				
			case 11:
				nombreDelMes = "Noviembre";
				break;
				
			case 12:
				nombreDelMes = "Diciembre";
				break;
			
			default:
				nombreDelMes = "No existe el mes seleccionado";	
		}
		
		System.out.println("Mes " + mes + ": " + nombreDelMes);
	
		String pagina = "registro";
		
		switch (pagina) {
		
			case "inicio" :
				System.out.println("Pagina de inicio");
				break;
			
			case "registro" :
				System.out.println("Pagina de registro");
				break;
			
			case  "salir" :
				System.out.println("Cerrar sesi�n");
				break;
			
			default :
				throw new IllegalArgumentException("Unexpected value: " + pagina);
		}
		
		System.out.println("C�lculo de �reas");
		System.out.println("----------------");
		System.out.println("1. Cuadrado");
		System.out.println("2. Rect�ngulo");
		System.out.println("3. Tri�ngulo");
		System.out.println("\n Elija una opci�n (1-3): ");
		
		int opcion = leer.nextInt();
		
		double lado;
		double base;
		double altura;
		
		switch (opcion) {
			case 1:
				System.out.println("\nIntroduzca el lado del cuadrado en cm: ");
				lado = leer.nextDouble();
				System.out.println("\nEl �rea del cuadrado es " + (lado * lado) + " cm2");
				break;
				
			case 2:
				System.out.println("\nIntroduzca la base del rect�ngulo en cm: ");
				base = leer.nextDouble();
				System.out.println("Introduzca la altura del rect�ngulo en cm: ");
				altura = leer.nextDouble();
				System.out.println("El �rea del tri�ngulo es " + (base * altura) + " cm2");
				break;
				
			case 3:
				System.out.println("\nIntroduzca la base del tri�ngulo en cm: ");
				base = leer.nextDouble();
				System.out.println("Introduzca la altura del tr�angulo en cm: ");
				altura = leer.nextDouble();
				System.out.println("El �rea del tri�ngulo es " + ((base * altura) / 2) + " cm2");
				break;
				
			default:
				System.out.println("\nLo siento, la opci�n elegida no es correcta.");
		}
		
		
	}

}
