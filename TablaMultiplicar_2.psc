Proceso TablaMultiplicar_2
	//Definimos las variables que vamos a usar más adelante.
	Definir X Como Entero;
	Definir Tabla Como Entero;
	Definir Resultado Como Entero;
	//Preguntamos al cliente.
	Escribir "¿Que tabla desea aprender?";
	//Leemos la respuesta para usarla en la varibale Tabla.
	Leer Tabla;
	//Realizamos un bucle que repitirá la acción 10 veces aumentando 1 la variable X con cada vuelta.
	Para X<-1 Hasta 10 Con Paso 1 Hacer
		//Hace la multiplicación de Tabla que es lo elegido por el cliente por X que es la variable que aumenta por el bucle.
		Resultado=Tabla*X;
		//Escribimos el resultado.
		Escribir tabla," x ", X ," = ",resultado;
	Fin Para
FinProceso
