/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.UtentiFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Marco
 */
@WebServlet(name = "Vendita", urlPatterns = {"/Vendita"})
public class Vendita extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
HttpSession session = request.getSession();
response.setContentType("text/html;charset=UTF-8");

        int id_v = Integer.parseInt(request.getParameter("venditoreId"));
        request.setAttribute("venditore", UtentiFactory.getInstance().getVenditore(id_v));
        request.setAttribute("venditore", UtentiFactory.getInstance().getVenditore((int)session.getAttribute("id_v")));

        
        // Inserimento nuovo oggetto in vendita (solo se il venditore ha premuto il tasto 'submit')
        if(request.getParameter("submit") != null)
        {
            // Preleva i dati da inserire
            int id_venditore = Integer.parseInt(request.getParameter("venditoreId"));
            int id_o = Integer.parseInt(request.getParameter("id_o"));
            String nome = request.getParameter("nome");
            String descrizione = request.getParameter("descrizione");
            Double prezzo = Double.parseDouble(request.getParameter("prezzo"));
            int quantita = Integer.parseInt(request.getParameter("quantita"));

            
            try
            {
                UtentiFactory.getInstance().venditaOggetto(id_venditore, id_o, nome, descrizione, prezzo, quantita);
            }
            catch(SQLException e) {
                Logger.getLogger(Vendita.class.getName()).log(Level.SEVERE,null,e);
            }
        } 
        
        
        request.getRequestDispatcher("venditore_login.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
