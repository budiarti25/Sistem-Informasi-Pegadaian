<%-- 
    Document   : pengajuanView
    Created on : Aug 13, 2018, 4:48:29 PM
    Author     : budiarti
--%>

<%@page import="entities.Pengajuan"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.PengajuanController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Pengajuan</h2>
          <div class="table-responsive">
              <% PengajuanController pc = new PengajuanController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID PENGAJUAN</th>
                  <th>NIK</th>
                  <th>ID BARANG</th>
                  <th>TANGGAL PENGAJUAN</th>
                  <th>STATUS</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (Pengajuan pengajuan : pc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= pengajuan.getIdPengajuan() %></td>
                    <td><%= pengajuan.getNik() %></td>
                    <td><%= pengajuan.getIdBarang() %></td>
                    <td><%= pengajuan.getTanggalPengajuan() %></td>
                    <td><%= pengajuan.getStatus() %></td>
                    <td>
                        <a href="=<%=pengajuan.getIdPengajuan() %>">Edit</a>
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
