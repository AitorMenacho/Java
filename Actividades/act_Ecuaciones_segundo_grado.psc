Proceso act_Ecuaciones_segundo_grado
	
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	Definir ecuacion Como Real;
	Definir simbolo Como Caracter;
	
	Escribir "Escribe la b de la ecuaci�n";
	Leer b;
	
	Escribir "Escribe la a de la ecuaci�n";
	Leer a;
	
	Escribir "Escribe la c de la ecuacin";
	Leer c;
	
	Escribir "quiere sumar o restar";
	leer simbolo
	
	si simbolo="sumar" Entonces
		
		ecuacion=-b+raiz((b*b)-4*a*c)/2*a;
		
	SiNo
		
		ecuacion=-b-raiz((b*b)-4*a*c)/2*a;
		
	FinSi
	
	Escribir "-",b,"+ raiz(",b,"�-4 x",a," x ",c,")";
	
	Escribir ecuacion;
	
	
FinProceso
