package paquete03;

public class Propietario {
    
    private String nombreCompleto;
    private String pasaporte;
    private String ciudad;
    private String barrio;
    
    public Propietario(String n, String p, String c, String b) {
        nombreCompleto = n;
        pasaporte = p;
        ciudad = c;
        barrio = b;
    }
    
    public void establecerNombreCompleto(String n) {
        nombreCompleto = n;
    }
    
    public void establecerPasaporte(String p) {
        pasaporte = p;
    }
    
    public void establecerCiudad(String c) {
        ciudad = c;
    }
    
    public void establecerBarrio(String b) {
        barrio = b;
    }
    
    public String obtenerNombreCompleto() {
        return nombreCompleto;
    }
    
    public String obtenerPasaporte() {
        return pasaporte;
    }
    
    public String obtenerCiudad() {
        return ciudad;
    }
    
    public String obtenerBarrio() {
        return barrio;
    }
    
}
