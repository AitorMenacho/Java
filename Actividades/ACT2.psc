Proceso ACT2
	
	Definir euros,PESETAS Como Real;
	Definir n Como Entero;
	
	PESETAS=166.386;
	
	Escribir "¿Cuantos euros quiere cambiar a pesetas?";
	Leer euros;
	
	Escribir "Escribe con números a que moneda quieres cambiarlo?";
	Escribir " ";
	
	Leer n;
	
	Segun n Hacer
		opcion_1:
			secuencia_de_acciones_1
		opcion_2:
			secuencia_de_acciones_2
		opcion_3:
			secuencia_de_acciones_3
		De Otro Modo:
			secuencia_de_acciones_dom
	Fin Segun
	
	Escribir "Al cambio ",euros," serían: ";
	Escribir euros*PESETAS," pesetas";
	
FinProceso
