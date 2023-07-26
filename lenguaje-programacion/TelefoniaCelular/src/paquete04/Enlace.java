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
        
        public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos "
                    + "(nombreCompleto, pasaporte, ciudad, barrio, "
                    + "marca, modelo, celular, "
                    + "minutosNacionales, costoMinNacional, "
                    + "minutosInternacionales, costoMinInternacional)"
                    + "values ('%s', '%s', '%s', '%s', "
                    + "'%s', '%s', '%s', "
                    + "'%d', '%.2f', '%d', '%.2f')", 
                    p.obtenerPropietario().obtenerNombreCompleto(),
                    p.obtenerPropietario().obtenerPasaporte(),
                    p.obtenerPropietario().obtenerCiudad(),
                    p.obtenerPropietario().obtenerBarrio(),
                    p.obtenerCelular().obtenerMarca(),
                    p.obtenerCelular().obtenerMarca(),
                    p.obtenerCelular().obtenerCelular(),
                    p.obtenerMinutosNacionales(),
                    p.obtenerCostoMinNacional(),
                    p.obtenerMinutosInternacionales(),
                    p.obtenerCostoMinInternacional());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
            
        } catch (SQLException e) {
            
            System.out.println("Exception: insertarCiudad");
            System.out.println(e.getMessage());

        }
        
    }
        
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas p) {

        try {

            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas "
                    + "(nombreCompleto, pasaporte, ciudad, barrio, "
                    + "marca, modelo, celular, "
                    + "megasGB, costoGB, tarifa)"
                    + "values ('%s', '%s', '%s', '%s', "
                    + "'%s', '%s', '%s', "
                    + "'%.2f', '%.2f', '%.2f')", 
                    p.obtenerPropietario().obtenerNombreCompleto(),
                    p.obtenerPropietario().obtenerPasaporte(),
                    p.obtenerPropietario().obtenerCiudad(),
                    p.obtenerPropietario().obtenerBarrio(),
                    p.obtenerCelular().obtenerMarca(),
                    p.obtenerCelular().obtenerMarca(),
                    p.obtenerCelular().obtenerCelular(),
                    p.obtenerMegasGB(),
                    p.obtenerCostoGB(),
                    p.obtenerTarifa());
            
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarCiudad");
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
            
            String data2 = "Select * from PlanPostPagoMinutos;";
            
            ResultSet rs2 = statement.executeQuery(data);
            while(rs.next()){
                
                Propietario p = new Propietario(rs2.getString("nombreCompleto"),
                rs2.getString("pasaporte"),rs2.getString("ciudad"),
                        rs2.getString("barrio"));
                
                Celular c = new Celular(rs2.getString("marca"),
                        rs2.getString("modelo"),rs2.getString("celular"));
                
                PlanPostPagoMinutos pC =
                        new PlanPostPagoMinutos(p,c,
                                rs2.getInt("minutosNacionales"),
                               rs2.getDouble("costoMinNacional"),
                               rs2.getInt("minutosInternacionales"),
                               rs2.getDouble("costoMinInternacional"));
                
                listaPlanes.add(pC);
                
            }
            
            String data3 = "Select * from PlanPostPagoMegas;";
            
            ResultSet rs3 = statement.executeQuery(data);
            while(rs.next()){
                
                Propietario p = new Propietario(rs3.getString("nombreCompleto"),
                rs3.getString("pasaporte"),rs3.getString("ciudad"),
                        rs3.getString("barrio"));
                
                Celular c = new Celular(rs3.getString("marca"),
                        rs3.getString("modelo"),rs3.getString("celular"));
                
                PlanPostPagoMegas pC =
                        new PlanPostPagoMegas(p,c,
                                rs3.getInt("megasGB"),
                               rs3.getDouble("costoGB"),
                               rs3.getInt("tarifa"));
                
                listaPlanes.add(pC);
                
            }
            
            String data4 = "Select * from PlanPostPagoMinutosMegas;";
            
            ResultSet rs4 = statement.executeQuery(data);
            while(rs.next()){
                
                Propietario p = new Propietario(rs4.getString("nombreCompleto"),
                rs4.getString("pasaporte"),rs4.getString("ciudad"),
                        rs4.getString("barrio"));
                
                Celular c = new Celular(rs4.getString("marca"),
                        rs4.getString("modelo"),rs4.getString("celular"));
                
                PlanPostPagoMinutosMegas pC =
                        new PlanPostPagoMinutosMegas(p,c,
                                rs.getInt("minutos"),
                               rs.getDouble("costoMin"),
                               rs.getDouble("megasGB"),
                               rs.getDouble("costoGB"));
                
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
