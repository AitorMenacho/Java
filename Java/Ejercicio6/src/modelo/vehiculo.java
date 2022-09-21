package modelo;

public class vehiculo {

    String modeloV;
    String traccionV;
    int potenciaV;
    
    public vehiculo(String modelo, String traccion, int potencia) {
        this.modeloV = modelo;
        this.traccionV = traccion;
        this.potenciaV = potencia;
    }
    
    public String getModeloV() {
        return modeloV;
    }

    public void setModeloV(String modeloV) {
        this.modeloV = modeloV;
    }

    public String isTraccionV() {
        return traccionV;
    }

    public void setTraccionV(String traccionV) {
        this.traccionV = traccionV;
    }

    public int getPotenciaV() {
        return potenciaV;
    }

    public void setPotenciaV(int potenciaV) {
        this.potenciaV = potenciaV;
    }

    
        @Override
    public String toString() {
        return "Modelo: " + modeloV + ", traccion: " + traccionV + ", potencia: " + potenciaV + ".";
    }
    
}
