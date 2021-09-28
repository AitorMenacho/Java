Proceso ACT8
	
	Definir bocadillo_jamon, bocadillo_queso, patatas_fritas, refrescos, cerveza Como Real;
	Definir numcarta,num1,num2,num3,num4,num5 Como Entero;
	
	bocadillo_jamon=2.5;
	bocadillo_queso=1.5;
	patatas_fritas=0.85;
	refrescos=0.6;
	cerveza=0.5;
	
	Repetir
		
		Escribir "Carta";
		Escribir "--------------------------";
		Escribir "1. Bocadillo de jamón";
		Escribir "2. Bocadillo de queso";
		Escribir "3. Patatas fritas";
		Escribir "4. Refrescos";
		Escribir "5. Cerveza";
		Escribir "6. Ver total";
		Escribir "--------------------------";
		Escribir "¿Que han pedido?";
		Leer numcarta;
		
		Segun numcarta Hacer
			1:
				Escribir "Cuantos bocadillos de jamón";
				Leer num1;
			2:
				Escribir "Cuantos bocadillos de jamón";
				Leer num2;
			3:
				Escribir "Cuantos bocadillos de jamón";
				Leer num3;
			4:
				Escribir "Cuantos bocadillos de jamón";
				Leer num4;
			5:
				Escribir "Cuantos bocadillos de jamón";
				Leer num5;
		Fin Segun
		
	Hasta Que numcarta=6;
	
	
FinProceso
