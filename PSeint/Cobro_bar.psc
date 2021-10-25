Proceso cobro_bar
	
	Definir BOCJ Como Real;//En esta variable guardamos el precio del bocadillo de jamón
	Definir CBOCJ Como Real;//Cantidad de bocadillos de jamón
	BOCJ=2.5;
	CBOCJ=0;
	Definir BOCQ Como Real;//En esta variable guardamos el precio del bocadillo de queso
	Definir CBOCQ Como Real;//Cantidad de bocadillos de queso
	BOCQ=1.5;
	CBOCQ=0;
	Definir PATF Como Real;//En esta variable guardamos el precio del bocadillo de patatas fritas
	Definir CPATF Como Real;//Cantidad de patatas fritas
	PATF=0.85;
	CPATF=0;
	Definir REFR Como Real;//En esta variable guardamos el precio de los refrescos
	Definir CREFR Como Real;//Cantidad de refrescos
	REFR=0.6;
	CREFR=0;
	DEfinir CERV Como Real;//En esta variable guardamos el precio de cervezas
	DEfinir CCERV Como Real;//Cantidad de cervezas
	CERV=0.5;
	CCERV=0;
	
	Definir funcional Como Logico;//Esta variable es la que mantiene activo el programa
	Definir total Como Real;//Precio final de todo lo pedido
	Definir x Como Entero;//El cliente guarda lo que quiere hacer
	
	Definir mesa Como Entero;//Guardamos la mesa
	Definir n Como Entero;//El cliente guarda lo que quiere hacer
	Definir cant Como Entero;//Cantidad de lo que quiere el cliente
	
	funcional=Verdadero;//Se coloca en verdadero para que el programa funcione hasta que sea falso
	
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
							CBOCJ=CBOCJ+cant;//Sumamos la cantidad de bocadillos de jamón más la cantidad anterior
							
						2:
							Escribir "¿Cuantos bocadillos de queso?";
							Leer cant;
							CBOCQ=CBOCQ+cant;//Sumamos la cantidad de bocadillos de queso más la cantidad anterior
						3:
							Escribir "¿Cuantos bocadillos de patatas fritas?";
							Leer cant;
							CPATF=CPATF+cant;//Sumamos la cantidad de patatas fritas más la cantidad anterior
						4:
							Escribir "¿Cuantos refrescos?";
							Leer cant;
							CREFR=CREFR+cant;//Sumamos la cantidad de refrescos más la cantidad anterior
						5:
							Escribir "¿Cuantas cervezas?";
							Leer cant;
							CCERV=CCERV+cant;//Sumamos la cantidad de cervezas más la cantidad anterior
						6:
							Escribir "Mesa:",mesa;
							Si CBOCJ>0 Entonces
								BOCJ=BOCJ*CBOCJ;
								Escribir "Bocadillos de jamón ",CBOCJ,".................",BOCJ," euros";
							SiNo CBOCJ=0
								BOCJ=BOCJ*CBOCJ;
							Fin Si
							
							Si CBOCQ>0 Entonces
								BOCQ=BOCQ*CBOCQ;
								Escribir "Bocadillos de queso ",CBOCQ,".................",BOCQ," euros";
							SiNo CBOCQ=0
								BOCQ=BOCQ*CBOCQ;
							Fin Si
							
							Si CPATF>0 Entonces
								PATF=PATF*CPATF;
								Escribir "Patatas fritas ",CPATF,"......................",PATF," euros";
							SiNo CPATF=0
								PATF=PATF*CPATF;
							Fin Si
							
							Si CREFR>0 Entonces
								REFR=REFR*CREFR;
								Escribir "Refrescos ",CREFR,"...........................",REFR," euros";
							SiNo CREFR=0
								REFR=REFR*CREFR;
							Fin Si
							
							Si CCERV>0 Entonces
								CERV=CERV*CCERV;
								Escribir "Cervezas ",CCERV,"............................",CERV," euros";
							SiNo CCERV=0
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
