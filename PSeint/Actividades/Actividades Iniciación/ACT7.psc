Proceso ACT7
	
	Definir GANANCIAS Como Real;
	Definir IMPUESTOS Como Real;
	Definir precio_coche Como Real;
	
	Definir suma_porcentajes Como Real;
	Definir coste_final Como Real;
	Definir IM Como Real;
	Definir GAN como Real;
	
	IM=0.06;
	GAN=0.12;
	
	Escribir "¿Que precio tiene el vehículo?";
	Leer precio_coche;
	
	GANANCIAS=precio_coche*GAN;
	IMPUESTOS=precio_coche*IM;
	
	coste_final=precio_coche+GANANCIAS+IMPUESTOS
	
	
	Escribir "Ganancias: ",ganancias," euros";
	Escribir "Impuestos: ",IMPUESTOS," euros";
	Escribir "Fabricación: ",precio_coche," euros";
	Escribir "--------------------------------------";
	Escribir "Coste final: ",coste_final," euros";
	
FinProceso
