Proceso act_Descomponer_numeros
	
	Definir N Como Entero;
	Definir part Como real;
	Definir divisor Como Real;
	
	Escribir "Introduzca 5 números, por favor";
	Leer N;
	
	divisor=100000
	
	si N>9999 Y N<=99999
		
		Repetir
			
			divisor=divisor/10;
			
			part=N/divisor
			Escribir TRUNC(part);
			
		Hasta Que divisor<10
		
	SiNo
		Escribir "Su número no tiene 5 caracteres";
		
	FinSi
	
FinProceso
