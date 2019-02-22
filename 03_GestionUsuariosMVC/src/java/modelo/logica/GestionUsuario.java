/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.logica;

import java.util.ArrayList;
import java.util.List;
import modelo.usuario.Usuario;
//import modelo.persistencia.FicheroPersona;

/**
 *
 * @author USUARIO
 */
public class GestionUsuario {
    private Usuario usuario; 
    
    private List<Usuario> list = new ArrayList<>();
    private static GestionUsuario instance = null;
    private GestionUsuario() { }
    
    public static GestionUsuario getInstancia() { 
        if (instance == null) { 
            instance = new GestionUsuario();            
        }
        return instance;
    }
    
    public enum TipoResultado{OK, SIN_VALORES, EDAD_MAL};
    
    private static boolean validarDatosPersona(String nombre, String edad, String email, String password) { 
            return !nombre.equals("") && !edad.equals("") && !email.equals("") && !password.equals("");
        }
    
    private static boolean validarEdad(String edad) { 
            return (edad.matches("^[1-9][0-9]*$"));
        }
    
    public TipoResultado guardarPersona(String nombre, String edad, String email, String password) { 
        if (validarDatosPersona(nombre, edad, email, password)) {
            if (validarEdad(edad)) { 
                    int iEdad = Integer.parseInt(edad);
                    Usuario nuevoUsu = new Usuario (nombre, edad, email, password);
                    this.list.add(nuevoUsu);
                    return TipoResultado.OK;
            } else { 
                return TipoResultado.EDAD_MAL;
            }
        } else { 
            return TipoResultado.SIN_VALORES;
        }
    }
       
    public boolean validacionPasswd(String email, String password) { 
        for (Usuario user: list){
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) { 
                return true;
            }
        } 
        return false;
    } 
   
    
}
