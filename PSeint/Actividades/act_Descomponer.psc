Proceso act_Descomponer_numeros
	
	//Definimos las variables
	Definir N Como Entero;
	Definir part Como real;
	Definir divisor Como Real;
	Definir seamayordecinco Como Logico;
	
	//Igualamos el divisor a la misma cantidad de n�meros que vamos a intrudir, en este caso 5.
	divisor=10000
	
	//Repetimos la pregunta hasta que acierte con la cantidad
	Repetir
		
		Escribir "Introduzca 5 n�meros, por favor";
		Leer N;
		
		//Hacemos el calculo para asegurarnos que entran todos los n�mero con 5 cifras.
		seamayordecinco= N>9999 Y N<100000
		
	Hasta Que seamayordecinco;	
	
	//Cuando est� correcto iniciamos los calculos
	si seamayordecinco
	
		Repetir
			
			//Hacemos la divisi�n del n�mero y truncamos para quedarnos con el n�mero que queremos.
			part=TRUNC(N/divisor);
			
			//Lo mostramos en pantalla
			Escribir part;
			
			//Dividimos el divisor entre 10 para restarle 0 y as� que muestre mas cantidad del n�mero introducido.
			divisor=divisor/10;

		Hasta Que divisor<10
		
		Escribir N;
	
	FinSi
	
	
	
	
	
FinProceso
