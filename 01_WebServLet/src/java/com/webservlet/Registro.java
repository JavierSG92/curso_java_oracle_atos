/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class Registro extends HttpServlet {
    int acceso = 0;

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
     response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Leyendo parámetros ParamServlet</title>");            
            out.println("</head>");
            out.println("<body bgcolor=\"#CCBBAA\">");
            out.println("<h1>Introduce tus datos de registro</h1>");
            out.println("<form name='form1' method='post' action='http://localhost:8084/01WebServLet/Registro'>");
            out.println("<table border='1'>");
            out.println("<tr><td>Nombre:</td><td>");
            out.println("<input type='text' name='nom' id='nom' size='25' value=''/> </td></tr>");
            out.println("<tr><td>Edad:</td><td>");
            out.println("<input type='number' name='eda' id='eda' size='25' value=''/> </td></tr>");
            out.println("<tr><td>Correo electrónico:</td><td>");
            out.println("<input type='text' name='ema' id='ema' size='25' value=''/> </td></tr>");
            out.println("<tr><td>Contraseña:</td><td>");
            out.println("<input type='text' name='con' id='con' size='25' value=''/> </td></tr>");
            out.println("</table>");
            out.println("<input type='submit' value='Enviar'/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
    response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Leyendo parámetros ParamServlet</title>");            
            out.println("</head>");
            out.println("<body bgcolor=\"#CCBBAA\">");
            acceso = Integer.parseInt(request.getParameter("eda"));
            if (acceso > 17) { 
                //Pasar datos a clase usuario
                out.println("<p>USUARIO REGISTRADO CON ÉXITO</p>");
                ProcesUsuario p = ProcesUsuario.getInstance();
                p.addUser(request.getParameter("nom"), acceso, request.getParameter("ema"), request.getParameter("con") );                
            } else{ 
                out.println("<p>USUARIO MENOR DE EDAD. NO PUEDE REGISTRARSE</p>");
            }
            out.println("</body>");
            out.println("</html>");
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
