<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tracking Orders</title>
 
    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all"></link>
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all"></link>
 
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet"></link>

    
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all"></link>
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all"></link>

    <link href="css/main.css" rel="stylesheet" media="all"></link>
    
	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'></link>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></link>
	
	<link rel="stylesheet" href="navbarcss/style.css"></link>
	 <link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/img/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/img/favicons/favicon-16x16.png">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicons/favicon.ico">
    <link rel="manifest" href="assets/img/favicons/manifest.json">
    <meta name="msapplication-TileImage" content="assets/img/favicons/mstile-150x150.png">
    <meta name="theme-color" content="#ffffff">
    <link href="assets/css/theme.css" rel="stylesheet" />
	
</head>
<body>

   <div class="page-wrapper ">
   <nav class="navbar navbar-expand-lg navbar-light fixed-top py-3 d-block" data-navbar-on-scroll="data-navbar-on-scroll">
        <div class="container"><a class="navbar-brand" href="index.html"><img src="assets/img/icons/logo.png" height="100"  alt="logo" /></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"> </span></button>
          <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
              <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="home.jsp">Home</a></li>
              <li class="nav-item px-2"><a class="nav-link" href="customerTrackingOrderPage.jsp">Tracking</a></li>
              <li class="nav-item px-2"><a class="nav-link" href="#">Services</a></li>
            </ul>
            <a class="btn btn-primary order-1 order-lg-0 ms-lg-3" href="BranchOperatorLogin.jsp">Login</a>
            
          </div>
        </div>
      </nav><br></br><br>
        <div class="wrapper wrapper--w790"><br></br>
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Tracker Order</h2>
                </div>
                
                
                <form method="post" action="tracking"> 
                <div class="form-row m-b-55">
                            <div class="name">Provide Order ID &nbsp;&nbsp;&nbsp;&nbsp;</div>
                            <div class="value">
                                <div class="row row-refine">
                                    <div class="col-4">
                                        <div class="input-group-desc">
                                        
                                        
                                        
                                             <input type="text" name="oid" required class="input--style-5"><br>
											
                                            <label class="label--desc">OrderID</label>
                                             
                                        
                                        
                                           
                                        </div>
                                        
                                    </div>
                                    
                                </div>
                                
                            </div>
                            
                        </div>
                        <input type="submit" value="Get Details" class="btn btn--radius-2 btn--green">
                       </form>
       
                    
                    <br/>
    
    <br/>
                </div>
            </div>
        </div>
         
   



</body>
</html>