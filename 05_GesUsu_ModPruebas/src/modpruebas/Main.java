/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modpruebas;

import java.util.ArrayList;
import modelo.Usuario;
import modelo.logica.ServicioUsuarios;

/**
 *
 * @author USUARIO
 */
public class Main {
    
    static void mostrarResultado(ServicioUsuarios.Resultado res, String nombre){ 
        System.out.print(" - Prueba" + nombre + ": ");
        switch (res) { 
            case CamposMal: 
                System.out.println("Error campos mal");
                break;
            case ErrorDB: 
                System.out.println("Error DB");
                break;
            case NoLogin: 
                System.out.println("Error No Login");
                break;
            case Ok: 
                System.out.println("PRUEBA CORRECTA");
                break;
        }
    }
    
    static void listar() { 
        ArrayList<Usuario> todos = ServicioUsuarios.getInstancia().obtenerTodos();
        System.out.println("ServicioUsuarios.getInstancia().obtenerTodos():");
        todos.stream().forEach((u) -> { 
            System.out.println("  -" + u.getId() 
            + ", " + u.getNombre()
            + ", " + u.getEdad()
            + ", " + u.getEmail()
            + ", " + u.getPassword());
        });      
    }
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Probando módulo modelo");
        System.out.println("DATOS NO VALIDOS");
        mostrarResultado( 
        ServicioUsuarios.getInstancia().add("Aaaa Aaaaaa", "10", "", ""), 
        "Usuario no válido");
        mostrarResultado( 
        ServicioUsuarios.getInstancia().add("Aaaa Aaaaaa", "10", "xxxxx", ""), 
        "Usuario no válido");
        mostrarResultado( 
        ServicioUsuarios.getInstancia().add("Aaaa Aaaaaa", "10", "aaa@aaa.com", ""), 
        "Usuario no válido");
        mostrarResultado( 
        ServicioUsuarios.getInstancia().add("Aaaa Aaaaaa", "10", "aaa@aaa.com", "bbb"), 
        "Usuario válido");  
        mostrarResultado( 
        ServicioUsuarios.getInstancia().add("Aaaa Aaaaaa", "10", "bbb@bbb.com", "bbb"), 
        "Usuario válido");   
        listar();
        mostrarResultado( 
        ServicioUsuarios.getInstancia().add("Aaaa Aaaaaa", "10", "bbb@bbb.com", "bbb"), 
        "Usuario repetido");
        Usuario usu = ServicioUsuarios.getInstancia().obtenerUno("bbb@bbb.com");
        mostrarResultado( 
        ServicioUsuarios.getInstancia().modificar(usu.getId(),"Aaaa Aaaaaa", "55", "bbb@bbb.com", "bbb"), 
        "modificar Aaaa Aaaaaa"); 
        mostrarResultado( 
        ServicioUsuarios.getInstancia().eliminar("bbb@bbb.com"), 
        "Usuario repetido"); 
        mostrarResultado( 
        ServicioUsuarios.getInstancia().validarLoginUsuario("bbb@bbb.com", "bbb"), 
        "validarLoginUsuario bbb"); 
         mostrarResultado( 
        ServicioUsuarios.getInstancia().validarLoginUsuario("bbb@bbb.com", "ccc"), 
        "validarLoginUsuario bbb"); 
        listar();
        mostrarResultado( 
        ServicioUsuarios.getInstancia().eliminar("aaa@aaa.com"), 
        "Usuario repetido"); 
    }
    
}
