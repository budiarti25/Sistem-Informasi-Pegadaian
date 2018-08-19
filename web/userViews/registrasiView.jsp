<%-- 
    Document   : registrasiView
    Created on : Aug 14, 2018, 8:06:55 AM
    Author     : misbah alkhafadh
--%>
<%@page import="entities.Akun"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.AkunController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrasi</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <!--Custom-->
        <link href="css/style.css" rel="stylesheet">
    </head>
<body>
   <div class="container">
      <div class="col-md-6 mx-auto text-center">
         <div class="header-title">
            <h1 class="wv-heading--title">
               Form Registrasi Pegadaian
            </h1>
            <h2 class="wv-heading--subtitle">
               Silahkan lakukan registrasi jika Anda belum mempunyai akun pegadaian
            </h2>
         </div>
      </div>
      <div class="row">
         <div class="col-md-4 mx-auto">
            <div class="myform form">
                <% AkunController ac = new AkunController(HibernateUtil.getSessionFactory()); %>
               <form action="../regestrasiServlet" method="GET" name="login">
                  <div class="form-group">
                     <input type="text" name="txtNIK"  class="form-control my-input" id="name" placeholder="NIK">
                  </div>
                   <div class="form-group">
                     <input type="text" name="txtNama"  class="form-control my-input" id="name" placeholder="Name">
                  </div>
                  <div class="form-group">
                     <input type="text" name="txtUsername"  class="form-control my-input" id="username" placeholder="Username">
                  </div>
                  <div class="form-group">
                     <input type="password" name="password" class="form-control my-input" id="password" placeholder="Password">
                  </div>
                  <div class="text-center ">
                     <button type="submit" class=" btn btn-block send-button tx-tfm">Sign Up!!!</button>
                  </div>
                  <p class="small mt-3">By signing up, you are indicating that you have read and agree to the <a href="#" class="ps-hero__content__link">Terms of Use</a> and <a href="#">Privacy Policy</a>.
                  </p>
               </form>
            </div>
         </div>
      </div>
   </div>
    <!--JQuery-->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-3.3.1.js"></script>
</body>
</html>
