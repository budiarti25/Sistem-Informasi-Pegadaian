<%-- 
    Document   : barangView
    Created on : Aug 13, 2018, 3:17:19 PM
    Author     : budiarti
--%>

<%@page import="entities.Barang"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.BarangController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Barang</h2>
          <div class="table-responsive">
              <% BarangController bc = new BarangController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID BARANG</th>
                  <th>ID DETAIL</th>
                  <th>HARGA PERKIRAAN</th>
                  <th>FOTO</th>
                  <th>DESKRIPSI</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (Barang barang : bc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= barang.getIdBarang()%></td>
                    <td><%= barang.getIdDetail() %></td>
                    <td><%= barang.getHargaPerkiraan() %></td>
                    <td><%= barang.getFoto() %></td>
                    <td><%= barang.getDeskripsi() %></td>
                    <td>
                        <a href="=<%=barang.getIdBarang() %>">Edit</a>
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
