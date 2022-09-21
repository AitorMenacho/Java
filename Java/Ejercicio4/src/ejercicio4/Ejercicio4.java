package ejercicio4;
public class Ejercicio4 {
    
    public static void main(String[] args) {
    
        String titulo = "UNA FINAL MADE IN HOLLYWOOD( HOLLYWOOD ENDING )";
        String director = "Woody Allen";
        String reparto = "Woody Allen y George Hamilton";
        String genero = "Comedia";
        String duracion = "114 min";
        String resumen = "Los Oscars ganados en el pasado por el ex-genio del cine Val Waxman...";
        
        DVD_Cine dvd = new DVD_Cine(titulo, director, reparto, genero, duracion, resumen);
        
        System.out.println(dvd.toString());
        
        System.out.println(dvd.esThriller(genero));
        System.out.println(dvd.tieneResumen(resumen));
        
    }
    
}
