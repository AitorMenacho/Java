Proceso act_Binario_a_decimal
	
	//Definimos todas las variables.
	Definir decimal Como Entero;
	Definir resto Como Entero;
	Definir cdecimal Como Entero;
	//Esta variable nos servir� para almacenar cadenas.
	Definir binario Como Cadena;
	
	//Leemos y almacenamos el n�mero que nos da el cliente.
	Escribir "�Que n�mero quiere pasar a binario?";
	Leer decimal;
	
	//Guardamos el n�mero en otro para usarlo m�s adelante sin que est� modificado.
	cdecimal=decimal;
	
	//En caso de que el n�mero sea mayor que 1 iniciamos el calculo, si no vamos directamente al resultado.
	SI decimal>1 Entonces
		
		//Repetimos el calculo hasta que la divisi�n da 1.
		Repetir
			
			//Sacamos el resto del decimal que tengamos.
			resto= decimal MOD 2;
			
			//Truncamos la divisi�n para eliminar los decimales.
			decimal=TRUNC(decimal/2);
			
			//Guardamos en la cadena el resto que tengamos convirtiendolo a texto para que pueda almacenarlo.
			binario=ConvertirATexto(resto)+binario;
			
		Hasta Que decimal=1 
		
		//Almacenamos el �ltimo n�mero.
		binario=ConvertirATexto(decimal)+binario;
		
		//Mostramos en pantalla el n�mero introducido y el n�mero en binario.
		Escribir cdecimal " = " binario;
		
	SiNo
		
		//transformamos en texto el n�mero introducido.para poder guardarlo en la cadena
		binario=ConvertirATexto(decimal);
		
		//Mostramos en pantalla el n�mero introducido y como es menor o igual que 1 se muestra el mismo como binario.
		Escribir cdecimal," = ",binario;
		
	FinSi
	
FinProceso
