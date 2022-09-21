package maquinadegolosinas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MaquinaDeGolosinas {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        String rutaFichero = "C:\\Users\\alumno\\Documents\\NetBeansProjects\\MaquinaDeGolosinas\\maquinaGolosinas.txt";
        
        try {
            
            FileReader fr = new FileReader(rutaFichero);
            BufferedReader br = new BufferedReader(fr);
            String lineas;
            
            int matriz = Integer.parseInt(br.readLine());
            
            String[][] productos = new String[matriz][matriz];
            double[][] precio = new double[matriz][matriz];
            int[][] cant = new int[matriz][matriz];
            
            String[] producto = new String[matriz];
            double[] precios = new double[matriz];
            int[] cantidad = new int[matriz];
            
                
                for( int x = 0; x < productos.length; x++ ){
                    
                    lineas = br.readLine();
                    producto = lineas.split(",");
                    
                    for(int y = 0; y < productos[x].length; y++){
                        productos[x][y] = producto[y];   
                    }
                
                }
                
                for( int x = 0; x < precio.length; x++ ){
                    
                    lineas = br.readLine();
                    producto = lineas.split(",");
                    
                    for(int e = 0; e < producto.length; e++ ){
                        
                        precios[e] = Double.parseDouble(producto[e]);
                        
                    }
                    
                    for(int y = 0; y < precio[x].length; y++){
                        precio[x][y] = precios[y];   
                    }
                
                }
                
                for( int x = 0; x < cant.length; x++ ){
                    
                    lineas = br.readLine();
                    producto = lineas.split(",");
                    
                    for(int e = 0; e < producto.length; e++ ){
                        
                        cantidad[e] = Integer.parseInt(producto[e]);
                        
                    }
                    
                    for(int y = 0; y < cant[x].length; y++){
                        cant[x][y] = cantidad[y];   
                    }
                
                }
            
            br.close();
            
            boolean salir = false;
            
            while( !salir ){
                System.out.println("1. Mostrar golosinas");
                System.out.println("2. Pedir golosinas");
                System.out.println("3. Rellenar golosinas");
                System.out.println("4. Apagar máquina");
                
                System.out.println("");
                System.out.println("¿Que quieres hacer?");
                
                int opcion = sc.nextInt();
                
                switch( opcion ){
                    
                    case 1:
                        muestraGolosinas(productos,precio);
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Escribe la posición");
                        int numGolosina = sc.nextInt();
                        pideGolosinas(numGolosina, productos, precio, cant);
                        break;

                    case 3:
                        rellenaGolosinas();
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Hasta pronto.");
                        break;
                    default:
                        System.out.println("Solo puede elegir entre 1 y 4");
                }
                
            }
            
        } catch (IOException | NumberFormatException e) {
            
            System.out.println("Error: " + e.toString());
            
        }
        
    }

    private static void muestraGolosinas(String[][] productos, double[][] precio) {

        for (int x = 0; x < productos.length; x++) {
            for(int y = 0; y < productos[x].length; y++){
                
                System.out.print(productos[x][y] + " ");
                System.out.print("Precio: " + precio[x][y] + " ");
                System.out.println("Posición: " + x + " " + y);
                
            }
            
            System.out.println("");
        }
        
    }

    private static void pideGolosinas(int numGolosina, String[][] productos, double[][] precio, int[][] cant) {
        
        String posiciones = String.valueOf(numGolosina);
        int posicion1 = Integer.parseInt(posiciones.substring(0,1));
        int posicion2 = Integer.parseInt(posiciones.substring(1));
        
        if( cant[posicion1][posicion2] != 0 ){
            
            System.out.println("Producto:");
            System.out.println(productos[posicion1][posicion2]);   
            System.out.println("Precio:");
            System.out.println(precio[posicion1][posicion2]);   
            
            cant[posicion1][posicion2] = cant[posicion1][posicion2] - 1;
            
        } else {
            
            System.out.println("El producto que has pedido no tiene existencias");
            
        }
        
    }

    private static void rellenaGolosinas() {
        
    }
    
}
