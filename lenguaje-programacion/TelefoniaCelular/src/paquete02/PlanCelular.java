package paquete02;

import paquete03.*;

public abstract class PlanCelular {
    
    protected Propietario propietario;
    protected Celular celular;
    protected double pagoMensual;
    
    public PlanCelular(Propietario p, Celular c) {
        propietario = p;
        celular = c;
    }
    
    public void establecerPropietario(Propietario p) {
        propietario = p;
    }
    
    public void establecerCelular(Celular c) {
        celular = c;
    }
    
    public abstract void calcularPagoMensual();
    
    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    public Celular obtenerCelular() {
        return celular;
    }
    
    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    
}
