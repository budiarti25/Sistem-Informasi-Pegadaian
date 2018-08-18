<%-- 
    Document   : jenisBarangView
    Created on : Aug 13, 2018, 3:33:30 PM
    Author     : budiarti
--%>

<%@page import="entities.JenisBarang"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.JenisBarangController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Jenis Barang</h2>
          <div class="table-responsive">
              <% JenisBarangController jbc = new JenisBarangController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID JENIS</th>
                  <th>ID KATEGORI</th>
                  <th>NAMA JENIS</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (JenisBarang jenisBarang : jbc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= jenisBarang.getIdJenis() %></td>
                    <td><%= jenisBarang.getIdKategori() %></td>
                    <td><%= jenisBarang.getNamaJenis() %></td>
                    <td>
                        <a href="=<%=jenisBarang.getIdJenis() %>">Edit</a>
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
