<%-- 
    Document   : adminPage
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
<!--                            <li class="dropdown"><a href="index.html">Home</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Newsfeed <span><img src="images/down-arrow.png" alt="" /></span></a>
                                <ul class="dropdown-menu newsfeed-home">
                                    <li><a href="newsfeed.html">Newsfeed</a></li>
                                    <li><a href="newsfeed-people-nearby.html">Poeple Nearly</a></li>
                                    <li><a href="newsfeed-friends.html">My friends</a></li>
                                    <li><a href="newsfeed-messages.html">Chatroom</a></li>
                                    <li><a href="newsfeed-images.html">Images</a></li>
                                    <li><a href="newsfeed-videos.html">Videos</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Timeline <span><img src="images/down-arrow.png" alt="" /></span></a>
                                <ul class="dropdown-menu login">
                                    <li><a href="timeline.html">Timeline</a></li>
                                    <li><a href="timeline-about.html">Timeline About</a></li>
                                    <li><a href="timeline-album.html">Timeline Album</a></li>
                                    <li><a href="timeline-friends.html">Timeline Friends</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle pages" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">All Pages <span><img src="images/down-arrow.png" alt="" /></span></a>
                                <ul class="dropdown-menu page-list">
                                    <li><a href="index.html">Landing Page</a></li>
                                    <li><a href="newsfeed.html">Newsfeed</a></li>
                                    <li><a href="newsfeed-people-nearby.html">Poeple Nearly</a></li>
                                    <li><a href="newsfeed-friends.html">My friends</a></li>
                                    <li><a href="newsfeed-messages.html">Chatroom</a></li>
                                    <li><a href="newsfeed-images.html">Images</a></li>
                                    <li><a href="newsfeed-videos.html">Videos</a></li>
                                    <li><a href="timeline.html">Timeline</a></li>
                                    <li><a href="timeline-about.html">Timeline About</a></li>
                                    <li><a href="timeline-album.html">Timeline Album</a></li>
                                    <li><a href="timeline-friends.html">Timeline Friends</a></li>
                                    <li><a href="contact.html">Contact Us</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="contact.html">Contact</a></li>-->
                            <li class="dropdown"><a href="/ExpressBook/user/userLogin">User</a></li>
                        </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container -->
            </nav>
        </header>
        <!--Header End-->

        <!-- Top Banner
        ================================================= -->
        <section id="banner">
            <div class="container">

                <!-- Sign Up Form
                ================================================= -->
                <div class="sign-up-form">
                    <a href="index.html" class="logo"><img src="<c:url value='/resources/images/logo.png'/>" alt="Friend Finder"/></a>
                    <h2 class="text-white">Find My Friends</h2>
                    <div class="line-divider"></div>
                    <div class="form-wrapper">
                        <p class="signup-text">Hey hello Admin Login here</p>
                        <form action="/ExpressBook/admin/adminLogin" method="post">
                            <fieldset class="form-group">
                                <input type="text" class="form-control" id="mob_email" placeholder="Enter Mobile number Or Email" name="mob_email">
                            </fieldset>
                            <fieldset class="form-group">
                                <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
                            </fieldset>    
                            <button type="submit" class="btn-secondary">Login</button><p></p>
                            <button type="reset" class="btn-secondary">Reset</button>
                        </form>                
                    </div>
                    <!--<a href="/ExpressBook/user/userRegister">Don't have an account? Click for Sign up</a>-->
                    <img class="form-shadow" src="<c:url value='/resources/images/bottom-shadow.png'/>" alt="bottom-shadow" />
                </div><!-- Login Form End -->

                <svg class="arrows hidden-xs hidden-sm">
                <path class="a1" d="M0 0 L30 32 L60 0"></path>
                <path class="a2" d="M0 20 L30 52 L60 20"></path>
                <path class="a3" d="M0 40 L30 72 L60 40"></path>
                </svg>
            </div>
        </section>
      
        <!-- Footer
        ================================================= -->
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

    </body>
</html>
