Proceso act_Binario_a_decimal
	
	Definir decimal Como Entero;
	Definir binario Como Entero;
	Definir cociente Como Real;
	
	Escribir "¿Que número quiere pasar a binario?";
	Leer decimal;
	
	Repetir
		
		binario= decimal MOD 2;
		
		cociente=decimal/2;
		
		decimal=TRUNC(cociente);
		
		Escribir binario;
		
	Hasta Que decimal=0
	
FinProceso
