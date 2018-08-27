/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.PengajuanController;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.HibernateUtil;

/**
 *
 * @author budiarti
 */
public class PengajuanPerhiasan extends HttpServlet {

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
        String pengajuan = request.getParameter("txtPengajuan");
            String barang = request.getParameter("txtBarang");
            String nik = request.getParameter("txtNik");
            String nama = request.getParameter("txtNama");
            String tanggal = request.getParameter("txtTanggal");
         try (PrintWriter out = response.getWriter()) {
//             out.println(Pengajuan);
//             out.println(barang);
//             out.println(nik);
//             out.println(nama);
//             out.println(tanggal);
            PengajuanController pengajuanController = new PengajuanController(HibernateUtil.getSessionFactory());
             DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
             Date tanggaL = (Date) dateFormat.parse(tanggal);
            if (pengajuanController.saveOrEdit(pengajuan, nik,barang, tanggaL, 'W')) {
                out.println("oke");
                response.sendRedirect("dashAdminView/pengajuan.jsp");
            }
            else
            {
                out.println("Gagal");
            }
         }catch (Exception e) {
             e.printStackTrace();
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
