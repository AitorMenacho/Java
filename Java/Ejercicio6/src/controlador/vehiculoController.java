package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.vehiculo;

public class vehiculoController {
    
    private List<vehiculo>listaVehiculos;
    
    public vehiculoController(){
        
        this.listaVehiculos = leer();
        
    }
    

    public List<vehiculo> getListaVehiculos() {
        
        return listaVehiculos;
        
    }
    
    public boolean agregar(String modelo, String traccion, int potencia ){
        
        boolean agregado = false;
        
        vehiculo vehi = new vehiculo(modelo, traccion, potencia);
        
        listaVehiculos.add(vehi);
        
        if( listaVehiculos.contains(vehi) ) agregado = true;
        
        return agregado;
    }

    private List<vehiculo> leer() {
        
        ArrayList<vehiculo> vDatos = new ArrayList<vehiculo>();
        
        return vDatos;
        
    }
    
}
