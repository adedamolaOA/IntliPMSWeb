<%-- 
    Document   : index
    Created on : Jul 19, 2018, 9:52:33 AM
    Author     : Adedamola
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.intlipms.controlmgt.CustomerRoomRateController"%>
<%@page import="com.intlipms.web.entities.CustomerRoomRate"%>
<%@page import="com.intlipms.controlmgt.CustomerController"%>
<%@page import="java.util.List"%>
<%@page import="com.intlipms.web.entities.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String username = "";
    try{
      username = session.getAttribute("username").toString();    
      
    }catch(Exception e){
      response.sendRedirect("index.jsp");   
    }
    List<Customer> customer = new CustomerController().get();
%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>IntiPMS | Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Glance Design Dashboard Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

        <!-- Custom CSS -->
        <link href="css/style.css" rel='stylesheet' type='text/css' />

        <!-- font-awesome icons CSS -->
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <!-- //font-awesome icons CSS-->

        <!-- side nav css file -->
        <link href='css/SidebarNav.min.css' media='all' rel='stylesheet' type='text/css'/>
        <!-- //side nav css file -->

        <!-- js-->
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/modernizr.custom.js"></script>

        <!--webfonts-->
        <link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext" rel="stylesheet">
        <!--//webfonts--> 

        <!-- chart -->
        <script src="js/Chart.js"></script>
        <!-- //chart -->

        <!-- Metis Menu -->
        <script src="js/metisMenu.min.js"></script>
        <script src="js/custom.js"></script>
        <link href="css/custom.css" rel="stylesheet">
        <!--//Metis Menu -->
        <style>
            #chartdiv {
                width: 100%;
                height: 295px;
            }
        </style>
        <!--pie-chart --><!-- index page sales reviews visitors pie chart -->
        <script src="js/pie-chart.js" type="text/javascript"></script>
        <script type="text/javascript">

            $(document).ready(function () {
                $('#demo-pie-1').pieChart({
                    barColor: '#2dde98',
                    trackColor: '#eee',
                    lineCap: 'round',
                    lineWidth: 8,
                    onStep: function (from, to, percent) {
                        $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                    }
                });

                $('#demo-pie-2').pieChart({
                    barColor: '#8e43e7',
                    trackColor: '#eee',
                    lineCap: 'butt',
                    lineWidth: 8,
                    onStep: function (from, to, percent) {
                        $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                    }
                });

                $('#demo-pie-3').pieChart({
                    barColor: '#ffc168',
                    trackColor: '#eee',
                    lineCap: 'square',
                    lineWidth: 8,
                    onStep: function (from, to, percent) {
                        $(this.element).find('.pie-value').text(Math.round(percent) + '%');
                    }
                });


            });

        </script>
        <!-- //pie-chart --><!-- index page sales reviews visitors pie chart -->

        <!-- requried-jsfiles-for owl -->
        <link href="css/owl.carousel.css" rel="stylesheet">
        <script src="js/owl.carousel.js"></script>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({
                    items: 3,
                    lazyLoad: true,
                    autoPlay: true,
                    pagination: true,
                    nav: true,
                });
            });
        </script>
        <!-- //requried-jsfiles-for owl -->
    </head> 
    <body class="cbp-spmenu-push">
        <div class="main-content">
            <div class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-s1">
                <!--left-fixed -navigation-->
                <aside class="sidebar-left">
                    <nav class="navbar navbar-inverse">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".collapse" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <h1><a class="navbar-brand" href="customer.jsp"><span class="fa fa-area-chart"></span> IntiPMS <span class="dashboard_text">Hotel Management</span></a></h1>
                        </div>
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="sidebar-menu">
                                <li class="header">MAIN NAVIGATION</li>
                                <li class="treeview">
                                    <a href="customer.jsp">
                                        <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                                    </a>
                                </li>
                                <li class="treeview">
                                    <a href="#">
                                        <i class="fa fa-laptop"></i>
                                        <span>Customers/Companies</span>
                                        <i class="fa fa-angle-left pull-right"></i>
                                    </a>
                                    <ul class="treeview-menu">
                                        <li><a href="customer.jsp"><i class="fa fa-angle-right"></i> Customers</a></li>
                                        <li><a href="company.jsp"><i class="fa fa-angle-right"></i> Companies</a></li>
                                    </ul>
                                </li>              

                                <li class="treeview">
                                    <a href="maintenance.jsp">
                                        <i class="fa fa-dashboard"></i> <span>Maintenance</span>
                                    </a>
                                </li>
                                <li class="treeview">
                                    <a href="logout.jsp">
                                        <i class="fa fa-sign-out"></i> <span>Sign Out</span>
                                    </a>
                                </li>

                            </ul>
                        </div>
                        <!-- /.navbar-collapse -->
                    </nav>
                </aside>
            </div>
            <!--left-fixed -navigation-->

            <!-- header-starts -->
            <div class="sticky-header header-section ">
                <div class="header-left">
                    <!--toggle button start-->
                    <button id="showLeftPush"><i class="fa fa-bars"></i></button>
                    <!--toggle button end-->
                    <div class="profile_details_left"><!--notifications of menu start -->
                        <ul class="nofitications-dropdown">
                            <li class="dropdown head-dpdn">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-envelope"></i><span class="badge">4</span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="notification_header">
                                            <h3>You have 3 new messages</h3>
                                        </div>
                                    </li>
                                    <li><a href="#">
                                            <div class="user_img"><img src="images/1.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet</p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li class="odd"><a href="#">
                                            <div class="user_img"><img src="images/4.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet </p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li><a href="#">
                                            <div class="user_img"><img src="images/3.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet </p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li><a href="#">
                                            <div class="user_img"><img src="images/2.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet </p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li>
                                        <div class="notification_bottom">
                                            <a href="#">See all messages</a>
                                        </div> 
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown head-dpdn">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-bell"></i><span class="badge blue">4</span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="notification_header">
                                            <h3>You have 3 new notification</h3>
                                        </div>
                                    </li>
                                    <li><a href="#">
                                            <div class="user_img"><img src="images/4.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet</p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li class="odd"><a href="#">
                                            <div class="user_img"><img src="images/1.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet </p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li><a href="#">
                                            <div class="user_img"><img src="images/3.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet </p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li><a href="#">
                                            <div class="user_img"><img src="images/2.jpg" alt=""></div>
                                            <div class="notification_desc">
                                                <p>Lorem ipsum dolor amet </p>
                                                <p><span>1 hour ago</span></p>
                                            </div>
                                            <div class="clearfix"></div>	
                                        </a></li>
                                    <li>
                                        <div class="notification_bottom">
                                            <a href="#">See all notifications</a>
                                        </div> 
                                    </li>
                                </ul>
                            </li>	
                            <li class="dropdown head-dpdn">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-tasks"></i><span class="badge blue1">8</span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="notification_header">
                                            <h3>You have 8 pending task</h3>
                                        </div>
                                    </li>
                                    <li><a href="#">
                                            <div class="task-info">
                                                <span class="task-desc">Database update</span><span class="percentage">40%</span>
                                                <div class="clearfix"></div>	
                                            </div>
                                            <div class="progress progress-striped active">
                                                <div class="bar yellow" style="width:40%;"></div>
                                            </div>
                                        </a></li>
                                    <li><a href="#">
                                            <div class="task-info">
                                                <span class="task-desc">Dashboard done</span><span class="percentage">90%</span>
                                                <div class="clearfix"></div>	
                                            </div>
                                            <div class="progress progress-striped active">
                                                <div class="bar green" style="width:90%;"></div>
                                            </div>
                                        </a></li>
                                    <li><a href="#">
                                            <div class="task-info">
                                                <span class="task-desc">Mobile App</span><span class="percentage">33%</span>
                                                <div class="clearfix"></div>	
                                            </div>
                                            <div class="progress progress-striped active">
                                                <div class="bar red" style="width: 33%;"></div>
                                            </div>
                                        </a></li>
                                    <li><a href="#">
                                            <div class="task-info">
                                                <span class="task-desc">Issues fixed</span><span class="percentage">80%</span>
                                                <div class="clearfix"></div>	
                                            </div>
                                            <div class="progress progress-striped active">
                                                <div class="bar  blue" style="width: 80%;"></div>
                                            </div>
                                        </a></li>
                                    <li>
                                        <div class="notification_bottom">
                                            <a href="#">See all pending tasks</a>
                                        </div> 
                                    </li>
                                </ul>
                            </li>	
                        </ul>
                        <div class="clearfix"> </div>
                    </div>
                    <!--notification menu end -->
                    <div class="clearfix"> </div>
                </div>
                <div class="header-right">




                    <div class="profile_details">		
                        <ul>
                            <li class="dropdown profile_details_drop">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                    <div class="profile_img">	

                                        <div class="user-name">
                                            <p><%=username %></p>
                                            <span>Administrator</span>
                                        </div>
                                        <i class="fa fa-angle-down lnr"></i>
                                        <i class="fa fa-angle-up lnr"></i>
                                        <div class="clearfix"></div>	
                                    </div>	
                                </a>
                                <ul class="dropdown-menu drp-mnu">
                                    <li> <a href="#"><i class="fa fa-cog"></i> Settings</a> </li> 
                                    <li> <a href="#"><i class="fa fa-user"></i> My Account</a> </li> 
                                    <li> <a href="#"><i class="fa fa-suitcase"></i> Profile</a> </li> 
                                    <li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <div class="clearfix"> </div>				
                </div>
                <div class="clearfix"> </div>	
            </div>
            <!-- //header-ends -->
            <!-- main content start-->
            <div id="page-wrapper">
                <h1>Customers</h1>
                <div class="bs-example widget-shadow" data-example-id="bordered-table"> 

                    <div style="float: right; padding-right: 5px;padding-bottom: 5px;padding-top: 5px;">

                    </div>
                    <table class="table table-bordered"> 
                        <thead>
                            <tr>

                                <th>#</th>

                                <th>Hotel ID</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Other Names</th>

                                <th>VIP Status</th>
                                <th>Primary Phone Number</th>

                                <th>Secondary Phone Number</th>
                                <th>Email</th>
                                <th>Address</th>
                                <th>City</th>
                                <th>State</th>

                                <th>Religion</th>
                                <th>Max Credit</th>
                                
                                <th>Date Updated</th>
                                <th>Updated By</th>
                                <th></th>
                                <th></th>


                            </tr> 
                        </thead> 
                        <tbody> 
                            <%
                                for (int i = 0; i < customer.size(); i++) {

                                    Customer c = customer.get(i);
                            %>
                            <tr> 

                                <th scope="row"><%=(i + 1)%></th> 

                                <td><%=c.getHotelId()%></td> 
                                <td><%=c.getCustfirstName()%></td> 
                                <td><%=c.getCustlastname()%></td> 
                                <td><%=c.getCustothername()%></td> 

                                <td><%=c.getVIPstatusid()%></td> 
                                <td><%=c.getCustphone1()%></td> 

                                <td><%=c.getCustphone2()%></td> 
                                <td><%=c.getCustemail()%></td> 
                                <td><%=c.getCustaddress()%></td> 
                                <td><%=c.getCustcity()%></td> 
                                <td><%=c.getCuststate()%></td> 

                                <td><%=c.getCustreligion()%></td> 

                                <td><%=c.getMaxCredit()%></td> 
                                <td><%=c.getDateUpdated() %></td> 
                                <td><%=c.getUpdatedBy() %></td> 
                                <td><button type="button" class="btn btn-info" data-toggle="modal" data-target="#exampleModal<%=(i + 1)%>" data-whatever="@mdo">View/Billings</button></td>
                        <div class="modal fade" id="exampleModal<%=(i + 1)%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="exampleModalLabel">View/Billings</h4>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            <div class="form-group">
                                                <label for="recipient-name" class="control-label">First Name</label></br>
                                                <label id="recipient-name" class="control-label"><%=c.getCustfirstName()%></label>
                                            </div>
                                            <div class="form-group">
                                                <label for="message-text" class="control-label">Last Name</label></br>
                                                <label id="message-text" class="control-label"><%=c.getCustlastname()%></label>
                                            </div>
                                            <div class="form-group">
                                                <label for="message-text" class="control-label">Last Name</label></br>
                                                <label id="message-text" class="control-label"><%=c.getCustlastname()%></label>
                                            </div>
                                            <div class="form-group">
                                                <label for="message-text" class="control-label">Other Names</label></br>
                                                <label id="message-text" class="control-label"><%=c.getCustothername()%></label>
                                            </div>
                                            <div class="form-group">
                                                <label for="message-text" class="control-label">Primary Phone Number</label></br>
                                                <label id="message-text" class="control-label"><%=c.getCustphone1()%></label>
                                            </div>
                                            <div class="form-group">
                                                <label for="message-text" class="control-label">Secondary Phone Number</label></br>
                                                <label id="message-text" class="control-label"><%=c.getCustphone2()%></label>
                                            </div>

                                            <div class="form-group">
                                                <label for="message-text" class="control-label">Max Credit</label></br>
                                                <label id="message-text" class="control-label"><%=c.getMaxCredit()%></label>
                                            </div>

                                            <div class="form-group" style="border-top: 1px solid #e5e5e5;border-bottom: 1px solid #e5e5e5;">
                                                <label for="message-text" class="control-label" style="width: 20%">Room Rate</label>
                                                <label id="message-text" class="control-label" style="width: 25%">Guest Room Rate</label>
                                                <label for="message-text" class="control-label" style="width: 20%">Start Date</label>
                                                <label id="message-text" class="control-label" style="width: 20%">End Date</label>

                                            </div>
                                            <%
                                                List<CustomerRoomRate> roomRateList1 = new CustomerRoomRateController().get(c.getCustomerid().toString());
                                                for (int k = 0; k < roomRateList1.size(); k++) {
                                                    CustomerRoomRate roomRate = roomRateList1.get(k);

                                            %>
                                            <div class="form-group">

                                                <label for="message-text" class="control-label" style="width: 20%;padding-left: 3px;">₦ <%=roomRate.getRoomrate()%></label>
                                                <label id="message-text" class="control-label" style="width: 20%;margin-right: 30px">₦ <%=roomRate.getRoomrateguest()%></label>
                                                <label for="message-text" class="control-label" style="width: 20%;"><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(roomRate.getStartdate())%></label>
                                                <label id="message-text" class="control-label" style="width: 20%"><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(roomRate.getEnddate())%></label>

                                            </div>

                                            <%}%>


                                        </form>
                                    </div>

                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                         <td><button type="button" class="btn btn-success" data-toggle="modal" data-target="#roomrate<%=(i + 1)%>" data-whatever="@mdo">Room Rates</button></td>
                        <div class="modal fade" id="roomrate<%=(i + 1)%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                        <h4 class="modal-title" id="exampleModalLabel">Room Rate for <%=c.getCustfirstName() +" "+c.getCustlastname()+" "+c.getCustothername() %></h4>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            
                                            <div class="form-group" style="border-top: 1px solid #e5e5e5;border-bottom: 1px solid #e5e5e5;">
                                                <label for="message-text" class="control-label" style="width: 20%">Room Rate</label>
                                                <label id="message-text" class="control-label" style="width: 25%">Guest Room Rate</label>
                                                <label for="message-text" class="control-label" style="width: 20%">Start Date</label>
                                                <label id="message-text" class="control-label" style="width: 20%">End Date</label>

                                            </div>
                                            <%
                                                List<CustomerRoomRate> roomRateList = new CustomerRoomRateController().get(c.getCustomerid().toString());
                                                for (int k = 0; k < roomRateList.size(); k++) {
                                                    CustomerRoomRate roomRate = roomRateList.get(k);

                                            %>
                                            <div class="form-group">

                                                <label for="message-text" class="control-label" style="width: 20%;padding-left: 3px;">₦ <%=roomRate.getRoomrate()%></label>
                                                <label id="message-text" class="control-label" style="width: 20%;margin-right: 30px">₦ <%=roomRate.getRoomrateguest()%></label>
                                                <label for="message-text" class="control-label" style="width: 20%;"><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(roomRate.getStartdate())%></label>
                                                <label id="message-text" class="control-label" style="width: 20%"><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(roomRate.getEnddate())%></label>

                                            </div>

                                            <%}%>


                                        </form>
                                    </div>

                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                        </tr> 
                        <%}%>
                        </tbody> 
                    </table>
                </div>
            </div>
            <!--footer-->
            <div class="footer">
                <p>&copy; 2018 Gistme Communications. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">w3layouts</a></p>		
            </div>
            <!--//footer-->
        </div>

        <!-- new added graphs chart js-->

        <script src="js/Chart.bundle.js"></script>
        <script src="js/utils.js"></script>

        <script>
            var MONTHS = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
            var color = Chart.helpers.color;
            var barChartData = {
                labels: ["January", "February", "March", "April", "May", "June", "July"],
                datasets: [{
                        label: 'Dataset 1',
                        backgroundColor: color(window.chartColors.red).alpha(0.5).rgbString(),
                        borderColor: window.chartColors.red,
                        borderWidth: 1,
                        data: [
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor()
                        ]
                    }, {
                        label: 'Dataset 2',
                        backgroundColor: color(window.chartColors.blue).alpha(0.5).rgbString(),
                        borderColor: window.chartColors.blue,
                        borderWidth: 1,
                        data: [
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor(),
                            randomScalingFactor()
                        ]
                    }]

            };

            window.onload = function () {
                var ctx = document.getElementById("canvas").getContext("2d");
                window.myBar = new Chart(ctx, {
                    type: 'bar',
                    data: barChartData,
                    options: {
                        responsive: true,
                        legend: {
                            position: 'top',
                        },
                        title: {
                            display: true,
                            text: 'Chart.js Bar Chart'
                        }
                    }
                });

            };

            document.getElementById('randomizeData').addEventListener('click', function () {
                var zero = Math.random() < 0.2 ? true : false;
                barChartData.datasets.forEach(function (dataset) {
                    dataset.data = dataset.data.map(function () {
                        return zero ? 0.0 : randomScalingFactor();
                    });

                });
                window.myBar.update();
            });

            var colorNames = Object.keys(window.chartColors);
            document.getElementById('addDataset').addEventListener('click', function () {
                var colorName = colorNames[barChartData.datasets.length % colorNames.length];
                ;
                var dsColor = window.chartColors[colorName];
                var newDataset = {
                    label: 'Dataset ' + barChartData.datasets.length,
                    backgroundColor: color(dsColor).alpha(0.5).rgbString(),
                    borderColor: dsColor,
                    borderWidth: 1,
                    data: []
                };

                for (var index = 0; index < barChartData.labels.length; ++index) {
                    newDataset.data.push(randomScalingFactor());
                }

                barChartData.datasets.push(newDataset);
                window.myBar.update();
            });

            document.getElementById('addData').addEventListener('click', function () {
                if (barChartData.datasets.length > 0) {
                    var month = MONTHS[barChartData.labels.length % MONTHS.length];
                    barChartData.labels.push(month);

                    for (var index = 0; index < barChartData.datasets.length; ++index) {
                        //window.myBar.addData(randomScalingFactor(), index);
                        barChartData.datasets[index].data.push(randomScalingFactor());
                    }

                    window.myBar.update();
                }
            });

            document.getElementById('removeDataset').addEventListener('click', function () {
                barChartData.datasets.splice(0, 1);
                window.myBar.update();
            });

            document.getElementById('removeData').addEventListener('click', function () {
                barChartData.labels.splice(-1, 1); // remove the label first

                barChartData.datasets.forEach(function (dataset, datasetIndex) {
                    dataset.data.pop();
                });

                window.myBar.update();
            });
        </script>
        <!-- new added graphs chart js-->

        <!-- Classie --><!-- for toggle left push menu script -->
        <script src="js/classie.js"></script>
        <script>
            var menuLeft = document.getElementById('cbp-spmenu-s1'),
                    showLeftPush = document.getElementById('showLeftPush'),
                    body = document.body;

            showLeftPush.onclick = function () {
                classie.toggle(this, 'active');
                classie.toggle(body, 'cbp-spmenu-push-toright');
                classie.toggle(menuLeft, 'cbp-spmenu-open');
                disableOther('showLeftPush');
            };


            function disableOther(button) {
                if (button !== 'showLeftPush') {
                    classie.toggle(showLeftPush, 'disabled');
                }
            }
        </script>
        <!-- //Classie --><!-- //for toggle left push menu script -->

        <!--scrolling js-->
        <script src="js/jquery.nicescroll.js"></script>
        <script src="js/scripts.js"></script>
        <!--//scrolling js-->

        <!-- side nav js -->
        <script src='js/SidebarNav.min.js' type='text/javascript'></script>
        <script>
            $('.sidebar-menu').SidebarNav()
        </script>
        <!-- //side nav js -->

        <!-- for index page weekly sales java script -->
        <script src="js/SimpleChart.js"></script>
        <script>
            var graphdata1 = {
                linecolor: "#CCA300",
                title: "Monday",
                values: [
                    {X: "6:00", Y: 10.00},
                    {X: "7:00", Y: 20.00},
                    {X: "8:00", Y: 40.00},
                    {X: "9:00", Y: 34.00},
                    {X: "10:00", Y: 40.25},
                    {X: "11:00", Y: 28.56},
                    {X: "12:00", Y: 18.57},
                    {X: "13:00", Y: 34.00},
                    {X: "14:00", Y: 40.89},
                    {X: "15:00", Y: 12.57},
                    {X: "16:00", Y: 28.24},
                    {X: "17:00", Y: 18.00},
                    {X: "18:00", Y: 34.24},
                    {X: "19:00", Y: 40.58},
                    {X: "20:00", Y: 12.54},
                    {X: "21:00", Y: 28.00},
                    {X: "22:00", Y: 18.00},
                    {X: "23:00", Y: 34.89},
                    {X: "0:00", Y: 40.26},
                    {X: "1:00", Y: 28.89},
                    {X: "2:00", Y: 18.87},
                    {X: "3:00", Y: 34.00},
                    {X: "4:00", Y: 40.00}
                ]
            };
            var graphdata2 = {
                linecolor: "#00CC66",
                title: "Tuesday",
                values: [
                    {X: "6:00", Y: 100.00},
                    {X: "7:00", Y: 120.00},
                    {X: "8:00", Y: 140.00},
                    {X: "9:00", Y: 134.00},
                    {X: "10:00", Y: 140.25},
                    {X: "11:00", Y: 128.56},
                    {X: "12:00", Y: 118.57},
                    {X: "13:00", Y: 134.00},
                    {X: "14:00", Y: 140.89},
                    {X: "15:00", Y: 112.57},
                    {X: "16:00", Y: 128.24},
                    {X: "17:00", Y: 118.00},
                    {X: "18:00", Y: 134.24},
                    {X: "19:00", Y: 140.58},
                    {X: "20:00", Y: 112.54},
                    {X: "21:00", Y: 128.00},
                    {X: "22:00", Y: 118.00},
                    {X: "23:00", Y: 134.89},
                    {X: "0:00", Y: 140.26},
                    {X: "1:00", Y: 128.89},
                    {X: "2:00", Y: 118.87},
                    {X: "3:00", Y: 134.00},
                    {X: "4:00", Y: 180.00}
                ]
            };
            var graphdata3 = {
                linecolor: "#FF99CC",
                title: "Wednesday",
                values: [
                    {X: "6:00", Y: 230.00},
                    {X: "7:00", Y: 210.00},
                    {X: "8:00", Y: 214.00},
                    {X: "9:00", Y: 234.00},
                    {X: "10:00", Y: 247.25},
                    {X: "11:00", Y: 218.56},
                    {X: "12:00", Y: 268.57},
                    {X: "13:00", Y: 274.00},
                    {X: "14:00", Y: 280.89},
                    {X: "15:00", Y: 242.57},
                    {X: "16:00", Y: 298.24},
                    {X: "17:00", Y: 208.00},
                    {X: "18:00", Y: 214.24},
                    {X: "19:00", Y: 214.58},
                    {X: "20:00", Y: 211.54},
                    {X: "21:00", Y: 248.00},
                    {X: "22:00", Y: 258.00},
                    {X: "23:00", Y: 234.89},
                    {X: "0:00", Y: 210.26},
                    {X: "1:00", Y: 248.89},
                    {X: "2:00", Y: 238.87},
                    {X: "3:00", Y: 264.00},
                    {X: "4:00", Y: 270.00}
                ]
            };
            var graphdata4 = {
                linecolor: "Random",
                title: "Thursday",
                values: [
                    {X: "6:00", Y: 300.00},
                    {X: "7:00", Y: 410.98},
                    {X: "8:00", Y: 310.00},
                    {X: "9:00", Y: 314.00},
                    {X: "10:00", Y: 310.25},
                    {X: "11:00", Y: 318.56},
                    {X: "12:00", Y: 318.57},
                    {X: "13:00", Y: 314.00},
                    {X: "14:00", Y: 310.89},
                    {X: "15:00", Y: 512.57},
                    {X: "16:00", Y: 318.24},
                    {X: "17:00", Y: 318.00},
                    {X: "18:00", Y: 314.24},
                    {X: "19:00", Y: 310.58},
                    {X: "20:00", Y: 312.54},
                    {X: "21:00", Y: 318.00},
                    {X: "22:00", Y: 318.00},
                    {X: "23:00", Y: 314.89},
                    {X: "0:00", Y: 310.26},
                    {X: "1:00", Y: 318.89},
                    {X: "2:00", Y: 518.87},
                    {X: "3:00", Y: 314.00},
                    {X: "4:00", Y: 310.00}
                ]
            };
            var Piedata = {
                linecolor: "Random",
                title: "Profit",
                values: [
                    {X: "Monday", Y: 50.00},
                    {X: "Tuesday", Y: 110.98},
                    {X: "Wednesday", Y: 70.00},
                    {X: "Thursday", Y: 204.00},
                    {X: "Friday", Y: 80.25},
                    {X: "Saturday", Y: 38.56},
                    {X: "Sunday", Y: 98.57}
                ]
            };
            $(function () {
                $("#Bargraph").SimpleChart({
                    ChartType: "Bar",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    data: [graphdata4, graphdata3, graphdata2, graphdata1],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });
                $("#sltchartype").on('change', function () {
                    $("#Bargraph").SimpleChart('ChartType', $(this).val());
                    $("#Bargraph").SimpleChart('reload', 'true');
                });
                $("#Hybridgraph").SimpleChart({
                    ChartType: "Hybrid",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    data: [graphdata4],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });
                $("#Linegraph").SimpleChart({
                    ChartType: "Line",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: false,
                    data: [graphdata4, graphdata3, graphdata2, graphdata1],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });
                $("#Areagraph").SimpleChart({
                    ChartType: "Area",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    data: [graphdata4, graphdata3, graphdata2, graphdata1],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });
                $("#Scatterredgraph").SimpleChart({
                    ChartType: "Scattered",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    data: [graphdata4, graphdata3, graphdata2, graphdata1],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });
                $("#Piegraph").SimpleChart({
                    ChartType: "Pie",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    showpielables: true,
                    data: [Piedata],
                    legendsize: "250",
                    legendposition: 'right',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });

                $("#Stackedbargraph").SimpleChart({
                    ChartType: "Stacked",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    data: [graphdata3, graphdata2, graphdata1],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });

                $("#StackedHybridbargraph").SimpleChart({
                    ChartType: "StackedHybrid",
                    toolwidth: "50",
                    toolheight: "25",
                    axiscolor: "#E6E6E6",
                    textcolor: "#6E6E6E",
                    showlegends: true,
                    data: [graphdata3, graphdata2, graphdata1],
                    legendsize: "140",
                    legendposition: 'bottom',
                    xaxislabel: 'Hours',
                    title: 'Weekly Profit',
                    yaxislabel: 'Profit in $'
                });
            });

        </script>
        <!-- //for index page weekly sales java script -->


        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.js"></script>
        <!-- //Bootstrap Core JavaScript -->

    </body>
</html>