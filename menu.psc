Proceso Menu
	//Definimos variables
	Definir op Como Entero;
	
	//Colocamos las opciones que tendr� el usuario
	Escribir "1.- Opci�n 1";
	Escribir "2.- Opci�n 2";
	Escribir "3.- Opci�n 3";
	Escribir "4.- Opci�n 4";
	Escribir "5.- Salir";
	
	//Dejamos uno libre para dar un espacio y luego preguntamos y leemos la respuesta en esa
	//variable.
	Escribir "";
	Escribir "Elija una opci�n";
	Leer op;
	
	//Ejecutamos el programa dandole respuesta a cada valor.
	Segun op Hacer
		1:
			Escribir "Programa 1";
		2:
			Escribir "Programa 2";
		3:
			Escribir "Programa 3";
		4:
			Escribir "Programa 4";
		5:
			Escribir "Gracias por usar nuestra app";
			
		De Otro Modo:
			//En caso de no pulsar un n�mero fuera de las opciones.
			Escribir "Esa no es una opci�n correcta, vuelva a probar";
			
	Fin Segun
	
FinProceso
