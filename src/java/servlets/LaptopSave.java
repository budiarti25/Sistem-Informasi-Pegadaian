
package servlets;

import controllers.BarangController;
import controllers.DetailJMController;
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
 * @author Marsha D A
 */
public class LaptopSave extends HttpServlet {

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
            String id = request.getParameter("id_barang");
            String jenis = request.getParameter("id_jenis");
            String merk = request.getParameter("cbxMerk");
            String tipe = request.getParameter("txtTipe");
            String hdd = request.getParameter("txtKapasitas");
            String beli = request.getParameter("txtBeli");
            String jual = request.getParameter("txtJual");
            String gambar = request.getParameter("foto");
            String desk = tipe+";"+hdd+";"+beli;
            String detail= null;
            HttpSession session = request.getSession();
            RequestDispatcher dispatcher = null;
         try (PrintWriter out = response.getWriter()) {
             DetailJMController djmc = new DetailJMController(HibernateUtil.getSessionFactory());
             detail = djmc.search2(jenis, merk).getIdDetail();
            BarangController bc = new BarangController(HibernateUtil.getSessionFactory());
            if (bc.saveOrEdit(id, detail,jual, gambar, desk)) {
                out.println("oke");
                session.setAttribute("barang", id);
//                response.sendRedirect("views/gadaiElektronikView.jsp");
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
