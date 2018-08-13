<%-- 
    Document   : transaksiView
    Created on : Aug 13, 2018, 4:56:52 PM
    Author     : budiarti
--%>

<%@page import="entities.Transaksi"%>
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
              <% TransaksiController tc = new TransaksiController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID TRANSAKSI</th>
                  <th>ID PENGAJUAN</th>
                  <th>TANGGAL TRANSAKSI</th>
                  <th>DANA CAIR</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (Transaksi transaksi : tc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= transaksi.getIdTransaksi() %></td>
                    <td><%= transaksi.getIdPengajuan() %></td>
                    <td><%= transaksi.getTanggalTansaksi() %></td>
                    <td><%= transaksi.getDanaCair() %></td>
                    <td>
                        <a href="=<%=transaksi.getIdTransaksi() %>">Edit</a>
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
