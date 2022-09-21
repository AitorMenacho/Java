package ejercicio5;

public class Alumno {

    String nombreAlum;
    int nAlum;
    double examen1;
    double examen2;
    double notaMedia;

    Alumno(String nombre, int numero, double nota1, double nota2) {
        
        nombreAlum = nombre;
        nAlum = numero;
        examen1 = nota1;
        examen2 = nota2;
        
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public int getnAlum() {
        return nAlum;
    }

    public void setnAlum(int nAlum) {
        this.nAlum = nAlum;
    }

    public double getExamen1() {
        return examen1;
    }

    public void setExamen1(double examen1) {
        this.examen1 = examen1;
    }

    public double getExamen2() {
        return examen2;
    }

    public void setExamen2(double examen2) {
        this.examen2 = examen2;
    }

    @Override
    public String toString() {
        return nAlum + " " + nombreAlum + " nota media " + ((examen1+examen2)/2);
    }

    
}
