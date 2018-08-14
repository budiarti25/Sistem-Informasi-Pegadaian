<%-- 
    Document   : gadaiLaptopView
    Created on : Aug 14, 2018, 10:46:04 AM
    Author     : budiarti
--%>

<%@page import="controllers.KategoriBarangController"%>
<%@page import="controllers.JenisBarangController"%>
<%@page import="controllers.BarangController"%>
<%@page import="tools.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gadai Laptop!</h1>
        <div class="table-responsive">
            <%BarangController bc = new BarangController(HibernateUtil.getSessionFactory()); %>
            <%JenisBarangController jbc = new JenisBarangController(HibernateUtil.getSessionFactory()); %>
            <%KategoriBarangController kbc = new KategoriBarangController(HibernateUtil.getSessionFactory()); %>
            <form action="" method="">
                <table border="0">
                    <tbody>
                        <tr>
                            
                            <td>Jenis Gadget</td>
                            <td>:</td>
                            <td><input type="hidden" name="txtGadget" value="JN7" readonly="readonly" /></td>
                        </tr>
                        <tr>
                            
                            <td>Merk Laptop</td>
                            <td>:</td>
                            <td><select name="cbxLaptop">
                                    <option></option>
                                    <option></option>
                                </select></td>
                        </tr>
                        <tr>
                            <td>Tipe</td>
                            <td>:</td>
                            <td><input type="text" name="txtTipe" value="" /></td>
                        </tr>
                        <tr>
                            <td>Kapasitas Hardisk</td>
                            <td>:</td>
                            <td><input type="text" name="txtHardisk" value="" /></td>
                        </tr>
                        <tr>
                            <td>Tahun Pembelian</td>
                            <td>:</td>
                            <td><input type="text" name="txtBeli" value="" /></td>
                        </tr>
                        <tr>
                            <td>Harga Jual Saat Ini</td>
                            <td>:</td>
                            <td><input type="text" name="txtJual" value="" /></td>
                        </tr>
                        <tr>
                            <td>Upload Foto</td>
                            <td>:</td>
                            <td><input type="text" name="txtGambar" value="" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </body>
</html>
