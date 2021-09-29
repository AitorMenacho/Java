Proceso ACT13
	
	Definir X Como Real;//Guardará el dato del cliente.
	Definir n Como Real;//Suma el dato del cliente más el anterior
	Definir z Como Entero;//Contador para saber cuantos números ha metido el cliente.
	
	X=0;
	n=0;
	z=0;
	
	Mientras X>=0 Hacer
		
		Escribir "Pon el número que quiera para la media. Para terminar pon un número negativo";
		Leer x;
		
		z=z+1;
		
		n=x+n;
		
	Fin Mientras
	
	n=n-x;//Hacemos una resta de la suma total más el último dato, ya que al ser negativo se sumará y no perderemos datos.
	z=z-1;//Restamos uno al contador porque ha contado el último número negativo.
	
	n=n/z;//Hacemos la media de la suma y los números introducidos.
	
	Escribir "La media es: ",n;
	
FinProceso
