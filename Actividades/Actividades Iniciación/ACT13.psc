Proceso ACT13
	
	Definir num Como Real;//Guardar� el dato del cliente.
	Definir suma Como Real;//Suma el dato del cliente m�s el anterior
	Definir contador Como Entero;//Contador para saber cuantos n�meros ha metido el cliente.
	
	num=0;
	suma=0;
	contador=0;
	
	Escribir "Pon el n�mero que quiera para la media. Para terminar pon un n�mero negativo";
	
	Mientras num>=0 Hacer
		
		Leer num;
		
		contador=contador+1;
		
		suma=num+suma;
		
	Fin Mientras
	
	suma=suma-num;//Hacemos una resta de la suma total m�s el �ltimo dato, ya que al ser negativo se sumar� y no perderemos datos.
	contador=contador-1;//Restamos uno al contador porque ha contado el �ltimo n�mero negativo.
	
	suma=suma/contador;//Hacemos la media de la suma y los n�meros introducidos.
	
	Escribir "La media es: ",suma;
	
FinProceso
