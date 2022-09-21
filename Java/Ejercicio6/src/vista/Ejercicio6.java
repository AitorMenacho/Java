package vista;

import controlador.vehiculoController;
import modelo.vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        vehiculoController controlador = null;
        
        try {
            
            controlador = new vehiculoController();
            
            List<vehiculo> lista = controlador.getListaVehiculos();
            
            Scanner sc = new Scanner(System.in);
            boolean salir = false;
            
            do{
                
                System.out.println("Introduce el modelo del vehículo (Escribe salir para terminar)");
                String modelo = sc.next();
                
                if( modelo.equals("salir") ){
                    salir = true;
                    break;
                }
                
                System.out.println("¿Tiene tracción? (s/n)");
                String trac = sc.next();
                
                System.out.println("¿Que potencía tine el vehículo?");
                int potencia = sc.nextInt();

                String traccion;

                if( trac.equals("s") ){

                    traccion = "Tiene traccion";

                } else{

                    traccion = "No tiene traccion";

                }
                
                if( controlador.agregar(modelo, traccion, potencia) ){

                    System.out.println("agregado");
                    System.out.println("");

                }
                
                modelo = "";
                trac = "";
                potencia = 0;
                
                
            }while( !salir );
            
            System.out.println("");
            
            for( vehiculo vehi : lista ){
                
                System.out.println(vehi);
                
            }
            
        } catch (Exception e) {
            
            System.err.println(e.getMessage());
            
        }
        
        
        
    }
    
}
