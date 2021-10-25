Algoritmo Bucle_Mientras
	//Definimos las variables.
	Definir x Como Entero;
	Definir tabla Como Entero;
	//Preguntamos y guardamos la respuesta en una variable
	Escribir "¿Que tabla quiere aprender?";
	Leer tabla;
	
	Escribir "================ Mientras ===================="
	
	//Ejecutamos el bucle siempre que x sea menor o igual que 10.
	Mientras x<10 Hacer
		x=x+1;
		Escribir tabla,"x",x," = ",tabla*x;
	Fin Mientras
	
	Escribir "================ REPETIR ===================="
	
	//Igualamos la x a 0 para vaciarla y poder usarla de nuevo.
	X=0;
	
	Repetir
		x=x+1
		Escribir  tabla,"x",x," = ",tabla*x;
	Hasta Que x>=10;
	
FinAlgoritmo

