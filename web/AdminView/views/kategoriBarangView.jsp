<%-- 
    Document   : kategoriBarang
    Created on : Aug 13, 2018, 4:28:21 PM
    Author     : budiarti
--%>

<%@page import="entities.KategoriBarang"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.KategoriBarangController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Kategori Barang</h2>
          <div class="table-responsive">
              <% KategoriBarangController kbc = new KategoriBarangController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID KATEGORI</th>
                  <th>NAMA_KATEGORI</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (KategoriBarang kategoriBarang : kbc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= kategoriBarang.getIdKategori() %></td>
                    <td><%= kategoriBarang.getNamaKategori() %></td>
                    <td>
                        <a href="=<%=kategoriBarang.getIdKategori() %>">Edit</a>
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
