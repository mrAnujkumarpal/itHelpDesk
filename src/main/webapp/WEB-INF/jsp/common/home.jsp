
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
                        <a href="/getProject"><span class="fa-stack fa-lg pull-left"><i class="fa fa-cloud-download fa-stack-1x "></i></span>Projects</a>
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

                        <div class="col s12">
                            <h5 class="grey-text"><i class="Small material-icons profile-card-i">add_circle_outline</i>Create New Ticket</h5>
                        </div>


                        <div class="col s12 m12    z-depth-4 card-panel">


                            <form  method="post" action="/addNewVendor">
                                <div class="row">
                                    <div class="input-field col s10 offset-s1">
                                        <c:if test="${success ne null}">
                                            <c:if test="${success eq  'true'}">
                                                <div class="sucess text-center ">${message} </div>
                                            </c:if>
                                            <c:if test="${success eq  'false'}">
                                                <div class="error alert-info text-center ">${message} </div>
                                            </c:if>
                                        </c:if>
                                    </div>
                                    <div class="row">
                                        <div class="col s12">
                                            <c:choose>
                                                <c:when test="${mode eq 'Edit'}">
                                                    <input  name="vendor_Id" class="hide" type="number" value="${vendor.vendor_Id}">
                                                </c:when>
                                                <c:otherwise>
                                                    <input  name="vendor_Id" class="hide" type="number" value="0">
                                                </c:otherwise>
                                            </c:choose>
                                        </div>

                                        <div class="row">
                                            <div class="col s6">

                                                <select class="browser-default">
                                                    <option value="" disabled selected>Choose your option</option>                                                    
                                                    <option value="2">Admin Help-desk</option>
                                                    <option value="3">Courier Request</option>
                                                    <option value="1">IT Help-desk </option>
                                                </select>
                                            </div>  

                                            <div class="col s6">

                                                <select class="browser-default">
                                                    <option value="" disabled selected>Choose request type</option>
                                                    <option value="1">Hardware request</option>
                                                    <option value="2">software request</option>
                                                    <option value="3">With-in office</option>
                                                    <option value="4">outside office</option>
                                                    <option value="5">With-in city</option>
                                                    <option value="6">outside city</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col s12">

                                            <select class="browser-default">
                                                <option value="" disabled selected>Choose your project</option>
                                                <option value="1">Uae-ex Project</option>
                                                <option value="2">Unimoni project</option>
                                                <option value="3">Yes Bank</option>
                                            </select>
                                        </div>

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <textarea id="textarea1" class="materialize-textarea" data-length="120"></textarea>
                                                <label for="textarea1">Discription</label>
                                            </div>
                                        </div>

                                        <div class="input-field col s12">
                                            <button href="#" class="btn  btn-large waves-effect waves-light col s12">
                                                Create New Ticket
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>


                    </div>

                </div>

                <!-- /#page-content-wrapper -->
            </div>
            <!-- /#wrapper -->
            <!-- jQuery -->
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