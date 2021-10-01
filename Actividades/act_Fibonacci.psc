Proceso act_Fibonacci
	
	Definir anterior Como Entero;
	Definir siguiente Como Entero;
	Definir f Como Entero;
	Definir n Como Entero;
	Definir c Como Entero;
	
	siguiente=1
	
	Escribir "¿Cuantos números quieres ver?";
	Leer n;
	
	Repetir
		
		f=anterior+siguiente;
		
		anterior=siguiente;
		
		Escribir f;
		
		siguiente=f;
		
		c=c+1;
		
	Hasta Que c=n;
	
	
FinProceso
