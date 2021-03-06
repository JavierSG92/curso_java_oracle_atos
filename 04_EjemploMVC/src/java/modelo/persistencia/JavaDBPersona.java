/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Persona;
import modelo.logica.IPersonaDAO;

/**
 *
 * @author USUARIO
 */
public class JavaDBPersona implements IPersonaDAO{ 
    
    public JavaDBPersona () {
        try { 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            DiverManager.registerDriver(new org.apache.derby.jdbc)
        } catch (Exception ex) {
            Logger.
        }
    }

    @Override
    public boolean guardarPersona(Persona persona) {
       try  (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PersonasDB", "usuario", "usuario")) { 
            String squery = "INSERT INTO Persona VALUES ('" + persona.getNombre() + "',"
                    + persona.getEdad() + ");";
           Statement stmt = con.createStatement();
           stmt.executeQuery(squery);
           return true;
           }catch (SQLException ex) {
           return false;    
           }       
    }

    @Override
    public Persona leerPersona() {
        Persona persona = null;
        try  (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PersonasDB", "usuario", "usuario")) { 
           String squery = "SELECT nombre, edad FROM Personas";
           Statement stmt = con.createStatement();
           ResultSet res = stmt.executeQuery(squery);
           if(res.next()) { 
               String nombre = res.getString("nombre");
               int edad = res.getInt("Edad");
               return new Persona(nombre,edad);
           }
           return null;
    } catch(SQLException ex) { 
        return null;
    }
    
    }
}
