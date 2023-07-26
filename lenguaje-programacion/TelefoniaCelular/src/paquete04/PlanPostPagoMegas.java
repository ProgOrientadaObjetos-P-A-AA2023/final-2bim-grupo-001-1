package paquete04;

import paquete02.PlanCelular;
import paquete03.*;

public class PlanPostPagoMegas extends PlanCelular {
    
    private double megasGB;
    private double costoGB;
    private double tarifa;
    
    public PlanPostPagoMegas(Propietario p, Celular c, double mG,
            double cG, double t) {
        super(p, c);
        megasGB = mG;
        costoGB = cG;
        tarifa = t;
    }
    
    public void establecerMegasGB(double m) {
        megasGB = m;
    }
    
    public void establecerCostoGB(double c) {
        costoGB = c;
    }
    
    public void establecerTarifa(double t) {
        tarifa = t;
    }
    
    @Override
    public void calcularPagoMensual() {
        
    }
    
    public double obtenerMegasGB() {
        return megasGB;
    }
    
    public double obtenerCostoGB() {
        return costoGB;
    }
    
    public double obtenerTarifa() {
        return tarifa;
    }
    
}
