package paquete04;

import paquete02.PlanCelular;
import paquete03.Celular;
import paquete03.Propietario;

public class PlanPostPagoMinutosMegas extends PlanCelular {
    
    private int minutos;
    private double costoMin;
    private double megasGB;
    private double costoGB;

    public PlanPostPagoMinutosMegas(Propietario p, Celular c, int m, double cM,
            double mG, double cG) {
        super(p, c);
        minutos = m;
        costoMin = cM;
        megasGB = mG;
        costoGB = cG;
    }
    
    public void establecerMinutos(int m) {
        minutos = m;
    }
    
    public void establecerCostoMin(double c) {
        costoMin = c;
    }
    
    public void establecerMegasGB(double m) {
        megasGB = m;
    }
    
    public void establecerCostoGB(double c) {
        costoGB = c;
    }
    
    @Override
    public void calcularPagoMensual() {
        
    }
    
    public int obtenerMinutos() {
        return minutos;
    }
    
    public double obtenerCostoMin() {
        return costoMin;
    }
    
    public double obtenerMegasGB() {
        return megasGB;
    }
    
    public double obtenerCostoGB() {
        return costoGB;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("======================================\n"
                + "PLAN POST PAGO MINUTOS MEGAS:\n"
                + "\tNombre del Propietario: %s\n"
                + "\tPasaporte del Propietario: %s\n"
                + "\tCiudad del Propietario: %s\n"
                + "\tBarrio del Propietario: %s\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tCelular: %s\n"
                + "\tMinutos: %d\n"
                + "\tCosto Minutos: $%.2f\n"
                + "\tMegas en GB: %.2fGB\n"
                + "\tCosto por GB: $%.2f\n"
                + "\t---------------------------------------------\n"
                + "\tPago Mensual: $%.2f\n",
                propietario.obtenerNombreCompleto(),
                propietario.obtenerPasaporte(),
                propietario.obtenerCiudad(),
                propietario.obtenerBarrio(),
                celular.obtenerMarca(),
                celular.obtenerModelo(),
                celular.obtenerCelular(),
                minutos,
                costoMin,
                megasGB,
                costoGB,
                pagoMensual);
        
        return cadena;
    }
    
}
