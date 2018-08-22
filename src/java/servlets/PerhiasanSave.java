/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.BarangController;
import controllers.DetailJMController;
import entities.Barang;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
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
public class PerhiasanSave extends HttpServlet {

    private BarangController barangController = new BarangController(HibernateUtil.getSessionFactory());
    
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
        String idB = request.getParameter("id_barang");
        String idM = request.getParameter("id_merk");
        String jenis = request.getParameter("cbxJenis");
        String detail = null;
        String bersih = request.getParameter("txtBersih");
        String kotor = request.getParameter("txtKotor");
        String karat = request.getParameter("txtKadar");
        String deskripsi = karat+";"+bersih+";"+kotor;
        int harga = (int) (((80*500000)/100)*Float.parseFloat(bersih));
        String foto = request.getParameter("foto");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
  
        try (PrintWriter out = response.getWriter()) {
            DetailJMController djmc = new DetailJMController(HibernateUtil.getSessionFactory());
             detail = djmc.search2(jenis, idM).getIdDetail();
            BarangController bc = new BarangController(HibernateUtil.getSessionFactory());
            if (bc.saveOrEdit(idB, detail, Integer.toString(harga), foto, deskripsi)) {
                out.println("Berhasil");
                session.setAttribute("barang", idB);
            }
            else
            {
                out.println("Gagal");
            }
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
