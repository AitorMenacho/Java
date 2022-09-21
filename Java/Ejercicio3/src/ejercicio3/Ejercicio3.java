/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 100;
        int suma = 0;
        
        while( num < 150 ){
            
            if( num % 3 == 0 && num % 7 == 0 ){
                
                System.out.print(num + ", ");
                suma += num;
                
            }
            
            num++;
            
        }
        System.out.println("");
        System.out.print("suma: " + suma);
        
    }
    
}
