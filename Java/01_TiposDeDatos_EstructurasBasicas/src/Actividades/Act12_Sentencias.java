package Actividades;

import java.util.Scanner;

public class Act12_Sentencias {

	public Act12_Sentencias() {
		
		Scanner leer=new Scanner(System.in); 

		int sueldo = 0;
		double IRPF = 0;
		
		System.out.println("Puesto del empleado (1.-Prog.junior 2.-Prog.senior 3.-Jefe de proyecto)");
		int puesto = leer.nextInt();

		switch (puesto) {
		
			case 1:
				sueldo = 950;
				break;
				
			case 2:
				sueldo = 1200;
				break;
				
			case 3:
				sueldo = 1600;
				break;
			
			default:
				System.out.println("El puesto especificado no existe");
		
		}
		
		System.out.println("¿Cuantos días ha estado estado de viaje visitando clientes?");
		int dias = leer.nextInt();
		
		int dietas = dias * 30;
		
		System.out.println("Estado civil (1.-Soltero 2.-Casado)");
		int Estcivil = leer.nextInt();
		
		switch (Estcivil) {
		
			case 1:
				IRPF = 25;
				break;
				
			case 2:
				IRPF = 20;
				break;
				
			default:
				System.out.println("El estado civil especificado no existe");
		
		}
		
		IRPF = IRPF / 100;
		
		double sueldobruto = sueldo + dietas;
		
		double retencion = sueldobruto * IRPF;
		
		double sueldoneto = sueldobruto - retencion;
		
		System.out.println("Sueldo base............ " + sueldo + "€");
		System.out.println("Dietas (" + dias +")............. " + dietas + "€");
		System.out.println("-----------------------------------");
		System.out.println("Sueldo bruto........... " + sueldobruto + "€");
		System.out.println("Retención IRPF......... " + retencion + "€");
		System.out.println("-----------------------------------");
		System.out.println("Sueldo neto............ " + sueldoneto + "€");
		
	}

}
