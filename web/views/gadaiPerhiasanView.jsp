<%-- 
    Document   : gadaiPerhiasanView
    Created on : Aug 14, 2018, 6:35:02 AM
    Author     : budiarti
--%>

<%@page import="entities.KategoriBarang"%>
<%@page import="entities.DetailJenisMerk"%>
<%@page import="java.util.List"%>
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
        <h1>Gadai Perhiasan</h1>
        <div class="table-responsive">            
            <form action="" method="">
                <table border="0">
                    <tbody>
                        <tr>
                            <td>Jenis Perhiasan</td>
                            <td>:</td>
                            <td><select name="cmbPerhiasan" id="selectJenis">
                            <%
                                JenisBarangController jbc = new JenisBarangController(HibernateUtil.getSessionFactory());
                                for (JenisBarang jb : jbc.search("Id_kategori", "KT1")) {
                            %><option value="<%= jb.getIdJenis() %>,<%= jb.getIdKategori() %>"><%= jb.getNamaJenis() %></option>           
                            <%    }
                            %>
                        </select></td>
                        </tr>
                        <tr>
                            <td>Kadar Emas</td>
                            <td>:</td>
                            <td><select name="cbxKadar">
                                    <option>Kadar Emas</option>
                                    <option>6 Karat</option>
                                    <option>7 Karat</option>
                                    <option>8 Karat</option>
                                    <option>9 Karat</option>
                                    <option>10 Karat</option>
                                    <option>11 Karat</option>
                                    <option>12 Karat</option>
                                    <option>13 Karat</option>
                                    <option>14 Karat</option>
                                    <option>15 Karat</option>
                                    <option>16 Karat</option>
                                    <option>17 Karat</option>
                                    <option>18 Karat</option>
                                    <option>19 Karat</option>
                                    <option>20 Karat</option>
                                    <option>21 Karat</option>
                                    <option>22 Karat</option>
                                    <option>23 Karat</option>
                                    <option>24 Karat</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td>Berat Kotor</td>
                            <td>:</td>
                            <td><input type="text" name="txtBkotor" value="" /></td>
                        </tr>
                        <tr>
                            <td>Berat Bersih</td>
                            <td>:</td>
                            <td><input type="text" name="txtBbersih" value="" /></td>
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
