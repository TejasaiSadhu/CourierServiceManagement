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
	
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container-fluid">
	    
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="fa fa-bars"></span> Menu
	      </button>
	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav m-auto">
	        	<li class="nav-item active"><a href="/CourierWebService/BranchOperatorHome.jsf" class="nav-link">Home</a></li>
	        	<li class="nav-item dropdown">
              
	        	<li class="nav-item"><a href="/CourierWebService/placeorder.jsf" class="nav-link">Place an order</a></li>
	        	<li class="nav-item"><a href="/CourierWebService/vieworders.jsf" class="nav-link">View All Orders</a></li>
	        	<li class="nav-item"><a href="/CourierWebService/UpdateOrder.jsf" class="nav-link">Update Order</a></li>
	          
	           <li class="nav-item"><a href="/CourierWebService/DeleteOrder.jsf" class="nav-link">Delete Order</a></li>
	            <li class="nav-item"><a href="/CourierWebService/faces/ordertracking.jsp" class="nav-link">Track Order</a></li>
	             <li class="nav-item"><a href="/CourierWebService/faces/BranchOperatorLogin.jsp" class="nav-link">Log out</a></li></li>
	        </ul>
	      </div>
	    </div>
	  </nav>
	 




 
   <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Tracker Order</h2>
                </div>
                
                
                <form method="post" action="tracking"> 
                <div class="form-row m-b-55">
                            <div class="name">Provide Order ID &nbsp;&nbsp;&nbsp;&nbsp;</div>
                            <div class="value">
                                <div class="row row-refine">
                                    <div class="col-3">
                                        <div class="input-group-desc">
                                        
                                        
                                        
                                             <input   class="input--style-5"  type="text" name="oid" required><br>
											
                                            <label class="label--desc">OrderID</label>
                                             
                                        
                                        
                                           
                                        </div>
                                        
                                    </div>
                                    
                                </div>
                                
                            </div>
                            
                        </div>
                        <input  class="btn btn--radius-2 btn--green"   type="submit" value="Get Details">
                       </form>
       
                    
                    <br/>
    
    <br/>
                </div>
            </div>
        </div>
         
   



</body>
</html>