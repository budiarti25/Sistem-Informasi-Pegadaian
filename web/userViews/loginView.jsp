<%-- 
    Document   : loginView
    Created on : Aug 14, 2018, 8:23:39 AM
    Author     : misbah alkhafadh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
               Form Login Pegadaian
         </div>
      </div>
      <div class="row">
         <div class="col-md-4 mx-auto">
            <div class="myform form ">
               <form action="" method="post" name="login">
                  <div class="form-group">
                     <input type="text" name="name"  class="form-control my-input" id="name" placeholder="Username">
                  </div>
                  <div class="form-group">
                      <input type="password" name="password"  class="form-control my-input" id="password" placeholder="Password">
                  </div>
                  <div class="text-center ">
                     <button type="submit" class=" btn btn-block send-button tx-tfm">Login</button>
                  </div>
                  <div class="col-md-12 ">
                     <div class="login-or">
                        <hr class="hr-or">
                        <span class="span-or">or</span>
                     </div>
                  </div>
                  <div class="form-group">
                      <a class="btn btn-block g-button" href="registrasiView.jsp">
                     <i class="fa fa-google"></i> Registrasi Sekarang!!!
                     </a>
                  </div>
<!--                  <p class="small mt-3">By signing up, you are indicating that you have read and agree to the <a href="#" class="ps-hero__content__link">Terms of Use</a> and <a href="#">Privacy Policy</a>.-->
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
