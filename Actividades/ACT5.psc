Proceso ACT5
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	
	Escribir "�Que n�mero quiere comprobar?";
	Leer num1;
	
	num2=num1 MOD 2;
	
	Si num2=0 Entonces
		Escribir "El n�mero es par";
	SiNo
		Escribir "El n�mero no es par";
	Fin Si
	
	
FinProceso
