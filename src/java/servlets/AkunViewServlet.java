/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.AkunController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.HibernateUtil;

/**
 *
 * @author budiarti
 */
public class AkunViewServlet extends HttpServlet {

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
        String nik = request.getParameter("txtNik");
        String nama = request.getParameter("txtNama");
        String jk= request.getParameter("radioJenisKelamin");
        String alamat = request.getParameter("txtAlamat");
        String rtrw = request.getParameter("txtRtRw");
        String desa = request.getParameter("txtDesa");
        String kec = request.getParameter("txtKecamatan");
        String kab = request.getParameter("txtKabupaten");
        String prov = request.getParameter("txtProvinsi");
        String role = request.getParameter("txtRole");
        RequestDispatcher dispatcher = null;
        try (PrintWriter out = response.getWriter()) {
            AkunController ac = new AkunController(HibernateUtil.getSessionFactory());
            if (ac.saveOrEdit(nik, nama, jk, alamat, rtrw, desa, alamat, kab, prov, role)) {
                out.print("success added");
            }else{
            
                out.print("failed");
            }
            //dispatcher = request.getRequestDispatcher("views/location1View.jsp");
            dispatcher.include(request, response);
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
