Proceso ACT13
	
	Definir X Como Real;//Guardar� el dato del cliente.
	Definir n Como Real;//Suma el dato del cliente m�s el anterior
	Definir z Como Entero;//Contador para saber cuantos n�meros ha metido el cliente.
	
	X=0;
	n=0;
	z=0;
	
	Mientras X>=0 Hacer
		
		Escribir "Pon el n�mero que quiera para la media. Para terminar pon un n�mero negativo";
		Leer x;
		
		z=z+1;
		
		n=x+n;
		
	Fin Mientras
	
	n=n-x;//Hacemos una resta de la suma total m�s el �ltimo dato, ya que al ser negativo se sumar� y no perderemos datos.
	z=z-1;//Restamos uno al contador porque ha contado el �ltimo n�mero negativo.
	
	n=n/z;//Hacemos la media de la suma y los n�meros introducidos.
	
	Escribir "La media es: ",n;
	
FinProceso
