package ejercicio4;

public class DVD_Cine {

    String tituloPeli;
    String directorPeli;
    String repartoPeli;
    String generoPeli;
    String duracionPeli;
    String resumenPeli;

    DVD_Cine(String titulo, String director, String reparto, String genero, String duracion, String resumen) {
        
        tituloPeli = titulo;
        directorPeli = director;
        repartoPeli = reparto;
        generoPeli = genero;
        duracionPeli = duracion;
        resumenPeli = resumen;
        
    }

    public String getDuracionPeli() {
        return duracionPeli;
    }

    public void setDuracionPeli(String duracionPeli) {
        this.duracionPeli = duracionPeli;
    }

    public String getTituloPeli() {
        return tituloPeli;
    }

    public void setTituloPeli(String tituloPeli) {
        this.tituloPeli = tituloPeli;
    }

    public String getDirectorPeli() {
        return directorPeli;
    }

    public void setDirectorPeli(String directorPeli) {
        this.directorPeli = directorPeli;
    }

    public String getRepartoPeli() {
        return repartoPeli;
    }

    public void setRepartoPeli(String repartoPeli) {
        this.repartoPeli = repartoPeli;
    }

    public String getGeneroPeli() {
        return generoPeli;
    }

    public void setGeneroPeli(String generoPeli) {
        this.generoPeli = generoPeli;
    }

    public String getResumenPeli() {
        return resumenPeli;
    }

    public void setResumenPeli(String resumenPeli) {
        this.resumenPeli = resumenPeli;
    }

    String esThriller ( String generoPeli ){
        
        if( generoPeli.contains("Thriller") ){
            
            return "Es Thriller";
            
        } else {
            
            return "No es Thriller";
            
        }
    }
    
    String tieneResumen ( String resumenPeli ){
        
        if( !resumenPeli.isEmpty() ){
            
            return "La ficha tiene resumen";
            
        }else {
            
            return "La ficha no tiene resumen";
            
        }
        
    }
    
    
    
    @Override
    public String toString() {
        return "Titulo = " + tituloPeli + 
               "\nDirector = " + directorPeli + 
               "\nReparto principal = " + repartoPeli + 
               "\nGenero = " + generoPeli + " - " + duracionPeli +
               "\nResumen = " + resumenPeli;
    }
    
}
