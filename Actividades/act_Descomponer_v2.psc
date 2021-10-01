Proceso act_Descomponer_numeros_v2
	
	Definir N Como Entero;
	Definir part Como real;
	Definir divisor Como Real;
	
	Escribir "Introduzca un número con un máximo de 20 carácteres";
	Leer N;
	
	divisor=100000000000000000000
		
		Repetir
			
			divisor=divisor/10;
			
			part=N/divisor
			
			si part>=1 Entonces
				
				Escribir TRUNC(part);
				
			FinSi
		
			
		Hasta Que divisor<10
	
FinProceso
