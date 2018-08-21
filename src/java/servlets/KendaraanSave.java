
package servlets;

import controllers.BarangController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tools.HibernateUtil;

/**
 *
 * @author Marsha D A
 */
public class KendaraanSave extends HttpServlet {

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
            String jenis = request.getParameter("cbxKendaraan");
            String merk = request.getParameter("cbxMerk");
            String tipe = request.getParameter("txtTipe");
            String silinder = request.getParameter("txtSilinder");
            String tahun = request.getParameter("txtBuat");
            String jual = request.getParameter("txtJual");
            String bpkb = request.getParameter("txtNamaBPKB");
            String nobpkb = request.getParameter("txtNoBPKB");
            String mesin = request.getParameter("txtMesin");
            String nopol = request.getParameter("txtPolisi");
            String rangka = request.getParameter("txtRangka");
            String stnk = request.getParameter("txtSTNK");
            String gambar = request.getParameter("txtGambar");
            String desk = tipe+";"+silinder+";"+tahun+";;"+bpkb+";"+nobpkb+";"+mesin+";"+nopol+";"+rangka+";"+stnk;
        try (PrintWriter out = response.getWriter()) {
            BarangController bc = new BarangController(HibernateUtil.getSessionFactory());
            if (bc.saveOrEdit(jenis, merk, jual, gambar,desk)) {
                response.sendRedirect("views/gadaiKendaraan.jsp");
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
