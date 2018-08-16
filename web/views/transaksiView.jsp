<%-- 
    Document   : transaksiView
    Created on : Aug 16, 2018, 11:09:48 AM
    Author     : budiarti
--%>

<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.TransaksiController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Transaksi</h2>
        <div class="table-responsive">
            <% TransaksiController ac = new TransaksiController(HibernateUtil.getSessionFactory());%>

            <form action="transaksiViewServlet" method="GET">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>ID TRANSAKSI</td>
                            <td>:</td>
                            <td><input type="text" name="txtTransaksi" value="" /></td>
                        </tr>
                        <tr>
                            <td>ID PENGAJUAN</td>
                            <td>:</td>
                            <td><select name="cmbPengajuan">
                                    <option></option>
                                    <option></option>
                                </select></td>
                        </tr>
                        <tr>
                            <td>DANA CAIR</td>
                            <td>:</td>
                            <td><input type="text" name="txtDana" value="" /></td>
                        </tr>
                        <tr>
                            <td>TANGGAL TRANSAKSI</td>
                            <td>:</td>
                            <td><input type="text" name="txtTanggal" value="" /></td>
                        </tr>
                    </tbody>
                </table>
            </form>
            <br>
            <input type="submit" value="Save" name="btnSave" />
            <br>
            <br>
        </div>
    </body>
</html>
