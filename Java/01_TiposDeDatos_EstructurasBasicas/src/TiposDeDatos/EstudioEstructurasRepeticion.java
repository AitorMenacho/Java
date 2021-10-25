package TiposDeDatos;

import java.util.Scanner;

public class EstudioEstructurasRepeticion {

	public EstudioEstructurasRepeticion() {
		
		Scanner leer=new Scanner(System.in);
		
		String pausa = "";
		
		System.out.println("Estudio Estructuras de Repetición");
		
		System.out.println("Bucle For *************");
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println(i);
			
		}
		System.out.println("pulsa para continuar");
		pausa=leer.next();
		System.out.println("======================");
		
		for (int i = 1; i < 11; i += 2) {
			
			System.out.println(i);
			
		}
		System.out.println("pulsa para continuar");
		pausa=leer.next();
		System.out.println("======================");
		
		for (int i = 10; i > 0; i--) {
			
			System.out.println(i);
			
		}
		System.out.println("pulsa para continuar");
		pausa=leer.next();
		
		System.out.println("Bucle While ************");
		
		int i = 1;
		
		while (i < 11) {
			
			System.out.println(i);
			i++;
			
		}
		
		System.out.println("pulsa para continuar");
		pausa=leer.next();
		
		System.out.println("Bucle do while***********");
		
		i = 1;
		
		do {
			
			System.out.println(i);
			i++;
			
		} while (i < 11);
		
	}

}
