package Actividades;

import java.util.Scanner;

public class Act11_Sentencias {

	public Act11_Sentencias() {
		
		//11- Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de
			//impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA
			//general, reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser
			//nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción, el precio se reduce a la
			//mitad, se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.
			//Ejemplo:
				//Introduzca la base imponible: 25
				//Introduzca el tipo de IVA (general, reducido o superreducido): reducido
				//Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
				//Base imponible 25.00
				//IVA (10%) 2.50
				//Precio con IVA 27.50
				//Cód. promo. (mitad): -13.75
				//TOTAL 13.75
		
		Scanner leer=new Scanner(System.in);
	
		int preIVA = 0;
		double descuento = 0;
		
		System.out.println("Introduzca la base imponible");
		double precio = leer.nextDouble();
		
		System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");
		String tipoIVA = leer.next();
		
		switch (tipoIVA) {
		
			case "general":
		
				preIVA = 21;
				break;
				
			case "reducido":

				preIVA = 10;
				break;
				
			case "superreducid":
				
				preIVA = 4;
				break;
			
			default:
				System.out.println("Tipo de IVA no existe");
		}
		
		double IVA = precio * preIVA / 100;
		double precioconIVA = precio + IVA;
		
		System.out.println("Introduce el descuento (nopro, mitad, meno5 o 5porc)");
		String tipoDescuento = leer.next();
		
		switch (tipoDescuento) {
		
			case "nopro":
				break;
			
			case "mitad":
				descuento = precioconIVA / 2;
				break;
				
			case "meno5":
				descuento = precioconIVA - 5;
				break;
				
			case "5porc":
				descuento = precioconIVA * 0.05;
				break;
				
			default:
				System.out.println("El descuento introducido no es valido");
		}
		
		double preciofinal = precioconIVA - descuento;
		
		System.out.println("Base imponible............. " + precio);
		System.out.println("IVA........................ " + IVA);
		System.out.println("Precio con IVA............. " + precioconIVA);
		System.out.println("Promoción"+"("+tipoDescuento+")........... "+ descuento);
		System.out.println("Precio final............... " + preciofinal);
	}

}
