Proceso ACT6
	
	Definir num1, num2 Como Real;
	
	Escribir "N�meros a comprobar";
	Escribir "Primer n�mero";
	Leer num1;
	Escribir "Segundo n�mero";
	Leer num2;
	
	Si num1>num2 Entonces
		Escribir num1," es mayor que ",num2;
	SiNo
		si num2>num1 Entonces
			Escribir num2, " es mayor que ",num1;
		SiNo
			Escribir "Los n�meros son iguales";
		FinSi
	Fin Si
	
FinProceso
