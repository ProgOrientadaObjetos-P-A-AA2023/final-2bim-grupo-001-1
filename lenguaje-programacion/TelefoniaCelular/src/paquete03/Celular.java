package paquete03;

public class Celular {
    
    private String marca;
    private String modelo;
    private String celular;
    
    public Celular(String m, String md, String c) {
        marca = m;
        modelo = md;
        celular = c;
    }
    
    public void establecerMarca(String m) {
        marca = m;
    }
    
    public void establecerModelo(String m) {
        modelo = m;
    }
    
    public void establecerCelular(String c) {
        celular = c;
    }
    
    public String obtenerMarca() {
        return marca;
    }
    
    public String obtenerModelo() {
        return modelo;
    }
    
    public String obtenerCelular() {
        return celular;
    }
    
}
