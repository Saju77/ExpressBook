<%-- 
    Document   : registerUser
    Created on : Aug 10, 2020, 1:43:09 AM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="This is social network html5 template available in themeforest......" />
        <meta name="keywords" content="Social Network, Social Media, Make Friends, Newsfeed, Profile Page" />
        <meta name="robots" content="index, follow" />
        <title>ExpressBook</title>

        <!-- Stylesheets
        ================================================= -->
        <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>" />
        <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>" />
        <link rel="stylesheet" href="<c:url value='/resources/css/ionicons.min.css'/>" />
        <link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>" />
        <!--Google Webfont-->
        <link href='https://fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,300italic,400italic,500,500italic,600,600italic,700' rel='stylesheet' type='text/css'>
        <!--Favicon-->
        <link rel="shortcut icon" type="image/png" href="<c:url value='/resources/images/fav.png'/>"/>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.css"/>
    </head>
    <body>

        <!-- Header
        ================================================= -->
        <header id="header">
            <nav class="navbar navbar-default navbar-fixed-top menu">
                <div class="container">

                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#"><img src="<c:url value='/resources/images/logo.png'/>" alt="logo" /></a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right main-menu">
                            <li class="dropdown"><a href="/ExpressBook/admin/viewUser">View User</a></li>
                            <li class="dropdown"><a href="/ExpressBook/admin/viewAudit">View Audit</a></li>
                            <li class="dropdown"><a href="/ExpressBook/user/userLogin">Logout</a></li>
                        </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container -->
            </nav>
        </header>
        <!--Header End-->

        <!-- Top Banner
        ================================================= -->
        <!--        <section id="banner">
                    <div class="container">-->
        <br/>
        <div>
            
            <div class="text-center"><h2>View Audit Log</h2></div>

            <table id="datatable"  class="table table-striped table-bordered" style="width:100%">
                <thead>
                    <tr class="thead-dark">
                        <!--audit_id, action, username, role, mob_email, pass, date-->
                        <th>Audit_id</th>
                        <th>action</th>
                        <th>Username</th>
                        <th>Role</th>
                        <th>Mobile Or Email</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${map.auditList}" var="audit">
                        <tr>
                            <td>${audit.audit_id}</td>
                            <td>${audit.action}</td>
                            <td>${audit.username}</td>
                            <td>${audit.role}</td>
                            <td>${audit.mob_email}</td>
                            <td>${audit.date}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <footer id="footer">
            <div class="container">
                <div class="row">
                    <div class="footer-wrapper">
                        <div class="col-md-3 col-sm-3">
                            <a href=""><img src="<c:url value='/resources/images/logo-black.png'/>" alt="" class="footer-logo" /></a>
                            <ul class="list-inline social-icons">
                                <li><a href="#"><i class="icon ion-social-facebook"></i></a></li>
                                <li><a href="#"><i class="icon ion-social-twitter"></i></a></li>
                                <li><a href="#"><i class="icon ion-social-googleplus"></i></a></li>
                                <li><a href="#"><i class="icon ion-social-pinterest"></i></a></li>
                                <li><a href="#"><i class="icon ion-social-linkedin"></i></a></li>
                            </ul>
                        </div>
                        <div class="col-md-2 col-sm-2">
                            <h6>For individuals</h6>
                            <ul class="footer-links">
                                <li><a href="">Signup</a></li>
                                <li><a href="">login</a></li>
                                <li><a href="">Explore</a></li>
                                <li><a href="">Finder app</a></li>
                                <li><a href="">Features</a></li>
                                <li><a href="">Language settings</a></li>
                            </ul>
                        </div>
                        <div class="col-md-2 col-sm-2">
                            <h6>For businesses</h6>
                            <ul class="footer-links">
                                <li><a href="">Business signup</a></li>
                                <li><a href="">Business login</a></li>
                                <li><a href="">Benefits</a></li>
                                <li><a href="">Resources</a></li>
                                <li><a href="">Advertise</a></li>
                                <li><a href="">Setup</a></li>
                            </ul>
                        </div>
                        <div class="col-md-2 col-sm-2">
                            <h6>About</h6>
                            <ul class="footer-links">
                                <li><a href="">About us</a></li>
                                <li><a href="">Contact us</a></li>
                                <li><a href="">Privacy Policy</a></li>
                                <li><a href="">Terms</a></li>
                                <li><a href="">Help</a></li>
                            </ul>
                        </div>
                        <div class="col-md-3 col-sm-3">
                            <h6>Contact Us</h6>
                            <ul class="contact">
                                <li><i class="icon ion-ios-telephone-outline"></i>+1 (234) 222 0754</li>
                                <li><i class="icon ion-ios-email-outline"></i>info@thunder-team.com</li>
                                <li><i class="icon ion-ios-location-outline"></i>228 Park Ave S NY, USA</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <p>copyright @thunder-team 2016. All rights reserved</p>
            </div>
        </footer>

        <!--preloader-->
        <div id="spinner-wrapper">
            <div class="spinner"></div>
        </div>

        <!-- Scripts
        ================================================= -->
        <script src="<c:url value='/resources/js/jquery-3.1.1.min.js'/>"></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
        <script src="<c:url value='/resources/js/jquery.appear.min.js'/>"></script>
        <script src="<c:url value='/resources/js/jquery.incremental-counter.js'/>"></script>
        <script src="<c:url value='/resources/js/script.js'/>"></script>

        <script src="https://unpkg.com/jquery@3.3.1/dist/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.21/datatables.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#datatable').DataTable();
            });
        </script>

    </body>
</html>
