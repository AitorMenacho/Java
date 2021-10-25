Proceso Menu
	//Definimos variables
	Definir op Como Entero;
	
	//Colocamos las opciones que tendrá el usuario
	Escribir "1.- Opción 1";
	Escribir "2.- Opción 2";
	Escribir "3.- Opción 3";
	Escribir "4.- Opción 4";
	Escribir "5.- Salir";
	
	//Dejamos uno libre para dar un espacio y luego preguntamos y leemos la respuesta en esa
	//variable.
	Escribir "";
	Escribir "Elija una opción";
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
			//En caso de no pulsar un número fuera de las opciones.
			Escribir "Esa no es una opción correcta, vuelva a probar";
			
	Fin Segun
	
FinProceso
