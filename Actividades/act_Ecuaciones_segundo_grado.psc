Proceso act_Ecuaciones_segundo_grado
	
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	Definir ecuacion Como Real;
	Definir ecuacion2 Como Real;
	Definir det Como Real;
	
	Escribir "Escribe la b de la ecuación";
	Leer b;
	
	Escribir "Escribe la a de la ecuación";
	Leer a;
	
	Escribir "Escribe la c de la ecuacin";
	Leer c;
	
	det=b^2-4*a*c;
	
	si det>=0 Entonces
		
		ecuacion=(-b+raiz(det))/(2*a);
		ecuacion2=(-b-raiz(det))/(2*a);
		
		Escribir "-",b,"+ raiz(",b,"²-4 x",a," x ",c,")";
		
		Escribir "x1:",ecuacion;
		Escribir "x2:",ecuacion2;
		
	SiNo
		
		Escribir "Esta ecuación no tiene resultado reales";
		
	FinSi
	
	
	
	
FinProceso
