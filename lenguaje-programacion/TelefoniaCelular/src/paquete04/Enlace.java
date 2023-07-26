package paquete04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.*;
import paquete03.*;
import paquete04.*;

public class Enlace {
    
    private Connection conn;
    private ArrayList<PlanCelular> listaPlanes;
       
    public void establecerConexion() {  

        try {
            String url = "jdbc:sqlite:bd/base01.bd";
            conn = DriverManager.getConnection(url);
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    }
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlanPostPagoMinutosMegasEconomico
        (PlanPostPagoMinutosMegasEconomico p) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico "
                    + "(nombreCompleto, pasaporte, ciudad, barrio, marca, modelo, "
                    + "celular, minutos, costoMin, megasGB, costoGB, porcentajeDescuento) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, '%.2f',"
                    + "'%.2f', '%.2f', '%.2f')", 
                    p.obtenerPropietario().obtenerNombreCompleto(), 
                    p.obtenerPropietario().obtenerPasaporte(),
                    p.obtenerPropietario().obtenerCiudad(),
                    p.obtenerPropietario().obtenerBarrio(),
                    p.obtenerCelular().obtenerMarca(),
                    p.obtenerCelular().obtenerModelo(),
                    p.obtenerCelular().obtenerCelular(),
                    p.obtenerMinutos(),
                    p.obtenerCostoMin(),
                    p.obtenerMegasGB(),
                    p.obtenerCostoGB(),
                    p.obtenerPorcentajeDescuento());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {  
             System.out.println("Exception: PlanPostPagoMinutosMegasEconomico");
             System.out.println(e.getMessage());  
             
        }  
    }
        
    public void insertarPlanPostPagoMinutosMegas (PlanPostPagoMinutosMegas p) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas "
                    + "(nombreCompleto, pasaporte, ciudad, barrio, marca, modelo,"
                    + " celular, minutos, costoMin, megasGB, costoGB) values "
                    + "('%s', '%s', '%s', '%s', '%s', '%s', '%s', %d, '%.2f',"
                    + "'%.2f', '%.2f')", 
                    p.obtenerPropietario().obtenerNombreCompleto(), 
                    p.obtenerPropietario().obtenerPasaporte(),
                    p.obtenerPropietario().obtenerCiudad(),
                    p.obtenerPropietario().obtenerBarrio(),
                    p.obtenerCelular().obtenerMarca(),
                    p.obtenerCelular().obtenerModelo(),
                    p.obtenerCelular().obtenerCelular(),
                    p.obtenerMinutos(),
                    p.obtenerCostoMin(),
                    p.obtenerMegasGB(),
                    p.obtenerCostoGB());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {  
             System.out.println("Exception: PlanPostPagoMinutosMegas");
             System.out.println(e.getMessage());  
             
        }  
    }
    
    public void establecerlistaPlanes() {  
        listaPlanes = new ArrayList<>();
        
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from PlanPostPagoMinutosMegasEconomico;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                Propietario p = new Propietario(rs.getString("nombreCompleto"),
                rs.getString("pasaporte"),rs.getString("ciudad"),
                        rs.getString("barrio"));
                
                Celular c = new Celular(rs.getString("marca"),
                        rs.getString("modelo"),rs.getString("celular"));
                
                PlanPostPagoMinutosMegasEconomico pC = 
                        new PlanPostPagoMinutosMegasEconomico(p,c,
                                rs.getInt("minutos"),
                               rs.getDouble("costoMin"),
                               rs.getDouble("megasGB"),
                               rs.getDouble("costoGB"),
                               rs.getDouble("porcentajeDescuento"));
                
                listaPlanes.add(pC);
            }
            
            obtenerConexion().close();
            
        } catch (SQLException e) {  
             System.out.println("Exception: insertarPlanCelular");
             System.out.println(e.getMessage());  
             
        }
    }
    
    public ArrayList<PlanCelular> obtenerlistaPlanes() {
        return listaPlanes;
    }
    
}
