Proceso act_Ecuaciones_segundo_grado
	
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	Definir ecuacion Como Real;
	Definir ecuacion2 Como Real;
	Definir det Como Real;
	
	Escribir "Escribe la b de la ecuaci�n";
	Leer b;
	
	Escribir "Escribe la a de la ecuaci�n";
	Leer a;
	
	Escribir "Escribe la c de la ecuacin";
	Leer c;
	
	det=b^2-4*a*c;
	
	si det>=0 Entonces
		
		ecuacion=(-b+raiz(det))/(2*a);
		ecuacion2=(-b-raiz(det))/(2*a);
		
		Escribir "-",b,"+ raiz(",b,"�-4 x",a," x ",c,")";
		
		Escribir "x1:",ecuacion;
		Escribir "x2:",ecuacion2;
		
	SiNo
		
		Escribir "Esta ecuaci�n no tiene resultado reales";
		
	FinSi
	
	
	
	
FinProceso
