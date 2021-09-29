Proceso ACT13_V2
	
	Definir X Como Real;
	Definir n Como Real;
	Definir z Como Entero;
	
	X=0;
	n=0;
	z=0;
	
	Repetir
		
		Escribir "Pon el número que quiera sumar para la media";
		Leer x;
		
		z=z+1;
		
		n=x+n;
		
	Hasta Que X<0
	
	n=n-x;
	z=z-1;
	
	n=n/z;
	
	Escribir "La media es: ",n;
	
FinProceso
