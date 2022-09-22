package ejercicio8;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        String nombre = "";
        int numero    = 0;
        double nota1  = 0;
        double nota2  = 0;
        boolean correcto = true;
        int cont = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        AlumnoController controlador = new AlumnoController();
        
        List<Alumno> alumnos = controlador.matriculaAlum();
        
        System.out.println("Programa de gestión de matrículas");
        
        do {            
            
            do{
                System.out.print("Número de matrícula (<0 para finalizar) : ");

                try {

                    numero = entrada.nextInt();

                } catch (InputMismatchException e) {

                    numero = 0;
                    entrada.next();
                }
                

            }while( numero == 0 );
            
            if( numero < 0 ) break;
            
            do{

                System.out.print("Introduce el nombre del alumno: ");
                nombre = entrada.nextLine();

                if ( contieneNumero(nombre) || nombre.equals("")) {

                    correcto = false;

                } else {

                    correcto = true;

                }

            }while( !correcto );

            do{
                System.out.print("Introduce la primera nota: ");

                try {

                    nota1 = entrada.nextDouble();

                    if( nota1 > 10 ) nota1 = -1;

                } catch (InputMismatchException e) {

                    nota1 = 0;
                    entrada.next();
                }

            }while( nota1 <= 0 );

            do{
                System.out.print("Introduce la segunda nota: ");

                try {

                    nota2 = entrada.nextDouble();

                    if( nota2 > 10 ) nota2 = -1;

                } catch (InputMismatchException e) {

                    nota2 = 0;
                    entrada.next();
                }

            }while( nota2 <= 0 );

            controlador.agregar(nombre, numero, nota1, nota2);
            
            nombre = "";
            numero = 0;
            nota1 = 0;
            nota2 = 0;
            
            cont++;
            
        } while ( cont != 10 );
        
        System.out.println("");
        
        cont = 0;
        double media = 0;
        
        for( Alumno alum : alumnos ){
                
                System.out.println(alum);
                cont++;
                media += ((alum.examen1 + alum.examen2) / 2);
                
        }
        
        System.out.println("La media es: " + ( media / cont));
        
        System.out.println("Fin del programa");
        
}

    private static boolean contieneNumero(String nombre) {
        
        boolean contiene = false;
        
        for (int x = 0; x < nombre.length(); x++) {
            
            if(Character.isDigit(nombre.charAt(x))){
                contiene = true;
            }
            
        }
        
        return contiene;
    }
        
}
