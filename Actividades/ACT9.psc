Proceso ACT9
	
	Definir suspensos Como Real;
	Definir aprobados Como Real;
	Definir bien Como Real;
	Definir notable Como Real;
	Definir sobresaliente Como Real;
	Definir alumnos Como Real;
	Definir superado como Real;
	
	Escribir "¿Cuantos alumnos han suspendido?";
	Leer suspensos;
	Escribir "¿Cuantos alumnos han aprobado con suficiente?";
	Leer aprobados;
	Escribir "¿Cuantos alumnos han aprobado con bien?";
	Leer bien;
	Escribir "¿Cuantos alumnos han aprobado con notable?";
	Leer notable;
	Escribir "¿Cuantos alumnos han aprobado con sobresaliente?";
	Leer sobresaliente;
	
	alumnos=suspensos+aprobados+bien+notable+sobresaliente;
	
	Escribir " ";
	superado=(alumnos-suspensos)*100/alumnos;
	Escribir "Ha aprobado un ",superado,"% de los alumnos";
	
	Escribir " ";
	
	suspensos=suspensos*100/alumnos;
	aprobados=aprobados*100/alumnos;
	bien=bien*100/alumnos;
	notable=notable*100/alumnos;
	sobresaliente=sobresaliente*100/alumnos;
	
	Escribir "Un ",suspensos,"% de la clase ha suspendido";
	Escribir "Un ",aprobados,"% de la clase ha aprobado con suficiente";
	Escribir "Un ",bien,"% de la clase ha aprobado con bien";
	Escribir "Un ",notable,"% de la clase ha aprobado con notable";
	Escribir "Un ",sobresaliente,"% de la clase ha aprobado con sobresaliente";
	
	
FinProceso
