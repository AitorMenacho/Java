Proceso act_Descomponer_numeros_v2
	
	Definir num Como Entero;
	Definir cnum Como Entero;
	Definir x Como Entero;
	Definir pot Como Entero;
	Definir numdesc Como Entero;
	
	Escribir "Introduzca el número que quiere descomponer";
	Leer num;
	
	cnum=num;
	x=0;
	
		Repetir
			
			num=TRUNC(num/10);
			x=x+1;
			
		Hasta Que num<10
		
		Escribir "El número tiene ",x+1," números";
		
		pot=10^x;
		num=cnum;
		
		Mientras pot>=10 Hacer
			
			numdesc=TRUNC(num/pot);
			pot=pot/10;
			
			Escribir numdesc;
			
		FinMientras
		
		Escribir num;
		
FinProceso
