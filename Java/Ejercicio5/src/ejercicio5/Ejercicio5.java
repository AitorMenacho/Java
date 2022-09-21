package ejercicio5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        String nombre = "";
        int numero    = 0;
        double nota1  = 0;
        double nota2  = 0;
        boolean correcto = true;
        
        Scanner entrada = new Scanner(System.in);
        
        do{

            System.out.print("Introduce el nombre del alumno: ");
            nombre = entrada.nextLine();

            if (contieneNumero(nombre) || nombre.equals("")) {

                correcto = false;
                
            } else {
                
                correcto = true;
                
            }
            
        }while( !correcto );
        
        do{
            System.out.print("Introduce el Nº del alumno: ");
            
            try {
                
                numero = entrada.nextInt();

            } catch (InputMismatchException e) {
                
                numero = 0;
                entrada.next();
            }
            
        }while( numero <= 0 );
        
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
        
        Alumno alum = new Alumno(nombre, numero, nota1, nota2);
        
        System.out.println(alum.toString());
        
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
