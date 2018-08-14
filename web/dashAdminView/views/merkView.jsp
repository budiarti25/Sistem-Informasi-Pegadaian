<%-- 
    Document   : merkView
    Created on : Aug 13, 2018, 4:44:27 PM
    Author     : budiarti
--%>

<%@page import="entities.Merk"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.MerkController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Merk</h2>
          <div class="table-responsive">
              <% MerkController mc = new MerkController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>MERK ID</th>
                  <th>NAMA_MERK</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (Merk merk : mc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= merk.getIdMerk() %></td>
                    <td><%= merk.getNamaMerk() %></td>
                    <td>
                        <a href="=<%=merk.getIdMerk() %>">Edit</a>
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
