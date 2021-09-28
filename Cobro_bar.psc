Proceso cobro_bar
	
	Definir BOCJ Como Real;
	Definir CBOCJ Como Real;
	BOCJ=2.5;
	CBOCJ=0;
	Definir BOCQ Como Real;
	Definir CBOCQ Como Real;
	BOCQ=1.5;
	CBOCQ=0;
	Definir PATF Como Real;
	Definir CPATF Como Real;
	PATF=0.85;
	CPATF=0;
	Definir REFR Como Real;
	Definir CREFR Como Real;
	REFR=0.6;
	CREFR=0;
	DEfinir CERV Como Real;
	DEfinir CCERV Como Real;
	CERV=0.5;
	CCERV=0;
	Definir funcional Como Logico;
	Definir total Como Real;
	Definir x Como Entero;
	
	Definir mesa Como Entero;
	Definir n Como Entero;
	Definir cant Como Entero;
	
	funcional=Verdadero;
	
	Mientras funcional Hacer
		Escribir "¿Que quieres hacer?";
		Escribir "1. Tomar nota de mesa";
		Escribir "2. Salir";
		Leer X;
		
		Segun x Hacer
			1:
				Escribir "Mesa";
				Leer mesa;
				
				Repetir
					Escribir "¿Que ha tomado?";
					Escribir "1. Bocadillo de jamón";
					Escribir "2. Bocadillo de queso";
					Escribir "3. Patatas fritas";
					Escribir "4. Refresco";
					Escribir "5. Cerveza";
					Escribir "6. Cerrar cuenta";
					Leer n;
					
					Segun n Hacer
						1:
							Escribir "¿Cuantos bocadillos de jamón?";
							Leer cant;
							CBOCJ=CBOCJ+cant;
							
						2:
							Escribir "¿Cuantos bocadillos de queso?";
							Leer cant;
							CBOCQ=CBOCQ+cant;
						3:
							Escribir "¿Cuantos bocadillos de patatas fritas?";
							Leer cant;
							CPATF=CPATF+cant;
						4:
							Escribir "¿Cuantos refrescos?";
							Leer cant;
							CREFR=CREFR+cant;
						5:
							Escribir "¿Cuantas cervezas?";
							Leer cant;
							CCERV=CCERV+cant;
						6:
							Escribir "Mesa:",mesa;
							Si CBOCJ>0 Entonces
								BOCJ=BOCJ*CBOCJ;
								Escribir "Bocadillos de jamón ",CBOCJ,".................",BOCJ," euros";
							SiNo
								BOCJ=BOCJ*CBOCJ;
							Fin Si
							
							Si CBOCQ>0 Entonces
								BOCQ=BOCQ*CBOCQ;
								Escribir "Bocadillos de queso ",CBOCQ,".................",BOCQ," euros";
							SiNo
								BOCQ=BOCQ*CBOCQ;
							Fin Si
							
							Si CPATF>0 Entonces
								PATF=PATF*CPATF;
								Escribir "Patatas fritas ",CPATF,"......................",PATF," euros";
							SiNo
								PATF=PATF*CPATF;
							Fin Si
							
							Si CREFR>0 Entonces
								REFR=REFR*CREFR;
								Escribir "Refrescos ",CREFR,"...........................",REFR," euros";
							SiNo
								REFR=REFR*CREFR;
							Fin Si
							
							Si CCERV>0 Entonces
								CERV=CERV*CCERV;
								Escribir "Cervezas ",CCERV,"............................",CERV," euros";
							SiNo
								CERV=CERV*CCERV;
							Fin Si
							
							
							total=BOCJ+BOCQ+PATF+REFR+CERV;
							Escribir "==========================================================";
							
							Escribir "Total.................................",total," euros";
							
							Escribir "==========================================================";
							
						De Otro Modo:
							Escribir "Seleccione una opción valida";
					Fin Segun
					
				Hasta Que n=6;
				
			2:
				funcional=falso;
			De Otro Modo:
				Escribir "Selecciona una opción valida";
		Fin Segun
	Fin Mientras
	
FinProceso
