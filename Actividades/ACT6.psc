Proceso ACT6
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir grande Como Logico;
	Definir mismo Como Logico;
	
	Escribir "Números a comprobar";
	Escribir "Primer número";
	Leer num1;
	Escribir "Segundo número";
	Leer num2;
	
	grande=num1>num2;
	Escribir grande;
	
	Si grande Entonces
		Escribir num1," es mayor que ",num2;
	SiNo
		Escribir num2," es mayor que ",num1;
	Fin Si
	
	
FinProceso
