/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.logica.GestionUsuario;

/**
 *
 * @author USUARIO
 */
public class ControladorUsuariosServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String usu = request.getParameter("usu");
            String edad = request.getParameter("edad");
            String email = request.getParameter("email");
            String con = request.getParameter("con"); 
            String nusu = request.getParameter("nusu");
            String nemail = request.getParameter("nemail");
            String ncon = request.getParameter("ncon");
            String mod = request.getParameter("modificar");
            String elim = request.getParameter("eliminar");
        
        if (mod != null && mod.equals("modificar")) { 
            GestionUsuario.getInstancia().modificarPersona(nusu, edad, nemail, ncon);
        } else {
            GestionUsuario.TipoResultado resultado;
            resultado = GestionUsuario.getInstancia().guardarPersona(usu, edad, email, con);
        switch (resultado) { 
            case OK:
          //  request.getSession().setAttribute("usuario1", GestionUsuario.getInstancia().getUsuario());
            request.getRequestDispatcher("exito.jsp").forward(request, response);
            break;
            case SIN_VALORES:
            request.getRequestDispatcher("errorcampos.jsp").forward(request, response);
            break;
            case EDAD_MAL:
            request.getRequestDispatcher("erroredad.jsp").forward(request, response);    
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */ 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String email = request.getParameter("email");
            String con = request.getParameter("con"); 
            if (GestionUsuario.getInstancia().validacionPasswd(email, con)) {
                request.getRequestDispatcher("accesook.jsp").forward(request, response);
            } else { 
                request.getRequestDispatcher("accesonok.jsp").forward(request, response);
            } 
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
