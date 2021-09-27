Proceso ACT5
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	
	Escribir "¿Que número quiere comprobar?";
	Leer num1;
	
	num2=num1 MOD 2;
	
	Si num2=0 Entonces
		Escribir "El número es par";
	SiNo
		Escribir "El número no es par";
	Fin Si
	
	
FinProceso
