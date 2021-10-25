Proceso ACT2
	
	Definir euros Como Real;
	
	Definir DOLAR Como Real;
	Definir LIBRA Como Real;
	Definir FRANCO Como Real;
	Definir YEN Como Real;
	Definir BITCOIN Como Real;
	
	Definir PESETAS Como Real;
	Definir ESCUDO Como Real;
	Definir LIRA Como Real;
	Definir FRANCO_FR Como Real;
	Definir DRACMA Como Real;
	
	Definir salir Como Logico;
	Definir terminar Como Logico;
	Definir n Como Entero;
	
	DOLAR=1.16;
	LIBRA=0.85;
	FRANCO=1.07;
	YEN=129;
	BITCOIN=0.000023;
	
	PESETAS=166.386;
	ESCUDO=1936.27;
	LIRA=1936.27 ;
	FRANCO_FR=6.55957 ;
	DRACMA=340.75;
	
	Escribir "¿Cuantos euros quiere cambiar?";
	Leer euros;
	
	n=0;
	terminar=Verdadero;
	
	Mientras terminar=Verdadero Hacer
		Escribir "¿A que clase de moneda lo quieres cambiar?";
		Escribir "1. Moneda actual";
		Escribir "2. Moneda antigua";
		Escribir "3. Salir";
		Leer n;
		
		segun n Hacer
			
			1:
				n=0;
				salir=Verdadero
				
				Mientras salir=Verdadero Hacer
					
					Escribir "A que moneda quieres cambiarlo?";
					Escribir "1. Dolar";
					Escribir "2. Libra";
					Escribir "3. Franco suizo";
					Escribir "4. Yen";
					Escribir "5. Bitcoin";
					Escribir "6. Cerrar";
					
					Leer n;
					
					Segun n Hacer
						
						1:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*DOLAR," dolares";
							Escribir "------------------------------------";
							Escribir " ";
						2:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*LIBRA," libras";
							Escribir "------------------------------------";
							Escribir " ";
						3:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*FRANCO," francos suizos";
							Escribir "------------------------------------";
							Escribir " ";
						4:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*YEN," yenes";
							Escribir "------------------------------------";
							Escribir " ";
						5:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*BITCOIN," bitcoins";
							Escribir "------------------------------------";
							Escribir " ";
						6:
							salir=Falso;
							
						De Otro Modo:
							Escribir "No ha escogido una opción correcta";
					Fin Segun
					
				FinMientras
				
				
			2:
				
				n=0;
				salir=Verdadero
				
				Mientras salir=Verdadero Hacer
					
					Escribir "A que moneda quieres cambiarlo?";
					Escribir "1. Escudo portugués";
					Escribir "2. Lira italiana";
					Escribir "3. Franco frances";
					Escribir "4. Dracma griego";
					Escribir "5. Peseta";
					Escribir "6. Cerrar";
					
					Leer n;
					
					Segun n Hacer
						
						1:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*ESCUDO," escudos";
							Escribir "------------------------------------";
							Escribir " ";
						2:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*LIRA," liras";
							Escribir "------------------------------------";
							Escribir " ";
						3:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*FRANCO_FR," francos franceses";
							Escribir "------------------------------------";
							Escribir " ";
						4:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*DRACMA," dracmas";
							Escribir "------------------------------------";
							Escribir " ";
						5:
							Escribir " ";
							Escribir "Al cambio ",euros," euros serían: ";
							Escribir euros*PESETAS," pesetas";
							Escribir "------------------------------------";
							Escribir " ";
						6:
							salir=Falso;
							
						De Otro Modo:
							Escribir "No ha escogido una opción correcta";
					Fin Segun
					
				FinMientras
			3:
				terminar=falso;
		FinSegun
	Fin Mientras
	
FinProceso
