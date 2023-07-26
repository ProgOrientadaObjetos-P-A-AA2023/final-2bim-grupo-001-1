package paquete04;

import paquete02.PlanCelular;
import paquete03.Celular;
import paquete03.Propietario;

public class PlanPostPagoMinutos extends PlanCelular {
    
    private int minutosNacionales;
    private double costoMinNacional;
    private int minutosInternacionales;
    private double costoMinInternacional;
    
    public PlanPostPagoMinutos(Propietario p, Celular c, int mN, double cMN,
            int mI, double cMI) {
        super(p, c);
        minutosNacionales = mN;
        costoMinNacional = cMN;
        minutosInternacionales = mI;
        costoMinInternacional = cMI;
    }
    
    public void establecerMinutosNacionales(int m) {
        minutosNacionales = m;
    }
    
    public void establecerCostoMinNacional(double c) {
        costoMinNacional = c;
    }
    
    public void establecerMinutosInternacionales(int m) {
        minutosInternacionales = m;
    }
    
    public void establecerCostoMinInternacional(double c) {
        costoMinInternacional = c;
    }
    
    @Override
    public void calcularPagoMensual() {
        
    }

    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoMinNacional() {
        return costoMinNacional;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoMinInternacional() {
        return costoMinInternacional;
    }
    
}
