package paquete01;

import paquete04.*;
import paquete02.*;
import paquete03.*;

public class Ejecutor {
    
    public static void main(String[] args) {

        Enlace e = new Enlace();
        
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
