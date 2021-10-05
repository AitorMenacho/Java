Proceso ACT13
	
	Definir num Como Real;//Guardará el dato del cliente.
	Definir suma Como Real;//Suma el dato del cliente más el anterior
	Definir contador Como Entero;//Contador para saber cuantos números ha metido el cliente.
	
	num=0;
	suma=0;
	contador=0;
	
	Escribir "Pon el número que quiera para la media. Para terminar pon un número negativo";
	
	Mientras num>=0 Hacer
		
		Leer num;
		
		contador=contador+1;
		
		suma=num+suma;
		
	Fin Mientras
	
	suma=suma-num;//Hacemos una resta de la suma total más el último dato, ya que al ser negativo se sumará y no perderemos datos.
	contador=contador-1;//Restamos uno al contador porque ha contado el último número negativo.
	
	suma=suma/contador;//Hacemos la media de la suma y los números introducidos.
	
	Escribir "La media es: ",suma;
	
FinProceso
