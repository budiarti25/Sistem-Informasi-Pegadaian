<%-- 
    Document   : dashboardUser
    Created on : Aug 15, 2018, 8:29:07 AM
    Author     : misbah alkhafadh
--%>

<% if (session.getAttribute("name")== null) {
        response.sendRedirect("../../form/loginUser.jsp");
    }else{
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/favicon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>
            Dashboard User
        </title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <!--     Fonts and icons     -->
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
        <link rel="stylesheet" href="../assets/css/font-awesome.min.css">
        <!-- CSS Files -->
        <link href="../assets/css/material-dashboard.css?v=2.1.0" rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="../assets/demo/demo.css" rel="stylesheet" />
    </head>
    <body class="">
        <div class="wrapper ">
            <div class="sidebar" data-color="azure" data-background-color="white" data-image="../assets/img/sidebar-1.jpg">
                <!--
                  Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"
        
                  Tip 2: you can also add an image using data-image tag
                -->
                <div class="logo">
                    <a href="dasboardUser.jsp" class="simple-text logo-normal">
                        Pegadaian
                    </a>
                </div>
                <div class="sidebar-wrapper">
                    <ul class="nav">
                        <li class="nav-item active  ">
                            <a class="nav-link" href="dasboardUser.jsp">
                                <i class="material-icons">dashboard</i>
                                <p>Dashboard</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="user.jsp">
                                <i class="material-icons">person</i>
                                <p>User Profile</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="perhiasan.jsp">
                                <i class="material-icons">attach_money</i>
                                <p>Perhiasan</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="elektronik.jsp">
                                <i class="material-icons">tv</i>
                                <p>Elektronik</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="handphone.jsp">
                                <i class="material-icons">phone_iphone</i>
                                <p>Handphone</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="laptop.jsp">
                                <i class="material-icons">laptop</i>
                                <p>Laptop</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="kendaraan.jsp">
                                <i class="material-icons">motorcycle</i>
                                <p>Kendaraan</p>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link" href="map.jsp">
                                <i class="material-icons">location_ons</i>
                                <p>Maps</p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="main-panel">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
                    <div class="container-fluid">
                        <div class="navbar-wrapper">
                            <a class="navbar-brand" href="#pablo">Dashboard</a>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="navbar-toggler-icon icon-bar"></span>
                            <span class="navbar-toggler-icon icon-bar"></span>
                            <span class="navbar-toggler-icon icon-bar"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-end">
                            <form class="navbar-form">
                                <div class="input-group no-border">
                                    <input type="text" value="" class="form-control" placeholder="Search...">
                                    <button type="submit" class="btn btn-white btn-round btn-just-icon">
                                        <i class="material-icons">search</i>
                                        <div class="ripple-container"></div>
                                    </button>
                                </div>
                            </form>
                            <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link" href="#pablo">
                                        <i class="material-icons" data-toggle="tooltip" data-placement="top" title="Dashboard">dashboard</i>
                                        <p class="d-lg-none d-md-block">
                                            Stats
                                        </p>
                                    </a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="material-icons" data-toggle="tooltip" data-placement="top" title="Notification">notifications</i>
                                        <span class="notification">5</span>
                                        <p class="d-lg-none d-md-block">
                                            Some Actions
                                        </p>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                        <a class="dropdown-item" href="#">Mike John responded to your email</a>
                                        <a class="dropdown-item" href="#">You have 5 new tasks</a>
                                        <a class="dropdown-item" href="#">You're now friend with Andrew</a>
                                        <a class="dropdown-item" href="#">Another Notification</a>
                                        <a class="dropdown-item" href="#">Another One</a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link" href="../../logoutUserServlet">
                                        <i class="material-icons" data-toggle="tooltip" data-placement="top" title="Logout">power_settings_new</i>
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- End Navbar -->

                <div class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="card">
                                    <div class="card-header card-header-primary" style="background: #00bcd4">
                                        <h4 class="card-title">Dashboard User</h4>
                                        <p class="card-category"></p>
                                    </div>
                                    <div class="card-body">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!--Footer-->
                <footer class="footer">
                    <div class="container-fluid">
                        <div class="copyright">
                            &copy;
                            <script>
                                document.write(new Date().getFullYear())
                            </script>, made with <i class="material-icons">favorite</i> by
                            <a href="#" target="_blank">Bootcamp17 Group</a> for a better web.
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <!--   Core JS Files   -->
        <script src="../assets/js/core/jquery.min.js" type="text/javascript"></script>
        <script src="../assets/js/core/popper.min.js" type="text/javascript"></script>
        <script src="../assets/js/core/bootstrap-material-design.min.js" type="text/javascript"></script>
        <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
        <!--  Google Maps Plugin    -->
        <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
        <!-- Chartist JS -->
        <script src="../assets/js/plugins/chartist.min.js"></script>
        <!--  Notifications Plugin    -->
        <script src="../assets/js/plugins/bootstrap-notify.js"></script>
        <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
        <script src="../assets/js/material-dashboard.min.js?v=2.1.0" type="text/javascript"></script>
        <!-- Material Dashboard DEMO methods, don't include it in your project! -->
        <script src="../assets/demo/demo.js"></script>
        <script>
                                $(document).ready(function () {
                                    // Javascript method's body can be found in assets/js/demos.js
                                    md.initDashboardPageCharts();

                                });
        </script>

    </body>
</html>

<%}%>