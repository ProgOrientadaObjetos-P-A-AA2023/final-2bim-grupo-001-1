package paquete01;

import java.util.Scanner;
import paquete04.*;
import paquete02.*;
import paquete03.*;

public class Ejecutor {
    
    public static void main(String[] args) {

        Enlace e = new Enlace();
        
        System.out.println("========================================");
        System.out.println("Sistema de Gestio de Planes de Telefonia");
        System.out.println("========================================\n");

        // Varaibles y Objetos Globales

        int opcion;
        String nombre;
        String pasaporte;
        String ciudad;
        String barrio;

        Scanner lm = new Scanner(System.in);

        boolean condicion = true;

        // Creacion del menu del programa
        
        while (condicion) {

            System.out.printf("%s\n\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n%s ",
                    "--Menu de Opciones para Planes de Telefonia--",
                    "1) Plan Post Pago Megas",
                    "2) Plan Post Pago Minutos",
                    "3) Plan Post Pago Minutos Megas",
                    "4) Plan Post Pago Minutos Megas Econocmico",
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
                    
                    Propietario p = new Propietario(nombre, pasaporte, ciudad, barrio);
                    
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
                    
                    Propietario p2 = new Propietario(nombre, pasaporte, ciudad, barrio);
                    
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
                    
                    Propietario p3 = new Propietario(nombre, pasaporte, ciudad, barrio);
                    
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
                    
                    Propietario p4 = new Propietario(nombre, pasaporte, ciudad, barrio);
                    
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
