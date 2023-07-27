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
    
    @Override
    public String toString() {
        String cadena = String.format("======================================\n"
                + "PLAN POST PAGO MINUTOS:\n"
                + "\tNombre del Propietario: %s\n"
                + "\tPasaporte del Propietario: %s\n"
                + "\tCiudad del Propietario: %s\n"
                + "\tBarrio del Propietario: %s\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tCelular: %s\n"
                + "\tMinutos Nacionales: %d\n"
                + "\tCosto Minutos Nacionales: $%.2f\n"
                + "\tMinutos Internacionales: %d\n"
                + "\tCosto Minutos Internacionales: $%.2f\n"
                + "\t---------------------------------------------\n"
                + "\tPago Mensual: $%.2f\n",
                propietario.obtenerNombreCompleto(),
                propietario.obtenerPasaporte(),
                propietario.obtenerCiudad(),
                propietario.obtenerBarrio(),
                celular.obtenerMarca(),
                celular.obtenerModelo(),
                celular.obtenerCelular(),
                minutosNacionales,
                costoMinNacional,
                minutosInternacionales,
                costoMinInternacional,
                pagoMensual);
        
        return cadena;
    }
    
}
