/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ProcesUsuario {
    private List<Usuario> list = new ArrayList<>();
    private static ProcesUsuario instance = null;
    private ProcesUsuario() { 
        //Crear la lista de usuarios
        //Método para añadir a la lista
        //Método de comprobar si existe en la lista o no. Devolviendo un booleano
    }
    
    public static ProcesUsuario getInstance() { 
        if (instance == null) { 
            instance = new ProcesUsuario();            
        }
        return instance;
    }
    
    private static class ProcesUsuarioHolder {
        private static final ProcesUsuario instance = new ProcesUsuario();
    }
    
    
    public boolean addUser (String nom, int edad,String email, String password) { 
        Usuario nuevoUsu = new Usuario (nom, edad, email, password);
        this.list.add(nuevoUsu);
        return true;
    }
    
    public boolean validacionPasswd(String email, String password) { 
        for (Usuario usuario: list){
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) { 
                return true;
            }
        } 
        return false;
    } 
}
