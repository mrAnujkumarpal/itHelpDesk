
<html>
    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link type="text/css" rel="stylesheet" href="/css/materialize.min.css"  media="screen,projection"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/materialize/0.98.2/js/materialize.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="/assets/main.css" rel="stylesheet" type="text/css"/>
        <script src="/assets/main.js" type="text/javascript"></script>
        <style>
            .profile-card-i {
                position: relative;
                top: 6px;
                margin-right: 10px;
            }
            .card .card-content {
                padding: 14px;
                border-radius: 0 0 2px 2px;
            }
            .card .card-content .card-title {
                margin-top: 0px;   
            }
        </style>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('select');
                var instances = M.FormSelect.init(elems, options);
            });

            $(document).ready(function () {
                $('input#input_text, textarea#textarea2').characterCounter();
            });

            $(document).ready(function () {
                $('select').formSelect();
            });

        </script>

    </head>

    <body>
        <nav class="navbar navbar-default no-margin" style="background-color:#fff;box-shadow: 0 6px 20px 0 #aed581;">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header fixed-brand">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" id="menu-toggle">
                    <span class="glyphicon glyphicon-th-large" aria-hidden="true">
                        <i class="fa fa-bars"></i>
                    </span>
                </button>
                <a class="navbar-brand" href="#"></a>
                <a href="#" class="brand-logo center">
                    <img class="responsive-img" style="max-height:220px;min-height:200px; margin-top:-80px;"  src="https://rtcamp.com/wp-content/uploads/2015/06/rtHelpdesk-logo.png"/>

                </a>

            </div>
            <!-- navbar-header-->

            <!--        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li class="active">
                                <button class="navbar-toggle collapse in" data-toggle="collapse" id="menu-toggle-2">
                                    <span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>
                                </button>
                            </li>
                        </ul>
                    </div>-->
            <!-- bs-example-navbar-collapse-1 -->
        </nav>
        <div id="wrapper">
            <!-- Sidebar -->
            <div id="sidebar-wrapper">
                <ul class="sidebar-nav nav-pills nav-stacked" id="menu">
                    <li class="active">
                        <a href="/default">
                            <span class="fa-stack fa-lg pull-left"><i class="fa fa-dashboard fa-stack-1x "></i></span> Dashboard
                        </a>                       
                    </li>
                    <li>
                        <a href="#">
                            <span class="fa-stack fa-lg pull-left"><i class="fa fa-smile-o fa-stack-1x "></i></span> Account
                        </a>
                        <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                            <li><a href="#">My Profile</a></li>
                            <li><a href="#">Logout</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>Ticket</a>
                        <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                            <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>Create Ticket </a></li>
                            <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>Ticket List</a></li>
                        </ul>
                    </li>
                    <li>
                        <a  href="/getProject"><span class="fa-stack fa-lg pull-left"><i class="fa fa-cloud-download fa-stack-1x "></i></span>Projects</a>
                    </li>
                    <li>
                        <a href="#"> <span class="fa-stack fa-lg pull-left"><i class="fa fa-cart-plus fa-stack-1x "></i></span>Events</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-youtube-play fa-stack-1x "></i></span>About</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-wrench fa-stack-1x "></i></span>Services</a>
                    </li>
                    <li>
                        <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-server fa-stack-1x "></i></span>Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /#sidebar-wrapper -->
            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="input-field col s12 m6 l8">
                            <h5 class="grey-text"><i class="Small material-icons profile-card-i">format_list_bulleted</i>Your Project List </h5>
                        </div>
                        <div class="input-field col s12 m6 l4 right-align">
                            <button data-target="projectModelWindow" id="AddNewBtn" class="btn modal-trigger addNewProjectBtn">Add New Project</button>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col s12 m6 l4">
                            <!-- Recent Buyers -->
                            <div class="card">
                                <div class="card-content">
                                    <h4 class="card-title mb-0">XM Software Solutions Pvt Ltd </h4>
                                    <p class="medium-small pt-2">Guindy, Chennai, Tamil Nadu 600032</p>
                                    <ul class="collection mb-0">
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-7.png" alt="" class="circle" />
                                            <p class="font-weight-600">John Doe</p>
                                            <p class="medium-small">18, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-3.png" alt="" class="circle" />
                                            <p class="font-weight-600">Adam Garza</p>
                                            <p class="medium-small">20, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-5.png" alt="" class="circle" />
                                            <p class="font-weight-600">Jennifer Rice</p>
                                            <p class="medium-small">25, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="col s12 m6 l4">
                            <!-- Recent Buyers -->
                            <div class="card recent-buyers-card animate fadeUp">
                                <div class="card-content">
                                    <h4 class="card-title mb-0">barclaycard  solutions gurgaon</h4>
                                    <p class="medium-small pt-2">: E-1, E Block, Sector 63, Noida, Uttar Pradesh 201301</p>
                                    <ul class="collection mb-0">
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-7.png" alt="" class="circle" />
                                            <p class="font-weight-600">John Doe</p>
                                            <p class="medium-small">18, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-3.png" alt="" class="circle" />
                                            <p class="font-weight-600">Adam Garza</p>
                                            <p class="medium-small">20, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-5.png" alt="" class="circle" />
                                            <p class="font-weight-600">Jennifer Rice</p>
                                            <p class="medium-small">25, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="col s12 m6 l4">
                            <!-- Recent Buyers -->
                            <div class="card recent-buyers-card animate fadeUp">
                                <div class="card-content">
                                    <h4 class="card-title mb-0">The Royal Bank of Scotland</h4>
                                    <p class="medium-small pt-2"> Mehrauli Gurgaon Road, Gurugram, Haryana </p>
                                    <ul class="collection mb-0">
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-7.png" alt="" class="circle" />
                                            <p class="font-weight-600">John Doe</p>
                                            <p class="medium-small">18, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-3.png" alt="" class="circle" />
                                            <p class="font-weight-600">Adam Garza</p>
                                            <p class="medium-small">20, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                        <li class="collection-item avatar">
                                            <img src="https://pixinvent.com/materialize-material-design-admin-template/app-assets/images/avatar/avatar-5.png" alt="" class="circle" />
                                            <p class="font-weight-600">Jennifer Rice</p>
                                            <p class="medium-small">25, January 2019</p>
                                            <a href="#!" class="secondary-content"><i class="material-icons">star_border</i></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>



                    <!-- /#page-content-wrapper -->
                </div>
                <!-- /#wrapper -->
                <!-- jQuery -->
            </div>
        </div>

    </body>
    <script>
        $("#menu-toggle").click(function (e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled");
        });
        $("#menu-toggle-2").click(function (e) {
            e.preventDefault();
            $("#wrapper").toggleClass("toggled-2");
            $('#menu ul').hide();
        });

        function initMenu() {
            $('#menu ul').hide();
            $('#menu ul').children('.current').parent().show();
            //$('#menu ul:first').show();
            $('#menu li a').click(
                    function () {
                        var checkElement = $(this).next();
                        if ((checkElement.is('ul')) && (checkElement.is(':visible'))) {
                            return false;
                        }
                        if ((checkElement.is('ul')) && (!checkElement.is(':visible'))) {
                            $('#menu ul:visible').slideUp('normal');
                            checkElement.slideDown('normal');
                            return false;
                        }
                    }
            );
        }
        $(document).ready(function () {
            initMenu();
        });
        /*
         var calculatecontsize = $("#page-content-wrapper").height();
         $('#sidebar-wrapper').css({"height": calculatecontsize + "px"});
         */
    </script>
</html>