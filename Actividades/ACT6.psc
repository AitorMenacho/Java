Proceso ACT6
	
	Definir num1, num2 Como Real;
	
	Escribir "Números a comprobar";
	Escribir "Primer número";
	Leer num1;
	Escribir "Segundo número";
	Leer num2;
	
	Si num1>num2 Entonces
		Escribir num1," es mayor que ",num2;
	SiNo
		si num2>num1 Entonces
			Escribir num2, " es mayor que ",num1;
		SiNo
			Escribir "Los números son iguales";
		FinSi
	Fin Si
	
FinProceso
