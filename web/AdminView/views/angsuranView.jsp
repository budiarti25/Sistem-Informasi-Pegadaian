<%-- 
    Document   : angsuranView
    Created on : Aug 13, 2018, 3:04:50 PM
    Author     : budiarti
--%>

<%@page import="entities.Angsuran"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.AngsuranController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Angsuran</h2>
          <div class="table-responsive">
              <% AngsuranController ac = new AngsuranController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID ANGSURAN</th>
                  <th>ID TRANSAKSI</th>
                  <th>TANGGAL BAYAR</th>
                  <th>NOMINAL ANGSURAN</th>
                  <th>STATUS</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (Angsuran angsuran : ac.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= angsuran.getIdAngsuran() %></td>
                    <td><%= angsuran.getIdTransaksi() %></td>
                    <td><%= angsuran.getTanggalBayar() %></td>
                    <td><%= angsuran.getNominalAngsuran() %></td>
                    <td><%= angsuran.getStatus() %></td>
                    <td>
                        <a href="=<%=angsuran.getIdAngsuran() %>">Edit</a>
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
