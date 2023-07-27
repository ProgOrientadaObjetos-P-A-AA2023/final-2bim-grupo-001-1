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
    
    @Override
    public String toString() {
        String cadena = String.format("======================================\n"
                + "PLAN POST PAGO MINUTOS MEGAS ECONOMICO:\n"
                + "\tNombre del Propietario: %s\n"
                + "\tPasaporte del Propietario: %s\n"
                + "\tCiudad del Propietario: %s\n"
                + "\tBarrio del Propietario: %s\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tCelular: %s\n"
                + "\tMegas en GB: %.2fGB\n"
                + "\tCosto por GB: $%.2f\n"
                + "\tTarifa Base: %.2f%%\n"
                + "\t---------------------------------------------\n"
                + "\tPago Mensual: $%.2f\n",
                propietario.obtenerNombreCompleto(),
                propietario.obtenerPasaporte(),
                propietario.obtenerCiudad(),
                propietario.obtenerBarrio(),
                celular.obtenerMarca(),
                celular.obtenerModelo(),
                celular.obtenerCelular(),
                megasGB,
                costoGB,
                tarifa,
                pagoMensual);
        
        return cadena;
    }
    
}
