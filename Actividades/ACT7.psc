Proceso ACT7
	
	Definir ganancias Como Real;
	Definir impuestos Como Real;
	Definir precio_coche Como Real;
	Definir coste_final Como Real;
	Definir suma_porcentajes como Real;
	
	Escribir "¿Que precio tiene el vehículo?";
	Leer precio_coche;
	
	ganancias=precio_coche*0.12;
	impuestos=(precio_coche-ganancias)*0.06;
	
	coste_final=precio_coche-ganancias-impuestos
	
	Escribir "El coste real sería: ",coste_final;
	Escribir "Porcentaje sumado al precio: ",ganancias+impuestos," euros";
	
FinProceso
