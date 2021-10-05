Proceso ACT1
	
	Definir num1 Como Real;
	Definir num2 Como Real;
	Definir x Como Entero;
	Definir salir Como Logico;
	Definir finalizar Como Logico;

	finalizar=Verdadero;
	
	Mientras finalizar=Verdadero Hacer
		
		num1=0;
		num2=0;
		x=0;
		
		Escribir "¿Que quiere hacer?";
		Escribir "1. Cuenta nueva.";
		Escribir "2. Cerrar";
		Leer x;
		
		segun x Hacer
			
			1:
				salir=Verdadero;
				
				Escribir "Primer número para las cuentas";
				Leer num1;
				
				Escribir "Segundo número para las cuentas";
				Leer num2;
				
				Mientras salir=Verdadero Hacer
					
					Escribir "¿Escriba con número que calculo quiere hacer?";
					Escribir "1. Sumar.";
					Escribir "2. Restar.";
					Escribir "3. Multiplicar.";
					Escribir "4. Dividir.";
					Escribir "5. Salir.";
					Leer x;
					
					Segun x Hacer
						
						1:
							Escribir "--------------------------------";
							Escribir "Suma";
							Escribir num1," + ",num2," = ",num1+num2;
							Escribir "--------------------------------";
							Escribir " ";
						2:
							Escribir "--------------------------------";
							Escribir "Resta";
							Escribir num1," - ",num2," = ",num1-num2;
							Escribir "--------------------------------";
							Escribir " ";
						3:
							Escribir "--------------------------------";
							Escribir "Multiplicación";
							Escribir num1," x ",num2," = ",num1*num2;
							Escribir "--------------------------------";
							Escribir " ";
						4:
							Escribir "--------------------------------";
							Escribir "División";
							Escribir num1," / ",num2," = ",num1/num2;
							Escribir "--------------------------------";
							Escribir " ";
						5:
							salir=falso;
							
						De Otro Modo:
							Escribir "No ha seleccionado una opción valida";
							
					Fin Segun
					
				Fin Mientras
				
			2:
				
				finalizar=falso;
				
		FinSegun
		
	FinMientras
	
FinProceso
