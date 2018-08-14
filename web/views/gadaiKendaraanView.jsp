<%-- 
    Document   : gadaiKendaraanView
    Created on : Aug 14, 2018, 10:51:28 AM
    Author     : budiarti
--%>

<%@page import="entities.DetailJenisMerk"%>
<%@page import="controllers.DetailJMController"%>
<%@page import="entities.Merk"%>
<%@page import="controllers.MerkController"%>
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
        <h1>Gadai Kendaraan</h1>
        <div class="table-responsive">
            <%BarangController bc = new BarangController(HibernateUtil.getSessionFactory()); %>
            <%KategoriBarangController kbc = new KategoriBarangController(HibernateUtil.getSessionFactory()); %>
            <form action="" method="">
                <table border="0">
                    <tbody>
                        <tr>

                            <td>Jenis Kendaraan</td>
                            <td>:</td>
                            <td><select name="cbxKendaraan">
                                    <%
                                        JenisBarangController jbc = new JenisBarangController(HibernateUtil.getSessionFactory());
                                        for (JenisBarang jb : jbc.search("Id_kategori", "KT4")) {
                                    %><option value="<%= jb.getIdJenis()%>,<%= jb.getIdKategori()%>"><%= jb.getNamaJenis()%></option>
                                    <% }
                                    %>
                                </select></td>
                        </tr>
                        <tr>

                            <td>Merk</td>
                            <td>:</td>
                            <td><select name="cbxMerk">
                                    <%
                                        DetailJMController detailJMController = new DetailJMController(HibernateUtil.getSessionFactory());
                                        for (DetailJenisMerk djm : detailJMController.search("Id_merk", "KT3")) {
                                    %><option value="<%= djm.getIdDetail() %>,<%= djm.getIdJenis() %>"><%= djm.getIdMerk().getNamaMerk() %></option>
                                    <% }
                                    %>
                                </select></td>
                        </tr>
                        <tr>
                            <td>Tipe</td>
                            <td>:</td>
                            <td><input type="text" name="txtTipe" value="" /></td>
                        </tr>
                        <tr>
                            <td>Isi Silinder</td>
                            <td>:</td>
                            <td><input type="text" name="txtSilinder" value="" /></td>
                        </tr>
                        <tr>
                            <td>Tahun Pembuatan</td>
                            <td>:</td>
                            <td><input type="text" name="txtBuat" value="" /></td>
                        </tr>
                        <tr>
                            <td>Harga Jual Saat Ini</td>
                            <td>:</td>
                            <td><input type="text" name="txtJual" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nama BPKB</td>
                            <td>:</td>
                            <td><input type="text" name="txtNamaBPKB" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nomor BPKB</td>
                            <td>:</td>
                            <td><input type="text" name="txtNoBPKB" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nomor Mesin</td>
                            <td>:</td>
                            <td><input type="text" name="txtMesin" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nomor Polisi</td>
                            <td>:</td>
                            <td><input type="text" name="txtPolisi" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nomor Rangka</td>
                            <td>:</td>
                            <td><input type="text" name="txtRangka" value="" /></td>
                        </tr>
                        <tr>
                            <td>Nomor STNK</td>
                            <td>:</td>
                            <td><input type="text" name="txtSTNK" value="" /></td>
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
