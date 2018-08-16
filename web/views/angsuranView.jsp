<%-- 
    Document   : angsuranView
    Created on : Aug 16, 2018, 11:21:39 AM
    Author     : budiarti
--%>

<%@page import="controllers.AngsuranController"%>
<%@page import="tools.HibernateUtil"%>
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
            <% AngsuranController ac = new AngsuranController(HibernateUtil.getSessionFactory());%>

            <form action="transaksiViewServlet" method="GET">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>ID ANGSURAN</td>
                            <td>:</td>
                            <td><input type="text" name="txtAngsuran" value="" /></td>
                        </tr>
                        <tr>
                            <td>ID TRANSAKSI</td>
                            <td>:</td>
                            <td><select name="cmbTransaksi">
                                    <option></option>
                                    <option></option>
                                </select></td>
                        </tr>
                        <tr>
                            <td>TANGGAL ANGSURAN</td>
                            <td>:</td>
                            <td><input type="text" name="txtTanggal" value="" /></td>
                        </tr>
                        <tr>
                            <td>NOMINAL ANGSURAN</td>
                            <td>:</td>
                            <td><input type="text" name="txtNominal" value="" /></td>
                        </tr>
                        <tr>
                            <td>STATUS</td>
                            <td>:</td>
                            <td><input type="hidden" name="txtStatus" value="" /></td>
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
