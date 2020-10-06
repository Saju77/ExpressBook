<%-- 
    Document   : newsFeed
    Created on : Aug 12, 2020, 8:37:19 PM
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
        <title>News Feed | Check what your friends are doing</title>

        <!-- Stylesheets
        ================================================= -->
        <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css'/>" />
        <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>" />
        <link rel="stylesheet" href="<c:url value='/resources/css/ionicons.min.css'/>" />
        <link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>" />
        <link href="<c:url value='/resources/css/emoji.css'/>" rel="stylesheet">
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
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Newsfeed <span><img src="images/down-arrow.png" alt="" /></span></a>
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
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Timeline <span><img src="images/down-arrow.png" alt="" /></span></a>
                                <ul class="dropdown-menu login">
                                    <li><a href="/ExpressBook/timeline/timelinePage">Timeline</a></li>
                                    <li><a href="/ExpressBook/timeline/aboutPage">Timeline About</a></li>
                                    <li><a href="/ExpressBook/timeline/albumPage">Timeline Album</a></li>
                                    <li><a href="/ExpressBook/timeline/friendsPage">Timeline Friends</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle pages" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">All Pages <span><img src="images/down-arrow.png" alt="" /></span></a>
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

        <div id="page-contents">
            <div class="container">
                <div class="row">

                    <!-- Newsfeed Common Side Bar Left
                    ================================================= -->
                    <div class="col-md-3 static">
                        <div class="profile-card">
                            <img src="/ExpressBook/timeline/imageDisplay?id=${LoggedUserId}" alt="user" class="profile-photo" />
                            <!--<h5><a href="timeline.html" class="text-white"><c:out value="${loggedUser.full_name}"/></a></h5>-->
                            <h5><a href="/ExpressBook/timeline/aboutPage" class="text-white"><c:out value="${LoggedUsername}"/></a></h5>
                            <!--<a href="#" class="text-white"><i class="ion ion-android-person-add"></i> 1,299 followers</a>-->
                        </div><!--profile card ends-->
                        <ul class="nav-news-feed">
                            <li><i class="icon ion-ios-paper"></i><div><a href="/ExpressBook/user/newsFeed">My Newsfeed</a></div></li>
                            <!--<li><i class="icon ion-ios-people"></i><div><a href="newsfeed-people-nearby.html">People Nearby</a></div></li>-->
                            <li><i class="icon ion-ios-people-outline"></i><div><a href="/ExpressBook/timeline/friendsPage">Friends</a></div></li>
                            <li><i class="icon ion-chatboxes"></i><div><a href="/ExpressBook/chat/chatPage">Messages</a></div></li>
                            <li><i class="icon ion-images"></i><div><a href="/ExpressBook/timeline/albumPage">Images</a></div></li>
                            <!--<li><i class="icon ion-ios-videocam"></i><div><a href="newsfeed-videos.html">Videos</a></div></li>-->
                        </ul><!--news-feed links ends-->
                        <div id="chat-block">
                            <div class="title">Chat online</div>
                            <ul class="online-users list-inline">
                                <li><a href="newsfeed-messages.html" title="Linda Lohan"><img src="<c:url value='/resources/images/users/user-2.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="Sophia Lee"><img src="<c:url value='/resources/images/users/user-3.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="John Doe"><img src="<c:url value='/resources/images/users/user-4.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="Alexis Clark"><img src="<c:url value='/resources/images/users/user-5.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="James Carter"><img src="<c:url value='/resources/images/users/user-6.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="Robert Cook"><img src="<c:url value='/resources/images/users/user-7.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="Richard Bell"><img src="<c:url value='/resources/images/users/user-8.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="Anna Young"><img src="<c:url value='/resources/images/users/user-9.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                                <li><a href="newsfeed-messages.html" title="Julia Cox"><img src="<c:url value='/resources/images/users/user-10.jpg'/>" alt="user" class="img-responsive profile-photo" /><span class="online-dot"></span></a></li>
                            </ul>
                        </div><!--chat block ends-->
                    </div>
                    <div class="col-md-7">

                        <!-- Post Create Box
                        ================================================= -->
                        <form action="/ExpressBook/post/save" method="post" enctype="multipart/form-data">
                            <div class="create-post">
                                <div class="row">
                                    <div class="col-md-10 col-sm-10">
                                        <div class="form-group">
                                            <img src="/ExpressBook/timeline/imageDisplay?id=${LoggedUserId}" alt="user" class="profile-photo-md" />
                                            <fieldset class="form-group">
                                                <textarea name="desc" id="desc" cols="50" rows="3" class="form-control" placeholder="Write what you wish"></textarea>
                                            </fieldset>                      
                                        </div>
                                    </div>
                                    <div class="col-md-2 col-sm-2  pull-right">
                                        <div class="tools">
                                            <ul class="publishing-tools list-inline">
                                                <!--<li><a href="#"><i class="ion-compose"></i></a></li>-->
                                                <!--<li><button name="img"><i class="ion-images"></i></button></li>-->
                                                <input type="file" name="fileUpload" size="50" />
                                                <!--<li><a href="#"><i class="ion-ios-videocam"></i></a></li>-->
                                                <!--<li><a href="#"><i class="ion-map"></i></a></li>-->
                                            </ul>
                                            <button type="submit" class="btn btn-primary pull-right">Publish</button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </form>      <!-- Post Create Box End-->

                        <!-- My Created Post Content
                        ================================================= -->

                        <c:forEach items="${map.postList}" var="post">
                            <div class="post-content">
                              <!--<img src="<c:url value='/resources/images/post-images/1.jpg'/>" alt="post-image" class="img-responsive post-image" />-->

                                <img src="/ExpressBook/post/imageDisplay?id=${post.post_id}" alt="post-image" class="img-responsive post-image"/>
                                <div class="post-container">
                                    <img src="/ExpressBook/timeline/imageDisplay?id=${post.user.user_id}" alt="user" class="profile-photo-md pull-left" />
                                    <div class="post-detail">
                                        <div class="user-info">
                                            <h5><a href="timeline.html" class="profile-link"><c:out value="${post.user.full_name}"/></a></h5>
                                            <p class="text-muted">Published a photo at <b>${post.postOrupdate_date}</b></p>
                                        </div>

                                        <!--                  <div class="reaction">
                                                            <a class="btn text-green"><i class="icon ion-thumbsup"></i> 13</a>
                                                            <a class="btn text-red"><i class="fa fa-thumbs-down"></i> 0</a>
                                                          </div>-->
                                        <div class="line-divider"></div>
                                        <div class="post-text">
                                            <p>${post.description}</p>
                                        </div>
                                        <div class="line-divider"></div>
                                        <c:forEach items="${map.subpostList}" var="sub">
                                            <c:if test="${post.post_id == sub.post.post_id}">
                                                <div class="post-comment">
                                                    <img src="/ExpressBook/timeline/imageDisplay?id=${sub.user.user_id}" alt="" class="profile-photo-sm" />
                                                    <p><a href="timeline.html" class="profile-link">${sub.user.full_name}</a><br>${sub.comments}</p>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                        <form action="/ExpressBook/subPost/save" method="post">
                                            <div class="post-comment">
                                                <img src="/ExpressBook/timeline/imageDisplay?id=${LoggedUserId}" alt="user" class="profile-photo-sm" />
                                                <input type="text" class="form-control" id="comment" placeholder="Enter comment" name="comment" onmousedown="hello('/ExpressBook/subPost/getPostById?id=${post.post_id}')">
                                                <!--<input type="submit" class="btn-secondary" value="Comment"/>-->
                                                <!--<input type="text" class="form-control" placeholder="Post a comment">-->
                                            </div>
                                        </form> 
                                    </div>
                                </div>
                            </div>
                        </c:forEach>

                        <!-- Post Content
                        ================================================= -->
                        <div class="post-content">
                            <img src="<c:url value='/resources/images/post-images/8.jpg'/>" alt="post-image" class="img-responsive post-image" />
                            <div class="post-container">
                                <img src="<c:url value='/resources/images/users/user-5.jpg'/>" alt="user" class="profile-photo-md pull-left" />
                                <div class="post-detail">
                                    <div class="user-info">
                                        <h5><a href="timeline.html" class="profile-link">Alexis Clark</a> <span class="following">following</span></h5>
                                        <p class="text-muted">Published a photo about 3 mins ago</p>
                                    </div>
                                    <div class="reaction">
                                        <a class="btn text-green"><i class="icon ion-thumbsup"></i> 13</a>
                                        <a class="btn text-red"><i class="fa fa-thumbs-down"></i> 0</a>
                                    </div>
                                    <div class="line-divider"></div>
                                    <div class="post-text">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. <i class="em em-anguished"></i> <i class="em em-anguished"></i> <i class="em em-anguished"></i></p>
                                    </div>
                                    <div class="line-divider"></div>
                                    <div class="post-comment">
                                        <img src="<c:url value='/resources/images/users/user-11.jpg'/>" alt="" class="profile-photo-sm" />
                                        <p><a href="timeline.html" class="profile-link">Diana </a><i class="em em-laughing"></i> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud </p>
                                    </div>
                                    <div class="post-comment">
                                        <img src="<c:url value='/resources/images/users/user-4.jpg'/>" alt="" class="profile-photo-sm" />
                                        <p><a href="timeline.html" class="profile-link">John</a> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud </p>
                                    </div>
                                    <div class="post-comment">
                                        <img src="<c:url value='/resources/images/users/user-1.jpg'/>" alt="" class="profile-photo-sm" />
                                        <input type="text" class="form-control" placeholder="Post a comment">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--Post Content end div-->
                    </div>

                    <!-- Newsfeed Common Side Bar Right
                    ================================================= -->
                    <div class="col-md-2 static">
                        <div class="suggestions" id="sticky-sidebar">
                            <h4 class="grey">Who to Follow</h4>

                            <c:forEach items="${map.userList}" var="user">
                                <c:if test="${user.user_id != LoggedUserId}">
                                    <%--<c:forEach items="${map.freqList}" var="freqList">--%>
                                    <%--<c:if test="${user.user_id != freqList.to_user_id}">--%>
                                    <div class="follow-user">
                                        <img src="/ExpressBook/timeline/imageDisplay?id=${user.user_id}" alt="user" class="profile-photo-sm pull-left"/>
                                        <div>
                                            <h5><a href="/ExpressBook/timeline/friendsAbout/${user.user_id}">${user.full_name}</a></h5>
                                            <!--<h5><a href="timeline.html">${freqList.to_user_id}</a></h5>-->
                                            <input type="hidden" name="frnd_id" value="${user.user_id}"/>
                                            <a href="/ExpressBook/timeline/fReqSave/${user.user_id}" class="text-green">Add friend</a>
                                        </div> 
                                    </div>
                                    <%--</c:if>--%> 
                                    <%--</c:forEach>--%>  
                                </c:if> 
                            </c:forEach>   
                            <div class="follow-user">
                                <img src="<c:url value='/resources/images/users/user-12.jpg'/>" alt="" class="profile-photo-sm pull-left" />
                                <div>
                                    <h5><a href="timeline.html">Cris Haris</a></h5>
                                    <a href="#" class="text-green">Add friend</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
        <script language='javascript'>
//                                                    window. = function(hello('/ExpressBook/subPost/getPostById?id=${post.post_id}')){
//                                                        $.get('/ExpressBook/subPost/getPostById?id=${post.post_id}',
//                                                                function (data, status) {
//                                                                });
//                                                    }
//                                                    ;

//                                                    $(document).ready(function () {
//                                                        console.log(/ExpressBook/subPost/getPostById?id=${post.post_id});
//                                                    });

//                                                    $(window).load(function () {
//                                                        alert('/ExpressBook/subPost/getPostById?id=${post.post_id}');
//                                                    });


                                                    function hello(a) {
                                                        $.get(a,
                                                                function (data, status) {
                                                                });
                                                    }
        </script>
    </body>
</html>
