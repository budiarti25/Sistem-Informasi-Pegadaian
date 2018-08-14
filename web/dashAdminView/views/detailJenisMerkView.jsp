<%-- 
    Document   : detailJenisMerkView
    Created on : Aug 13, 2018, 3:27:36 PM
    Author     : budiarti
--%>

<%@page import="entities.DetailJenisMerk"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.DetailJMController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Data Detail Jenis Merk</h2>
          <div class="table-responsive">
              <% DetailJMController djmc = new DetailJMController(HibernateUtil.getSessionFactory()); %>
              <table class="table table-striped table-sm" border="1">
              <thead>
                <tr>
                    <th style="text-align: center">No</th>
                  <th>ID DETAIL</th>
                  <th>ID JENIS</th>
                  <th>ID MERK</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <% int i = 1;
                    for (DetailJenisMerk djm : djmc.getAll()) {
                  %>                
                <tr>
                    <td style="text-align: center"><%= i %></td>
                    <td><%= djm.getIdDetail() %></td>
                    <td><%= djm.getIdJenis() %></td>
                    <td><%= djm.getIdMerk() %></td>
                    <td>
                        <a href="=<%=djm.getIdDetail() %>">Edit</a>
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
