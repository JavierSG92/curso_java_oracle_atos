/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.logica;

import java.util.ArrayList;
import modelo.Usuario;
import modelo.persistencia.DerbyDBUsuario;

/**
 *
 * @author USUARIO
 */
public class ServicioUsuarios {

    IUsuarioDAO persistencia = new DerbyDBUsuario();
    public enum Resultado { Ok, CamposMal, NoLogin , ErrorDB};
    private static final ServicioUsuarios instancia = new ServicioUsuarios();
    private ServicioUsuarios() {}

    public static ServicioUsuarios getInstancia() {
        return instancia;
    }

     public Usuario crearUsuarioValido(int id, String nom, String strEdad, String email, String password) {
         
        int iEdad = 0;
        if (strEdad.matches("^[1-9][0-9]*$")) {
            try {
                iEdad = Integer.parseInt(strEdad);
                if (iEdad > 18) { 
                    if (email.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$")){ 
                        return new Usuario(id, nom, iEdad, email, password);                               
                    }
                }
            } catch (NumberFormatException ex) {
            }
        }
        return null;
    }
    
    public Resultado add(String nom, String strEdad, String email, String password) {
        Usuario nuevoUsu = crearUsuarioValido(0, nom, strEdad, email, password);
        int iEdad = 0;
        if (nuevoUsu != null) { 
            if(this.persistencia.crear(nuevoUsu)) { 
                return Resultado.Ok;
            } else { 
                return Resultado.ErrorDB;
            }
        }

        return Resultado.CamposMal;
    }
    
   /* public Resultado add(String nom, int edad, String email, String passwd) {

        if ( !nom.isEmpty() && edad > 18 && email != "" && passwd != "") {
            Usuario nuevoUsu = new Usuario(0, nom, edad, email, passwd);
            this.persistencia.crear(nuevoUsu);
            return Resultado.Ok;
        } else {
            return Resultado.CamposMal;
        }
    } */
    
    public ArrayList<Usuario> obtenerTodos() {
        return null;
    }
    
    public Usuario obtenerUno(String email) { 
        return null;
    }
    
    public Resultado modificar(int id, String nom, String strEdad, String email, String password) { 
        return Resultado.CamposMal;
    }
    
    public Resultado eliminar(String email) { 
        return Resultado.CamposMal;
    }
    
    public ArrayList<Usuario> listar() {
        return persistencia.obtenerTodos();
    }
    
    public Resultado validarLoginUsuario(String email, String password) { 
        return Resultado.NoLogin;
    }

    public Usuario validacionPasswd(String email, String passwd) {
        ArrayList<Usuario> todosUsuarios = persistencia.obtenerTodos();
        for (Usuario usuario : todosUsuarios) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(passwd)) {
                return usuario;
            }
        }
        return null;
    }
}
