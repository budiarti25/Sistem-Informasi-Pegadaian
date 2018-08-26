<%-- 
    Document   : laporanAngsuran
    Created on : Aug 26, 2018, 8:26:14 PM
    Author     : budiarti
--%>

<%@ page import="java.io.*"%>
<%@ page import="tools.HibernateUtil"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<%@ page import="net.sf.jasperreports.engine.*"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="net.sf.jasperreports.view.JRViewer"%>
<%@ page import="org.hibernate.engine.jdbc.connections.spi.ConnectionProvider"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try{        
            Connection test = HibernateUtil.getSessionFactory().getSessionFactoryOptions()
                .getServiceRegistry().getService(ConnectionProvider.class).getConnection();
        
            test.createStatement().execute("alter session set "
                + "current_schema = pegadaian");
            
            File reportFile = new File(application.getRealPath("angsuranReport.jasper"));//your report_name.jasper file
//            Map parameters = new HashMap();
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, test);
 
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
            }catch (Exception exx){
            out.print("Error "+ exx.getMessage());
        }
        %>
    </body>
</html>
