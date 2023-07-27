package paquete01;

import paquete02.Enlace;
import java.util.Scanner;
import paquete02.*;
import paquete03.*;
import paquete04.*;

public class Ejecutor {
    
    public static void main(String[] args) {

        Enlace e = new Enlace();
        
        System.out.println("========================================");
        System.out.println("Sistema de Gestio de Planes de Telefonia");
        System.out.println("========================================\n");

        // Varaibles y Objetos Globales

        int opcion, minutos, minutosN, minutosI;
        String nombre, pasaporte, ciudad, barrio, marca, modelo, celular;
        double costoMin, costoMinN, costoMinI, megas, costoGB, descuento, tarifa;

        Scanner lm = new Scanner(System.in);

        boolean condicion = true;

        // Creacion del menu del programa
        
        while (condicion) {

            System.out.printf("%s\n\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n%s ",
                    "--Menu de Opciones para Planes de Telefonia--",
                    "1) Ingresar un Plan Post Pago Megas",
                    "2) Ingresar un Plan Post Pago Minutos",
                    "3) Ingresar un Plan Post Pago Minutos Megas",
                    "4) Ingresar un Plan Post Pago Minutos Megas Econocmico",
                    "5) Salir del Programa",
                    "Elija una opcion:");

            opcion = lm.nextInt();

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
                    
                    System.out.print("Ingrese los Minutos Internacionales");
                    minutosI = lm.nextInt();
                    
                    System.out.print("Ingrese el Costo de los Minutos "
                            + "Internacionales");
                    costoMinI = lm.nextDouble();
                    lm.nextLine();
                    
                    PlanPostPagoMinutos pMinutos = new PlanPostPagoMinutos(p2,
                            c2,minutosN,costoMinN,minutosI,costoMinI);
                    
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
                    
                    break;  
                    
                case 5:
                    
                    System.err.println("Saliendo del Programa...");
                    condicion = false;

                    break;
                    
                default:
                    
                    System.out.println("\nOpcion incorrecta...");
                    
           }
           
        }
                    
        Propietario p = new Propietario("Luis miguel Morales Bautista", "ZAB000254", "Loja", "El Plateado");
        
        Celular c = new Celular("Samsung", "A21S", "0991526978");
        
        PlanPostPagoMegas plan1 = new PlanPostPagoMegas(p, c, 0, 0, 0);
        
        PlanPostPagoMinutos plan2 = new PlanPostPagoMinutos(p, c, 0, 0, 0, 0);
        
        PlanPostPagoMinutosMegas plan3 = new PlanPostPagoMinutosMegas(p, c, 0, 0, 0, 0);
        
        PlanPostPagoMinutosMegasEconomico plan4 = new PlanPostPagoMinutosMegasEconomico(p, c, 0, 0, 0, 0, 0);
        
        
        e.insertarPlanPostPagoMegas(plan1);
        e.insertarPlanPostPagoMinutos(plan2);
        e.insertarPlanPostPagoMinutosMegas(plan3);
        e.insertarPlanPostPagoMinutosMegasEconomico(plan4);
        
        e.establecerlistaPlanes();
        
       /*for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }*/
        
    }
    
}
