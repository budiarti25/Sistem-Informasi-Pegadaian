<%-- 
    Document   : gadaiElektronikView
    Created on : Aug 14, 2018, 10:50:37 AM
    Author     : budiarti
--%>

<%@page import="entities.KategoriBarang"%>
<%@page import="java.util.List"%>
<%@page import="entities.DetailJenisMerk"%>
<%@page import="controllers.DetailJMController"%>
<%@page import="entities.JenisBarang"%>
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
        <h1>Gadai Elektronik</h1>
        <div class="table-responsive">
            <%BarangController bc = new BarangController(HibernateUtil.getSessionFactory()); %>
            <%KategoriBarangController kbc = new KategoriBarangController(HibernateUtil.getSessionFactory()); %>
            <form action="" method="">
                <table border="0">
                    <tbody>
                        <tr>

                            <td>Jenis Elektronik</td>
                            <td>:</td>
                            <td><select name="cbxJenis">
                                    <%
                                        JenisBarangController jbc = new JenisBarangController(HibernateUtil.getSessionFactory());
                                        for (JenisBarang jb : jbc.search("Id_kategori", "KT3")) {
                                    %><option value="<%= jb.getIdJenis()%>,<%= jb.getIdKategori()%>"><%= jb.getNamaJenis()%></option>
                                    <% }
                                    %>
                                </select></td>
                        </tr>
                        <tr>

                            <td>Merk Elektronik</td>
                            <td>:</td>
                            <td><select name="cbxMerk">
                                </select></td>
                        </tr>
                        <tr>
                            <td>Tipe</td>
                            <td>:</td>
                            <td><input type="text" name="txtTipe" value="" /></td>
                        </tr>
                        <tr>
                            <td>Tipe Jaminan</td>
                            <td>:</td>
                            <td><input type="text" name="txtJaminan" value="" /></td>
                        </tr>
                        <tr>
                            <td>Kondisi Barang</td>
                            <td>:</td>
                            <td><input type="text" name="txtKondisi" value="" /></td>
                        </tr>
                        <tr>
                            <td>Harga Jual</td>
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
