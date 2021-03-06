<%-- 
    Document   : userProfile
    Created on : Aug 18, 2018, 12:26:37 PM
    Author     : misbah alkhafadh
--%>

<% if (session.getAttribute("name")== null) {
        response.sendRedirect("../form/loginAdmin.jsp");
    }else{
%>
<%@page import="entities.Akun"%>
<%@page import="tools.HibernateUtil"%>
<%@page import="controllers.AkunController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Admin Pegadaian</title>
        <!-- BOOTSTRAP STYLES-->
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <!-- FONTAWESOME STYLES-->
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />
        <!-- GOOGLE FONTS-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    </head>
    <body>
        <%
            String user = session.getAttribute("name").toString();
           
            Akun akun = (Akun) new AkunController(HibernateUtil.getSessionFactory()).findByID(user);
        %>
        
        <div id="wrapper">
            <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="dashboardAdmin.jsp">Pegadaian</a> 
                </div>
                <div style="color: white;
                     padding: 15px 50px 5px 50px;
                     float: right;
                     font-size: 16px;"> Last access : 30 May 2014 &nbsp; <a href="../logoutAdminServlet" class="btn btn-danger square-btn-adjust">Logout</a> </div>
            </nav>   
            <!-- /. NAV TOP  -->
            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="text-center">
                            <img src="assets/img/find_user.png" class="user-image img-responsive"/>
                        </li>
                        <li>
                            <a  href="dashboardAdmin.jsp"><i class="fa fa-dashboard fa-3x"></i> Dashboard</a>
                        </li>
                        <li>
                            <a class="active-menu" href="userProfile.jsp"><i class="fa fa-user fa-3x"></i> User Profile </a>
                        </li>
                        <li>
                            <a href="nasabah.jsp"><i class="fa fa-users fa-3x"></i> Nasabah </a>
                        </li>
                        <li>
                            <a href="pengajuan.jsp"><i class="fa fa-cogs fa-3x"></i> Pengajuan </a>
                        </li>
                        <li>
                            <a href="transaksi.jsp"><i class="fa fa-cogs fa-3x"></i> Transaksi </a>
                        </li>	
                        <li>
                            <a href="angsuran.jsp"><i class="fa fa-dollar fa-3x"></i> Angsuran </a>
                        </li>
                        <li>
                            <a  href="barang.jsp"><i class="fa fa-archive fa-3x"></i> Barang </a>
                        </li>				
                    </ul>
                </div>
            </nav>  
            <!-- /. NAV SIDE  -->
            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-md-12">
                            <h2>User Profile</h2>   
                            <h5>Welcome Jhon Deo , Love to see you back. </h5>
                        </div>
                    </div>
                    <!-- /. ROW  -->
                    <hr />

                    <div class="row">
                        <form role="form" method="post" action="../adminProfile">
                            <div class="col-md-12">
                                <div class="form-group col-md-3" style="text-align: right">
                                    <label>Nama Lengkap</label>
                                </div>
                                <input type="hidden" name="txtNik" value="<%= akun.getNik() %>" />
                                <div class="col-md-7">
                                    <div class="form-group">
                                        <input type="text" class="form-control" name="nama" placeholder="Nama Lengkap" value="<%= akun.getNama() %>" />
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group col-md-3" style="text-align: right">
                                    <label>Jenis Kelamin</label>
                                </div>
                                <div class="form-group col-md-2">
                                    <div class="radio">
                                        <input type="radio" name="jenis_kelamin" id="optionsRadios1" value="option1" checked="" />Laki-laki
                                    </div>
                                </div>
                                <div class="form-group col-md-6">
                                    <div class="radio">
                                        <input type="radio" name="jenis_kelamin" id="optionsRadios2" value="option2"/>Perempuan
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group col-md-3" style="text-align: right">
                                    <label>Alamat Lengkap</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text" class="form-control" name="alamat" placeholder="Jalan/dusun" value="<%= akun.getAlamat() %>"/>
                                </div>
                                <div class="form-group col-md-1">
                                    <label>RT/RW</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text"class="form-control" name="rt_rw" placeholder="RT/RW" value="<%= akun.getRtRw() %>"/>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group col-md-3" style="text-align: right">
                                    <label>Desa</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text" class="form-control" name="desa" placeholder="Desa" value="<%= akun.getDesa() %>"/>
                                </div>
                                <div class="form-group col-md-1">
                                    <label>Kec</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text"class="form-control" name="txtKec" placeholder="Kecamatan" value="<%= akun.getKecamatan() %>"/>
                                </div></div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group col-md-3" style="text-align: right">
                                    <label>Kabupaten</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text" class="form-control" name="txtKab" placeholder="Kabupaten" value="<%= akun.getKabupaten() %>"/>
                                </div>
                                <div class="form-group col-md-1">
                                    <label>Prov</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text"class="form-control" name="txtProv" placeholder="Provinsi" value="<%= akun.getProvinsi() %>"/>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group col-md-3" style="text-align: right">
                                    <label>Account</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="email" class="form-control" name="txtEmail" placeholder="Email" value="<%= akun.getUsername() %>"/>
                                </div>
                                <div class="form-group col-md-1">
                                    <label>Pass</label>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="password" class="form-control" name="txtPass" placeholder="Password" value="<%= akun.getPassword() %>"/>
                                </div>
                            </div>
                            <div class="col-md-4"></div>
                            <div class="col-md-8">
                                <button type="submit" class="btn btn-primary">Simpan</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
        </div>
        <!-- /. WRAPPER  -->
        <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
        <!-- JQUERY SCRIPTS -->
        <script src="assets/js/jquery-1.10.2.js"></script>
        <!-- BOOTSTRAP SCRIPTS -->
        <script src="assets/js/bootstrap.min.js"></script>
        <!-- METISMENU SCRIPTS -->
        <script src="assets/js/jquery.metisMenu.js"></script>
        <!-- CUSTOM SCRIPTS -->
        <script src="assets/js/custom.js"></script>
    </body>
</html>
<%}%>