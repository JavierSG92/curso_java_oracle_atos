/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.logica;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author USUARIO
 */
public interface iUsuarioDAO {
    boolean crear (Usuario usuario);
    ArrayList<Usuario> listar();
    Usuario obtenerUno(Long id);
    Usuario obtenerUno(String email);
    boolean eliminar(String email);
    boolean modificar(Usuario usuario);  
}