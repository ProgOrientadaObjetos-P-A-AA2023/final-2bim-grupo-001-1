package paquete01;

import java.util.Locale;
import paquete02.Enlace;
import java.util.Scanner;
import paquete02.*;
import paquete03.*;
import paquete04.*;

public class Ejecutor {
    
    public static void main(String[] args) {

        Enlace e = new Enlace();
        
        System.out.println("=========================================");
        System.out.println("Sistema de Gestio de Planes de Telefonia");
        System.out.println("=========================================");

        // Varaibles y Objetos Globales

        int opcion, minutos, minutosN, minutosI;
        String nombre, pasaporte, ciudad, barrio, marca, modelo, celular;
        double costoMin, costoMinN, costoMinI, megas, costoGB, descuento, tarifa;

        Scanner lm = new Scanner(System.in);
        lm.useLocale(Locale.US);
        

        boolean condicion = true;

        // Creacion del menu del programa
        
        while (condicion) {

            System.out.printf("%s\n\n%s\n%s\n%s\n%s\n%s\n\n%s",
                    "--Menu de Opciones para Planes de Telefonia--",
                    "1) Ingresar un Plan Post Pago Megas",
                    "2) Ingresar un Plan Post Pago Minutos",
                    "3) Ingresar un Plan Post Pago Minutos Megas",
                    "4) Ingresar un Plan Post Pago Minutos Megas Econocmico",
                    "5) Salir del Programa",
                    "Elija una opcion: ");
            
            opcion = lm.nextInt();
            System.out.println("============================================="
                    + "====================");
            
            
            // Limpiar Buffer
            
            lm.nextLine();

           switch (opcion) {

                case 1:
                    
                    System.out.print("Ingrese el nombre completo del Cliente: ");
                    nombre = lm.nextLine();
                    
                    System.out.print("Ingrese el pasaporte del Cliente: ");
                    pasaporte = lm.nextLine();
                    
                    System.out.print("Ingrese la ciudad del Cliente: ");
                    ciudad = lm.nextLine();
                    
                    System.out.print("Ingrese el barrio del Cliente: ");
                    barrio = lm.nextLine();
                    
                    Propietario p = new Propietario(nombre,pasaporte,
                            ciudad,barrio);
                    
                    System.out.print("Ingrese la marca del celular: ");
                    marca = lm.nextLine();
                    
                    System.out.print("Ingrese la modelo del celular: ");
                    modelo = lm.nextLine();
                    
                    System.out.print("Ingrese el celular: ");
                    celular = lm.nextLine();
                    
                    Celular c = new Celular(marca,modelo,celular);
                    
                    System.out.print("Ingrese los megas que tiene en GB: ");
                    megas = lm.nextDouble();
                    
                    System.out.print("Ingrese el costo por cada GB: ");
                    costoGB = lm.nextDouble();
                    
                    System.out.print("Ingrese la tarifa base: ");
                    tarifa = lm.nextDouble();
                    lm.nextLine();
                    
                    PlanPostPagoMegas pMegas = new PlanPostPagoMegas(p,c,megas,
                            costoGB,tarifa);
                    
                    e.insertarPlanPostPagoMegas(pMegas);
                    
                    break;
                    
                case 2:
                    
                    System.out.print("Ingrese el nombre completo del Cliente: ");
                    nombre = lm.nextLine();
                    
                    System.out.print("Ingrese el pasaporte del Cliente: ");
                    pasaporte = lm.nextLine();
                    
                    System.out.print("Ingrese la ciudad del Cliente: ");
                    ciudad = lm.nextLine();
                    
                    System.out.print("Ingrese el barrio del Cliente: ");
                    barrio = lm.nextLine();
                    
                    Propietario p2 = new Propietario(nombre,pasaporte,
                            ciudad,barrio);
                    
                    System.out.print("Ingrese la marca del celular: ");
                    marca = lm.nextLine();
                    
                    System.out.print("Ingrese la modelo del celular: ");
                    modelo = lm.nextLine();
                    
                    System.out.print("Ingrese el celular: ");
                    celular = lm.nextLine();
                    
                    Celular c2 = new Celular(marca,modelo,celular);
                    
                    System.out.print("Ingrese los Minutos Nacionales: ");
                    minutosN = lm.nextInt();
                    
                    System.out.print("Ingrese el Costo de los Minutos "
                            + "Nacionales: ");
                    costoMinN = lm.nextDouble();
                    
                    System.out.print("Ingrese los Minutos Internacionales: ");
                    minutosI = lm.nextInt();
                    
                    System.out.print("Ingrese el Costo de los Minutos "
                            + "Internacionales: ");
                    costoMinI = lm.nextDouble();
                    lm.nextLine();
                    
                    PlanPostPagoMinutos pMinutos = new PlanPostPagoMinutos(p2,
                            c2,minutosN,costoMinN,minutosI,costoMinI);
                    
                    e.insertarPlanPostPagoMinutos(pMinutos);
                    
                    break;
                    
                case 3: 
                    
                    System.out.print("Ingrese el nombre completo del Cliente: ");
                    nombre = lm.nextLine();
                    
                    System.out.print("Ingrese el pasaporte del Cliente: ");
                    pasaporte = lm.nextLine();
                    
                    System.out.print("Ingrese la ciudad del Cliente: ");
                    ciudad = lm.nextLine();
                    
                    System.out.print("Ingrese el barrio del Cliente: ");
                    barrio = lm.nextLine();
                    
                    Propietario p3 = new Propietario(nombre,pasaporte,
                            ciudad,barrio);
                    
                    System.out.print("Ingrese la marca del celular: ");
                    marca = lm.nextLine();
                    
                    System.out.print("Ingrese la modelo del celular: ");
                    modelo = lm.nextLine();
                    
                    System.out.print("Ingrese el celular: ");
                    celular = lm.nextLine();
                    
                    Celular c3 = new Celular(marca,modelo,celular);
                    
                    System.out.print("Ingres los Minutos: ");
                    minutos = lm.nextInt();
                    
                    System.out.print("Ingres el Costo de los Minutos: ");
                    costoMin = lm.nextDouble();
                    
                    System.out.print("Ingres los Megas que tiene en GB: ");
                    megas = lm.nextDouble();
                    
                    System.out.print("Ingres el Costo por cada GB: ");
                    costoGB = lm.nextDouble();
                    lm.nextLine();
                    
                    PlanPostPagoMinutosMegas pMinutosMegas = 
                            new PlanPostPagoMinutosMegas(p3,c3,minutos,costoMin,
                                    megas,costoGB);
                    
                     e.insertarPlanPostPagoMinutosMegas(pMinutosMegas);
                    
                    break;
                    
                case 4:
                    
                    System.out.print("Ingrese el nombre completo del Cliente: ");
                    nombre = lm.nextLine();
                    
                    System.out.print("Ingrese el pasaporte del Cliente: ");
                    pasaporte = lm.nextLine();
                    
                    System.out.print("Ingrese la ciudad del Cliente: ");
                    ciudad = lm.nextLine();
                    
                    System.out.print("Ingrese el barrio del Cliente: ");
                    barrio = lm.nextLine();
                    
                    Propietario p4 = new Propietario(nombre,pasaporte,
                            ciudad,barrio);
                    
                    System.out.print("Ingrese la marca del celular: ");
                    marca = lm.nextLine();
                    
                    System.out.print("Ingrese la modelo del celular: ");
                    modelo = lm.nextLine();
                    
                    System.out.print("Ingrese el celular: ");
                    celular = lm.nextLine();
                    
                    Celular c4 = new Celular(marca,modelo,celular);
                    
                    System.out.print("Ingres los Minutos: ");
                    minutos = lm.nextInt();
                    
                    System.out.print("Ingres el Costo de los Minutos: ");
                    costoMin = lm.nextDouble();
                    
                    System.out.print("Ingres los Megas que tiene en GB: ");
                    megas = lm.nextDouble();
                    
                    System.out.print("Ingres el Costo por cada GB: ");
                    costoGB = lm.nextDouble();
                    
                    System.out.print("Ingres el Porcentaje de Descuento: ");
                    descuento = lm.nextDouble();
                    lm.nextLine();
                    
                    PlanPostPagoMinutosMegasEconomico pMinutosMegasEco = 
                            new PlanPostPagoMinutosMegasEconomico(p4,c4,
                                    minutos,costoMin,megas,costoGB,
                                    descuento);
                    
                    
                    e.insertarPlanPostPagoMinutosMegasEconomico(pMinutosMegasEco);
                    
                    break;  
                    
                case 5:
                    
                    e.establecerlistaPlanes();
                    
                    for (PlanCelular pl : e.obtenerlistaPlanes() ) {
                        
                        pl.calcularPagoMensual();
                        
                    }
                    
                    System.out.println("\t\t-----[LISTA DE PLANES]-----");
                    
                    for (int i = 0; i < e.obtenerlistaPlanes().size(); i++) {
            
                        System.out.printf("%s\n", e.obtenerlistaPlanes().get(i));
                    
                    }
                    
                    
                    System.out.println("======================================"
                            + "==========================="
                            + "\n\033[31mSaliendo del Programa...");
                    
                    condicion = false;

                    break;
                    
                default:
                    
                    System.out.println("\nOpcion incorrecta...");
                    
           }
           
        }
        
    }
    
}
