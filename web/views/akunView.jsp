<%-- 
    Document   : akunView
    Created on : Aug 13, 2018, 1:21:42 PM
    Author     : budiarti
--%>

<%@page import="entities.Akun"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.AkunController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Akun</h2>
          <div class="table-responsive">
              <% AkunController ac = new AkunController(HibernateUtil.getSessionFactory()); %>
             
              <form action="akunViewServlet" method="GET">
              <table border="0">
            <tbody>
                <tr>
                    <td>NIK</td>
                    <td>:</td>
                    <td><input type="text" name="txtNik" value="" /></td>
                </tr>
                <tr>
                    <td>NAMA</td>
                    <td>:</td>
                    <td><input type="text" name="txtNama" value="" /></td>
                </tr>
                <tr>
                    <td>JENIS KELAMIN</td>
                    <td>:</td>
                    <td><input type="radio" name="radioJenisKelamin" value="L" />Laki-laki <input type="radio" name="radioJenisKelamin" value="P" />Perempuan</td>
                </tr>
                <tr>
                    <td>ALAMAT</td>
                    <td>:</td>
                    <td><input type="text" name="txtAlamat" value="" /></td>
                </tr>
                <tr>
                    <td>RT/RW</td>
                    <td>:</td>
                    <td><input type="text" name="txtRtRw" value="" /></td>
                </tr>
                <tr>
                    <td>DESA/KELURAHAN</td>
                    <td>:</td>
                    <td><input type="text" name="txtDesa" value="" /></td>
                </tr>
                <tr>
                    <td>KECAMATAN</td>
                    <td>:</td>
                    <td><input type="text" name="txtKecamatan" value="" /></td>
                </tr>
                <tr>
                    <td>KABUPATEN</td>
                    <td>:</td>
                    <td><input type="text" name="txtKabupaten" value="" /></td>
                </tr>
                <tr>
                    <td>PROVINSI</td>
                    <td>:</td>
                    <td><input type="text" name="txtProvinsi" value="" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="hidden" name="txtRole" id="selectRole" value="U" /></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td>:</td>
                    <td><input type="text" name="txtUsername" value="" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="password" name="txtPassword" value="" /></td>
                </tr>
            </tbody>
        </table>
              </form>
              <br>
              <input type="submit" value="Save" name="btnSave" />
        <br>
        <br>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>NIK</th>
                  <th>NAMA</th>
                  <th>JENIS KELAMIN</th>
                  <th>ALAMAT</th>
                  <th>RT/RW</th>
                  <th>DESA</th>
                  <th>KECAMATAN</th>
                  <th>KABUPATEN</th>
                  <th>PROVINSI</th>
                  <th>ROLE</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (Akun akun : ac.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= akun.getNik() %></td>
                    <td><%= akun.getNama() %></td>
                    <td><%= akun.getJenisKelamin() %></td>
                    <td><%= akun.getAlamat() %></td>
                    <td><%= akun.getRtRw() %></td>
                    <td><%= akun.getDesa() %></td>
                    <td><%= akun.getKecamatan() %></td>
                    <td><%= akun.getKabupaten() %></td>
                    <td><%= akun.getProvinsi() %></td>
                    <td><%= akun.getIdRole().getNamaRole() %></td>
                    <td>
                        <a href="../akunViewServlet=?txtId<%=akun.getNik() %>">Edit</a>
                    </td>
                </tr>
                <% i++;
                }
                %>
              </tbody>
            </table>
          </div>
    </body>
</html>
