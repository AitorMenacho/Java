package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class AlumnoController {
    
    private List<Alumno>matriculaAlum;
    
    public AlumnoController(){
        
        this.matriculaAlum = leer();
        
    }
    

    public List<Alumno> matriculaAlum() {
        
        return matriculaAlum;
        
    }
    
    public boolean agregar(String nombre, int numero, double nota1, double nota2 ){
        
        boolean agregado = false;
        
        Alumno al = new Alumno(nombre, numero, nota1, nota2);
        
        matriculaAlum.add(al);
        
        if( matriculaAlum.contains(al) ) agregado = true;
        
        return agregado;
    }

    private List<Alumno> leer() {
        
        ArrayList<Alumno> Alum = new ArrayList<Alumno>();
        
        return Alum;
        
    }
    
}
