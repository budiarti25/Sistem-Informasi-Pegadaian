/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.BarangController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tools.HibernateUtil;

/**
 *
 * @author budiarti
 */
public class TambahPerhiasan extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String id = request.getParameter("txtIdBarang");
        String jenis = request.getParameter("cbxJenis");
        String karat = request.getParameter("cbxKarat");
        String berat1 = request.getParameter("txtKotor");
        String berat2= request.getParameter("txtBersih");
        String nm= karat+" ; "+berat1+" ; "+berat2;
        int harga = (Integer.parseInt(berat2)*650000);
        String foto = request.getParameter("fileUpload");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        try (PrintWriter out = response.getWriter()) {
            out.println(id);
            out.println(jenis);
            out.println(nm);
            out.println(harga);
            out.println(foto);
//            BarangController ac = new BarangController(HibernateUtil.getSessionFactory());
//            if (ac.saveOrEdit(id, jenis,Integer.toString(harga), nm, foto)) {
//                out.print("success added");
//            }else{
//                out.print("failed");
//            }
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
