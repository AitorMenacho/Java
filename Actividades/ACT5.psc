Proceso ACT5
	Definir num1, resto Como Entero;
	
	Escribir "¿Que número quiere comprobar?";
	Leer num1;
	
	resto=num1 MOD 2;
	
	Si resto=0 Entonces
		Escribir "El número es par";
	SiNo
		Escribir "El número no es par";
	Fin Si
	
	
FinProceso
