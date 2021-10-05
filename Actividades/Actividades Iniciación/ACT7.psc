Proceso ACT7
	
	Definir GANANCIAS, IMPUESTOS, precio_coche Como Real;
	Definir suma_porcentajes,coste_final Como Real;
	Definir IM, GAN como Real;
	
	IM=0.06;
	GAN=0.12;
	
	Escribir "¿Que precio tiene el vehículo?";
	Leer precio_coche;
	
	GANANCIAS=precio_coche*GAN;
	IMPUESTOS=precio_coche*IM;
	
	coste_final=precio_coche+GANANCIAS+IMPUESTOS
	
	
	Escribir "Ganancias: ",ganancias," euros";
	Escribir "Impuestos: ",IMPUESTOS," euros";
	Escribir "Coste fabricación: ",precio_coche," euros";
	Escribir "Coste final: ",coste_final," euros";
	
FinProceso
