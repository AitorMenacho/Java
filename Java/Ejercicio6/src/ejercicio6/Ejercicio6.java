package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el modelo del vehículo");
        String modelo = sc.nextLine();
        System.out.println("¿Tiene tracción? (s/n)");
        String trac = sc.nextLine();
        System.out.println("¿Que potencía tine el vehículo?");
        int potencia = sc.nextInt();
        
        String traccion;
        
        if( trac.equals("s") ){
            
            traccion = "Tiene traccion";
            
        } else{
            
            traccion = "No tiene traccion";
            
        }
        
        vehiculo vh = new vehiculo(modelo, traccion, potencia);
        
        System.out.println(vh.toString());
        
    }
    
}
