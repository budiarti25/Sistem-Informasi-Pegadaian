<%-- 
    Document   : register
    Created on : Aug 20, 2018, 8:50:24 PM
    Author     : misbah alkhafadh
--%>

<%@page import="entities.Akun"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.AkunController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Registrasi Nasabah</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/img-01.jpg');">
                <div class="wrap-login100 p-t-50 p-b-30">
                    <% AkunController ac = new AkunController(HibernateUtil.getSessionFactory()); %>
                    <form class="login100-form validate-form" action="../regestrasiServlet" method="GET" name="login">
                        <span class="login100-form-title p-t-20 p-b-45">
                            Register To Get Account
                        </span>
                        
<!--                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Name is required">
                            <input class="input100" required type="text" name="txtNama" id = "txt" placeholder="Nama Lengkap" onkeyup = "Validate(this)" required/> 
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-user"></i>
                            </span>
                        </div>
                        -->
                        <div class="wrap-input100 validate-input m-b-10" data-validate = "NIK is required">
                            <!--<input class="input100" type="email" name="username" placeholder="Email">-->
                            <input class="input100" required type="number" name="txtNIK" id = "nik" placeholder="NIK" onKeyPress="if(this.value.length==16) return false;"/> 
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-vcard"></i>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Email is required">
                            <!--<input class="input100" type="email" name="username" placeholder="Email">-->
                            <input class="input100" required type="text" name="txtUsername" id = "email"  onchange="email_validate(this.value);" placeholder="Email" /> 
                            <div class="status" id="status"></div>
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-at"></i>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required" >
                            <input class="input100 inputpass" type="password" required name="password" placeholder="Password" minlength="6" maxlength="16"  id="pass1">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock"></i>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-10" data-validate = "Password is required">
                            <input class="input100 inputpass" type="password" required name="password" placeholder="Password Confirm" minlength="6" maxlength="16" id="pass2" onkeyup="checkPass(); return false;">
                            <span class="focus-input100"></span>
                            <span id="confirmMessage" class="confirmMessage"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock"></i>
                            </span>

                        </div>

                        <div class="container-login100-form-btn p-t-10">
                            <button class="login100-form-btn" type="submit" name="submit_reg" value="Register">
                                Register
                            </button>
                        </div>

                        <!--                        <div class="form-group">
                                                    <label for="password"><span class="req">* </span> Password: </label>
                                                    <input required name="password" type="password" class="form-control inputpass" minlength="4" maxlength="16"  id="pass1" /> </p>
                        
                                                    <label for="password"><span class="req">* </span> Password Confirm: </label>
                                                    <input required name="password" type="password" class="form-control inputpass" minlength="4" maxlength="16" placeholder="Enter again to validate"  id="pass2" onkeyup="checkPass(); return false;" />
                                                    <span id="confirmMessage" class="confirmMessage"></span>
                                                </div>
                        
                        
                                                <div class="form-group">
                                                    <input class="btn btn-success" type="submit" name="submit_reg" value="Register">
                                                </div>-->

                        <div class="text-center w-full p-t-25 p-b-25">
                            <a class="txt1" href="loginUser.jsp">
                                Back To Login
                                <i class="fa fa-long-arrow-left"></i>						
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!--===============================================================================================-->	
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>
        <script type="text/javascript">
            document.getElementById("field_terms").setCustomValidity("Please indicate that you accept the Terms and Conditions");
        </script>

    </body>
</html>