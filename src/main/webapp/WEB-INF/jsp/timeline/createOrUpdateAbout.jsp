<%-- 
    Document   : timelineAbout
    Created on : Aug 24, 2020, 9:44:56 AM
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
        <title>About Me | Learn Detail About Me</title>

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
                        <a class="navbar-brand" href="/ExpressBook/user/newsFeed"><img src="<c:url value='/resources/images/logo.png'/>" alt="logo" /></a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav navbar-right main-menu">
                            <li class="dropdown"><a href="/ExpressBook/user/newsFeed">Home</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Newsfeed <span><img src="<c:url value='/resources/images/down-arrow.png'/>" alt="" /></span></a>
                                <ul class="dropdown-menu newsfeed-home">
                                   <li><a href="/ExpressBook/user/newsFeed">Newsfeed</a></li>
                                    <!--<li><a href="newsfeed-people-nearby.html">Poeple Nearly</a></li>-->
                                    <li><a href="/ExpressBook/timeline/friendsPage">My friends</a></li>
                                    <li><a href="/ExpressBook/chat/chatPage">Chatroom</a></li>
                                    <li><a href="/ExpressBook/timeline/albumPage">Images</a></li>
                                    <!--<li><a href="newsfeed-videos.html">Videos</a></li>-->
                               </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Timeline <span><img src="<c:url value='/resources/images/down-arrow.png'/>" alt="" /></span></a>
                                <ul class="dropdown-menu login">
                                  <li><a href="/ExpressBook/timeline/timelinePage">Timeline</a></li>
                                    <li><a href="/ExpressBook/timeline/aboutPage">Timeline About</a></li>
                                    <li><a href="/ExpressBook/timeline/albumPage">Timeline Album</a></li>
                                    <li><a href="/ExpressBook/timeline/friendsPage">Timeline Friends</a></li>
                                 </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle pages" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">All Pages <span><img src="<c:url value='/resources/images/down-arrow.png'/>" alt="" /></span></a>
                                <ul class="dropdown-menu page-list">
                                     <li><a href="/ExpressBook/user/newsFeed">Landing Page</a></li>
                                    <li><a href="/ExpressBook/user/newsFeed">Newsfeed</a></li>
                                    <!--<li><a href="newsfeed-people-nearby.html">Poeple Nearly</a></li>-->
                                    <li><a href="/ExpressBook/timeline/friendsPage">My friends</a></li>
                                    <li><a href="/ExpressBook/chat/chatPage">Chatroom</a></li>
                                    <li><a href="/ExpressBook/timeline/albumPage">Images</a></li>
                                    <!--<li><a href="newsfeed-videos.html">Videos</a></li>-->
                                    <li><a href="/ExpressBook/timeline/timelinePage">Timeline</a></li>
                                    <li><a href="/ExpressBook/timeline/aboutPage">Timeline About</a></li>
                                    <li><a href="/ExpressBook/timeline/albumPage">Timeline Album</a></li>
                                    <li><a href="/ExpressBook/timeline/friendsPage">Timeline Friends</a></li>
                                    <!--<li><a href="contact.html">Contact Us</a></li>-->
                                  </ul>
                            </li>
                            <!--<li class="dropdown"><a href="contact.html">Contact</a></li>-->
                            <li class="dropdown"><a href="/ExpressBook/user/userLogin">Logout</a></li>
                        </ul>
<!--                        <form class="navbar-form navbar-right hidden-sm">
                            <div class="form-group">
                                <i class="icon ion-android-search"></i>
                                <input type="text" class="form-control" placeholder="Search friends, photos, videos">
                            </div>
                        </form>-->
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container -->
            </nav>
        </header>
        <!--Header End-->

        <div class="container">

            <!-- Timeline
            ================================================= -->
            <!--p_info, work_exp, location, interests, language, user_id(User)-->

            <form action="/ExpressBook/timeline/save" method="post" enctype="multipart/form-data">
            
            <div class="timeline">
                <div class="timeline-cover">

                    <!--Timeline Menu for Large Screens-->
                    <div class="timeline-nav-bar hidden-sm hidden-xs">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="profile-info">
                                    <!--<img src="<c:url value='/resources/images/users/user-1.jpg'/>" alt="" class="img-responsive profile-photo" />-->
                                    <!--<h5><a href="timeline.html" class="text-white"><c:out value="${loggedUser.full_name}"/></a></h5>-->
                                    <h5><a href="/ExpressBook/timeline/timelinePage" class="text-black">${LoggedUsername}</a></h5>
                                    <br>
                                    <h6>chose your profile Picture</h6>
                                    <input type="file" name="fileUpload" size="50" /></p>
                                    <!--<p class="text-muted">Creative Director</p>-->
                                </div>
                            </div>
                            <div class="col-md-9">
                                <ul class="list-inline profile-menu">
                                    <li><a href="/ExpressBook/timeline/timelinePage">Timeline</a></li>
                                    <li><a href="/ExpressBook/timeline/aboutPage" class="active">About</a></li>
                                    <li><a href="/ExpressBook/timeline/albumPage">Album</a></li>
                                    <li><a href="/ExpressBook/timeline/friendsPage">Friends</a></li>
                                </ul>
                                <ul class="follow-me list-inline">
<!--                                    <li>1,299 people following her</li>
                                    <li><button class="btn-primary">Add Friend</button></li>-->
                                </ul>
                            </div>
                        </div>
                    </div><!--Timeline Menu for Large Screens End-->

                    <!--Timeline Menu for Small Screens-->
                    <div class="navbar-mobile hidden-lg hidden-md">
                        <div class="profile-info">
                            <img src="<c:url value='/resources/images/users/user-1.jpg'/>" alt="" class="img-responsive profile-photo" />
                            <h5><a href="/ExpressBook/timeline/timelinePage" class="text-black">${LoggedUsername}</a></h5>
                            <p class="text-muted">Creative Director</p>
                        </div>
                        <div class="mobile-menu">
                            <ul class="list-inline">
                                <li><a href="/ExpressBook/timeline/timelinePage">Timeline</a></li>
                                <li><a href="/ExpressBook/timeline/aboutPage" class="active">About</a></li>
                                <li><a href="/ExpressBook/timeline/albumPage">Album</a></li>
                                <li><a href="/ExpressBook/timeline/friendsPage">Friends</a></li>
                            </ul>
                            <!--<button class="btn-primary">Add Friend</button>-->
                        </div>
                    </div><!--Timeline Menu for Small Screens End-->

                </div>
                <div id="page-contents">
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-7">

                            <!-- About
                            ================================================= -->
                            <!--p_info, work_exp, location, interests, language, user_id(User)-->
                            
                                <div class="about-profile">
                                    <div class="about-content-block">
                                        <h4 class="grey"><i class="ion-ios-information-outline icon-in-title"></i>Personal Information</h4>
                                        <textarea type="text" class="form-control" id="p_info" placeholder="Enter p_info" name="p_info" cols="10" rows="5">${map.aboutList.p_info}</textarea>
                                    </div>
                                    <div class="about-content-block">
                                        <h4 class="grey"><i class="ion-ios-briefcase-outline icon-in-title"></i>Work Experiences</h4>
                                        <input type="text" class="form-control" id="work_exp" placeholder="Enter work_exp" name="work_exp" value="${map.aboutList.work_exp}">
                                        <!--                  <div class="organization">
                                                            <img src="<c:url value='/resources/images/envato.png'/>" alt="" class="pull-left img-org" />
                                                            <div class="work-info">
                                                              <h5>Envato</h5>
                                                              <p>Seller - <span class="text-grey">1 February 2013 to present</span></p>
                                                            </div>
                                                          </div>-->
                                    </div>
                                    <div class="about-content-block">
                                        <h4 class="grey"><i class="ion-ios-location-outline icon-in-title"></i>Location</h4>
                                        <input type="text" class="form-control" id="location" placeholder="Enter location" name="location" value="${map.aboutList.location}">
                                    </div>
                                    <div class="about-content-block">
                                        <h4 class="grey"><i class="ion-ios-heart-outline icon-in-title"></i>Interests</h4>
                                        <input value="${map.aboutList.interests}" type="text" class="form-control" id="interests" placeholder="Enter interests" name="interests">
                                        <!--                  <ul class="interests list-inline">
                                                            <li><span class="int-icons" title="Bycycle riding"><i class="icon ion-android-bicycle"></i></span></li>
                                                            <li><span class="int-icons" title="Photography"><i class="icon ion-ios-camera"></i></span></li>
                                                            <li><span class="int-icons" title="Shopping"><i class="icon ion-android-cart"></i></span></li>
                                                            <li><span class="int-icons" title="Traveling"><i class="icon ion-android-plane"></i></span></li>
                                                            <li><span class="int-icons" title="Eating"><i class="icon ion-android-restaurant"></i></span></li>
                                                          </ul>-->
                                    </div>
                                    <div class="about-content-block">
                                        <h4 class="grey"><i class="ion-ios-chatbubble-outline icon-in-title"></i>Language</h4>
                                        <input value="${map.aboutList.languages}" type="text" class="form-control" id="languages" placeholder="Enter languages" name="languages">
                                        <!--                    <ul>
                                                              <li><a href="">Russian</a></li>
                                                              <li><a href="">English</a></li>
                                                            </ul>-->
                                    </div>
                                </div>
                                <input type="hidden" id="aboutID" name="aboutID" value="${map.aboutList.about_id}"/>
                                <button type="submit" class="btn btn-primary pull-right">Update About</button> <span>&nbsp;&nbsp;</span>
                                <a href="/ExpressBook/timeline/aboutPage" class="btn btn-primary pull-right">Cancel</a>
                            
                        </div>
                        <div class="col-md-2 static">
                            <div id="sticky-sidebar">
                                <h4 class="grey">Sarah's activity</h4>
                                <div class="feed-item">
                                    <div class="live-activity">
                                        <p><a href="#" class="profile-link">Sarah</a> Commended on a Photo</p>
                                        <p class="text-muted">5 mins ago</p>
                                    </div>
                                </div>
                                <div class="feed-item">
                                    <div class="live-activity">
                                        <p><a href="#" class="profile-link">Sarah</a> Has posted a photo</p>
                                        <p class="text-muted">an hour ago</p>
                                    </div>
                                </div>
                                <div class="feed-item">
                                    <div class="live-activity">
                                        <p><a href="#" class="profile-link">Sarah</a> Liked her friend's post</p>
                                        <p class="text-muted">4 hours ago</p>
                                    </div>
                                </div>
                                <div class="feed-item">
                                    <div class="live-activity">
                                        <p><a href="#" class="profile-link">Sarah</a> has shared an album</p>
                                        <p class="text-muted">a day ago</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                                
                 </form>               
                                
        </div>


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
                <p>Thunder Team © 2016. All rights reserved</p>
            </div>
        </footer>

        <!--preloader-->
        <div id="spinner-wrapper">
            <div class="spinner"></div>
        </div>

        <!-- Scripts
        ================================================= -->
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCTMXfmDn0VlqWIyoOxK8997L-amWbUPiQ&callback=initMap"></script>
        <script src="<c:url value='/resources/js/jquery-3.1.1.min.js'/>"></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
        <script src="<c:url value='/resources/js/jquery.sticky-kit.min.js'/>"></script>
        <script src="<c:url value='/resources/js/jquery.scrollbar.min.js'/>"></script>
        <script src="<c:url value='/resources/js/script.js'/>"></script>

    </body>
</html>

