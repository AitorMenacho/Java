package Actividades;

import java.util.Scanner;

public class Act4_Sentencias {

	public Act4_Sentencias() {
		
		//4-Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

		Scanner leer=new Scanner(System.in);
		
		System.out.println("Día de nacimiento");
		int dia = leer.nextInt();
		
		System.out.println("Mes de nacimiento con números");
		int mes = leer.nextInt();
		
		if (mes == 1) {
			
			if (dia >= 1 && dia <= 19) {
				System.out.println("Eres Capricornio");
			}else {
				System.out.println("Eres Acuario");
			}
			
		}
		
		else if (mes == 2) {
			
			if (dia >= 1 && dia <= 19) {
				System.out.println("Eres Acuario");
			}else {
				System.out.println("Eres Piscis");
			}
			
		}
		
		else if (mes == 3) {
			
			if (dia >= 1 && dia <= 20) {
				System.out.println("Eres Piscis");
			}else {
				System.out.println("Eres Aries");
			}
			
		}
		
		else if (mes == 4) {
			
			if (dia >= 1 && dia <= 20) {
				System.out.println("Eres Aries");
			}else {
				System.out.println("Eres Tauro");
			}
			
		}
		
		else if (mes == 5) {
			
			if (dia >= 1 && dia <= 21) {
				System.out.println("Eres Tauro");
			}else {
				System.out.println("Eres Geminis");
			}
			
		}
		
		else if (mes == 6) {
			
			if (dia >= 1 && dia <= 21) {
				System.out.println("Eres Geminis");
			}else {
				System.out.println("Eres Cáncer");
			}
			
		}
		
		else if (mes == 7) {
			
			if (dia >= 1 && dia <= 23) {
				System.out.println("Eres Cáncer");
			}else {
				System.out.println("Eres Leo");
			}
			
		}
		
		else if (mes == 8) {
			
			if (dia >= 1 && dia <= 23) {
				System.out.println("Eres Leo");
			}else {
				System.out.println("Eres Virgo");
			}
			
		}
		
		else if (mes == 9) {
			
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Virgo");
			}else {
				System.out.println("Eres Libra");
			}
			
		}
		
		else if (mes == 10) {
	
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Libra");
			}else {
				System.out.println("Eres Escorpio");
			}
	
		}
	
		else if (mes == 11) {
		
			if (dia >= 1 && dia <= 22) {
				System.out.println("Eres Escorpio");
			}else {
				System.out.println("Eres Sagitario");
			}
		
		}
		
	else if (mes == 12) {
		
		if (dia >= 1 && dia <= 21) {
			System.out.println("Eres Sagitario");
		}else {
			System.out.println("Eres Capricornio");
		}
		
	}
		
	}

}
