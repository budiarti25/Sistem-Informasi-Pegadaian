<%-- 
    Document   : nasabah
    Created on : Aug 18, 2018, 12:21:13 PM
    Author     : misbah alkhafadh
--%>

<% if (session.getAttribute("name") == null) {
        response.sendRedirect("../form/loginAdmin.jsp");
    } else {
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
        <!-- MORRIS CHART STYLES-->

        <!-- CUSTOM STYLES-->
        <link href="assets/css/custom.css" rel="stylesheet" />
        <!-- GOOGLE FONTS-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
        <!-- TABLE STYLES-->
        <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
    </head>
    <body>
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
                            <a href="userProfile.jsp"><i class="fa fa-user fa-3x"></i> User Profile </a>
                        </li>
                        <li>
                            <a class="active-menu" href="nasabah.jsp"><i class="fa fa-users fa-3x"></i> Nasabah </a>
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
                            <h2>Data Nasabah</h2>   
                            <h5>Welcome Jhon Deo , Love to see you back. </h5>
                        </div>
                    </div>
                    <!-- /. ROW  -->
                    <hr />

                    <div class="row">
                        <div class="col-md-12" style="padding-bottom: 10px">
                            <div class="col-md-6">
                                <button class="btn btn-primary" data-title="Tambah" data-toggle="modal" data-target="#insert"><i class="fa fa-plus"></i> Tambah Data</button>
                            </div>
                            <div class="col-md-6" >
                                <button class="btn btn-success" style="float: right"><i class="fa fa-bookmark"></i> Laporan Data</button>
                            </div>
                        </div>
                        <!-- Advanced Tables -->                                
                        <div class="panel-body" >
                            <div class="table-responsive" >
                                <% AkunController ac = new AkunController(HibernateUtil.getSessionFactory());%>
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example" style="overflow-x:auto;">
                                    <thead>
                                        <tr>
                                            <th>NIK</th>
                                            <th>Nama</th>
                                            <th>JK</th>
                                            <th>Alamat</th>
                                            <th>RT/RW</th>
                                            <th>Desa</th>
                                            <th>Kecamatan</th>
                                            <th>Kabupaten</th>
                                            <th>Provinsi</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% int i = 1;
                                            for (Akun akun : ac.getAll()) {
                                        %>
                                        <tr class="odd gradeA">
                                            <td><%= akun.getNik()%></td>
                                            <td><%= akun.getNama()%></td>
                                            <td><%= akun.getJenisKelamin()%></td>
                                            <td><%= akun.getAlamat()%></td>
                                            <td><%= akun.getRtRw()%></td>
                                            <td><%= akun.getDesa()%></td>
                                            <td><%= akun.getKecamatan()%></td>
                                            <td><%= akun.getKabupaten()%></td>
                                            <td><%= akun.getProvinsi()%></td>
                                            <td>
                                                <button class="btn btn-xs btn-primary center" data-title="Edit" data-toggle="modal" data-target="#edit"><i class="fa fa-edit"></i></button>
                                            </td>
                                        </tr>
                                        <% i++;
                                            }
                                        %>
                                    </tbody>
                                </table>
                                <!--modal Insert-->
                                <div class="modal fade" id="insert" tabindex="-1" role="dialog" aria-labelledby="insert" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                <h4 class="modal-title custom_align" id="Heading">Masukan Data Nasabah</h4>
                                            </div>
                                            <form method="post" action="../nasabahServlet">
                                                <div class="modal-body">
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtNik" type="text" placeholder="NIK">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="nama" type="text" placeholder="Nama Lengkap">
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="form-group col-md-3">
                                                            <div class="radio">
                                                                <input type="radio" name="jenis_kelamin" id="optionsRadios1" value="option1" checked />Laki-laki
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <div class="radio">
                                                                <input type="radio" name="jenis_kelamin" id="optionsRadios2" value="option2"/>Perempuan
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="alamat" type="text" placeholder="Alamat">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="rt_rw" type="text" placeholder="RT/RW">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="desa" type="text" placeholder="Desa">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtKec" type="text" placeholder="Kecamatan">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtKab" type="text" placeholder="Kabupaten">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtProv" type="text" placeholder="Provinsi">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtEmail" type="text" placeholder="Username">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtPass" type="text" placeholder="Password">
                                                    </div>
                                                </div>
                                                <div class="modal-footer ">
                                                    <button type="submit" class="btn btn-danger btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span>Tambahkan</button>
                                                </div>
                                            </form>
                                        </div>
                                        <!-- /.modal-content --> 
                                    </div>
                                    <!-- /.modal-dialog --> 
                                </div>
                                <!--modal Edit-->
                                <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="submit" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                <h4 class="modal-title custom_align" id="Heading">Edit Data Nasabah</h4>
                                            </div>
                                            <form>
                                                <%
                                                    Akun akn = new Akun();
                                                %>
                                                <div class="modal-body">
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtNik" type="text" placeholder="NIK" value="">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="nama" type="text" placeholder="Nama Lengkap">
                                                    </div>
                                                    <div class="form-group">
                                                        <div class="form-group col-md-3">
                                                            <div class="radio">
                                                                <input type="radio" name="jenis_kelamin" id="optionsRadios1" value="option1" checked />Laki-laki
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <div class="radio">
                                                                <input type="radio" name="jenis_kelamin" id="optionsRadios2" value="option2"/>Perempuan
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="alamat" type="text" placeholder="Alamat">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="rt_rw" type="text" placeholder="RT/RW">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="desa" type="text" placeholder="Desa">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtKec" type="text" placeholder="Kecamatan">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtKab" type="text" placeholder="Kabupaten">
                                                    </div>
                                                    <div class="form-group">
                                                        <input class="form-control " name="txtProv" type="text" placeholder="Provinsi">
                                                    </div>
                                                </div>
                                                <div class="modal-footer ">
                                                    <button type="button" class="btn btn-primary btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Update</button>
                                                </div>
                                            </form>
                                        </div>
                                        <!-- /.modal-content --> 
                                    </div>
                                    <!-- /.modal-dialog --> 
                                </div>
                            </div>
                        </div>
                        <!--End Advanced Tables -->
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
        <!-- DATA TABLE SCRIPTS -->
        <script src="assets/js/dataTables/jquery.dataTables.js"></script>
        <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
        </script>
        <!-- CUSTOM SCRIPTS -->
        <script src="assets/js/custom.js"></script>
    </body>
</html>
<%}%>