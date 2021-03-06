<%-- 
    Document   : handphone
    Created on : Aug 15, 2018, 8:33:10 AM
    Author     : misbah alkhafadh
--%>

<% if (session.getAttribute("name")== null) {
        response.sendRedirect("../../form/loginUser.jsp");
    }else{
%>
<%@page import="entities.DetailJenisMerk"%>
<%@page import="controllers.DetailJMController"%>
<%@page import="controllers.BarangController"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="entities.JenisBarang"%>
<%@page import="controllers.JenisBarangController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
        <link rel="icon" type="image/png" href="../assets/img/favicon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>
            Pengajuan Gadai Handphone
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
    <body>
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
                        <li class="nav-item">
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
                        <li class="nav-item active">
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
                            <a class="navbar-brand" href="#">Pengajuan Gadai Handphone</a>
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
                            <div class="col-lg-12 col-md-12">
                                <div class="card">
                                    <div class="card-header card-header-tabs card-header-primary" style="background: #00bcd4">
                                        <div class="nav-tabs-navigation">
                                            <div class="nav-tabs-wrapper">
                                                <!--<span class="nav-tabs-title">Pengajuan Gadai:</span>-->
                                                <ul class="nav nav-tabs">
                                                    <li class="nav-item col-md-6">
                                                        <a class="nav-link active" href="handphone.jsp" style="text-align: center">
                                                            Langkah 1
                                                            <div class="ripple-container"></div>
                                                        </a>
                                                    </li>
                                                    <li class="nav-item col-md-6">
                                                        <a class="nav-link" href="handphonePengajuan.jsp" style="text-align: center">
                                                            Langkah 2
                                                            <div class="ripple-container"></div>
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="card-body">
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="step-1">
                                                <div class="card-body">
                                                    <form method="post" action="handphoneSave">
                                                        <% BarangController bc = new BarangController(HibernateUtil.getSessionFactory());
                                                            String id = bc.AutoId();
                                                        %>
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    <input type="hidden" name="id_barang" value="<%= id%>">
                                                                    <input type="hidden" name="id_jenis" value="JN8">
                                                                    <select class="form-control" name="cbxJenis">
                                                                        <option selected="0">Jenis </option>
                                                                        <%
                                                                            JenisBarangController jbc = new JenisBarangController(HibernateUtil.getSessionFactory());
                                                                            for (JenisBarang jb : jbc.search("Id_kategori", "KT3")) {
                                                                        %>
                                                                        <option value="<%= jb.getIdJenis()%>,<%= jb.getIdKategori()%>"><%= jb.getNamaJenis()%></option>
                                                                        <% }
                                                                        %>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    <select class="form-control" name="cbxJenis">
                                                                        <option disabled="" selected="0">Merk Laptop</option>
                                                                        <%
                                                                            DetailJMController jbcController = new DetailJMController(HibernateUtil.getSessionFactory());
                                                                            for (DetailJenisMerk djm : jbcController.search("Id_jenis", "JN8")) {
                                                                        %>
                                                                        <option value="<%= djm.getIdJenis()%>,<%= djm.getIdDetail()%>"><%= djm.getIdMerk().getNamaMerk() %></option>
                                                                        <% }
                                                                        %>
                                                                    </select>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    <label class="bmd-label-floating">Tipe</label>
                                                                    <input type="text" name="" class="form-control">
                                                                </div>
                                                            </div>
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    <label class="bmd-label-floating">Kondisi Barang</label>
                                                                    <input type="text" name="" class="form-control">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <div class="form-group">
                                                                    <label class="bmd-label-floating">Harga Jual</label>
                                                                    <input type="text" name="" class="form-control">
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <!-- Upload  -->
                                                        <div class="row">
                                                            <div id="file-upload-form" class="uploader">
                                                                <input id="file-upload" type="file" name="foto" accept="image/*" />

                                                                <label for="file-upload" id="file-drag">
                                                                    <img id="file-image" src="#" alt="Preview" class="hidden">
                                                                    <div id="start">
                                                                        <i class="material-icons" aria-hidden="true">cloud_upload</i>
                                                                        <div>Select a file or drag here</div>
                                                                        <div id="notimage" class="hidden">Please select an image</div>
                                                                        <span id="file-upload-btn" class="btn btn-primary">Upload Foto</span>
                                                                    </div>
                                                                    <div id="response" class="hidden">
                                                                        <div id="messages"></div>
                                                                        <progress class="progress" id="file-progress" value="0">
                                                                            <span>0</span>%
                                                                        </progress>
                                                                    </div>
                                                                </label>
                                                            </div>
                                                        </div>
                                                        <button type="submit" class="btn btn-primary pull-right" style="background: #00bcd4">Simpan</button>
                                                        <div class="clearfix"></div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

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
        <script src="../assets/js/file-upload.js"></script>
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