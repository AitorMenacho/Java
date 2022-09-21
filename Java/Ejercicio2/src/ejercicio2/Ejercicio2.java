/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Números primos menores de 15");
        //Divisible solo por el mismo y por uno
        
        int num = 1;
        boolean primo = false;
        
        System.out.print("1, 2, ");
        
        while( num < 15 ){
            
            for( int x = 2; x < num; x++ ){
                
                if( num % x == 0 ){
                    
                    primo = false;
                    break;
                    
                } else {
                    
                    primo = true;
                    
                }
                
            }
            
            if( primo ) System.out.print( num + ", ");
            
            num++;
            
        }
        
    }
    
}
