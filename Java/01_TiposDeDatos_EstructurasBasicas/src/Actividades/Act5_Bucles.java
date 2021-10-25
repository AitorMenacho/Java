package Actividades;

import java.util.Scanner;

public class Act5_Bucles {

	public Act5_Bucles() {
		
		Scanner leer=new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int cont = 0;
		double media;
		
		System.out.println("Introduce todos los números que quieas para realizar la media, introduce uno negativo para finalizar");
		
		while (num >= 0) {
		
		num = leer.nextInt();
		
		suma = suma + num;
		
		cont++;
			
		}
		
		cont = cont -1;
		suma = suma - num;
		media = suma / cont;
		
		System.out.println("La media es: " + media);
		
	}

}
