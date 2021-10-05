Proceso act_Fibonacci
	
	Definir ant Como Entero;
	Definir sig Como Entero;
	Definir num Como Entero;
	Definir sum Como Entero;
	Definir x Como Entero;
	Definir serie Como Cadena;
	
	serie="";
	ant=1;
	sig=0;
	
	Escribir "¿Cuantos números de fibonacci quieres ver?";
	Leer num;

	Para x=1 Hasta num Con Paso 1 Hacer
		
		sum=ant+sig;
		serie=serie+ConvertirATexto(sum)+" ";
		
		ant=sig;
		sig=sum;
		
	Fin Para
	
	Escribir serie;
	
FinProceso
