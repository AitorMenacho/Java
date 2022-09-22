package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean correcto = true;
        String resultado = "";
        int num = 0;
        
        do{
           
            System.out.print("Teclea un número mayor de 10 y menor de 30: ");
            
            try {               

                num = sc.nextInt();
                
                if( num < 10 | num > 30 ){

                    correcto = false;

                } else {

                    correcto = true;

                }

                if( (num % 5) == 0 ){

                    resultado = "El número " + num + " es divisible entre 5";

                } else {


                    resultado = "El número " + num + " no es divisible entre 5";

                }
                
            } catch (InputMismatchException e) {
            
                correcto = false;
                num = 0;
                sc.next();
                
            }
            
        
        }while( !correcto );
        
        System.out.println(resultado);
        
        System.out.print("Escribre tu nombre: ");
        String nombre = sc.next();
        
        char primeraLetra = nombre.charAt(0);
        
        System.out.println("Primera letra: " + primeraLetra );
        
        char ultimaLetra  = nombre.charAt(nombre.length() - 1);
        
        System.out.println("Ultima letra: " + ultimaLetra);
        
        String mayuscula = nombre.toUpperCase();
        
        System.out.println("Tu nombre en mayuscula: " + mayuscula);
        
        String minuscula = nombre.toLowerCase();
        
        System.out.println("Tu nombre en minuscula: " + minuscula);
        
        if( nombre.contains("p") || nombre.contains("P") ){
            
            System.out.println("Tu nombre contiene la letra p");
            
        } else {
            
            System.out.println("Tu nombre no continene la letra p");
            
        }
        
    }
    
}
