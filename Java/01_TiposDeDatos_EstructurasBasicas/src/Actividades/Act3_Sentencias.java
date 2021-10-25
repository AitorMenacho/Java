package Actividades;

import java.util.Scanner;

public class Act3_Sentencias {

	public Act3_Sentencias() {

		//Escribre un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
		//(40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, pagan a 16 euros la hora.
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("¿Cuantas horas ha trabajado?");
		int horas = leer.nextInt();
		
		int horasextras;
		int sueldo;
		
		if (horas <= 40) {
			
			sueldo = horas * 12;
			
			System.out.println("Horas trabajadas:................ " + horas + " horas");
			
			System.out.println("Paga por horas trabajadas:....... " + horas*12 + " €");
			
			System.out.println("Paga por horas extras:........... 0 €");
			
			System.out.println("Salario:......................... " + sueldo + " €");
			
		} else {
			
			sueldo = (40 * 12) + ((horas - 40)*16);
			
			System.out.println("Horas trabajadas:................ " + horas + " horas");
			
			System.out.println("Paga por horas trabajadas:....... " + 40*12 + " €");
			
			System.out.println("Paga por horas extras:........... " + (horas-40)*16 + " €");
			
			System.out.println("Salario:......................... " + sueldo + " €");
			
		}
		
	}

}
