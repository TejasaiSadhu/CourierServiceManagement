<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" href="styl.css"></link>
    <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<h3 align=center><u>Admin Login</u></h3>
<center>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-8 col-lg-6 col-xl-5">
          <div class="card bg-dark text-white" style="border-radius: 1rem;">
            <div class="card-body p-5 text-center">
  
              <div class="mb-md-5 mt-md-4 pb-5">
  <form method="post" action="checkadmin">
                <h2 class="fw-bold mb-2 text-uppercase">Login</h2>
                <p class="text-white-50 mb-5">Please enter your login and password!</p>
  
                <div class="form-outline form-white mb-4"> 
                <input type="text" name="uname" required class="form-control form-control-lg"><br>
                  
                  <label class="form-label" for="typeEmailX">UserName</label>
                </div>
  
                <div class="form-outline form-white mb-4">
                 <input type="password" name="pwd" required class="form-control form-control-lg"><br>
                
                  
                  <label class="form-label" for="typePasswordX">Password</label>
                </div>
  <input type="submit" value="Login" class="btn btn-outline-light btn-lg px-5">
</form>
  
                <!-- <div class="d-flex justify-content-center text-center mt-4 pt-1">
                  <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                  <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                  <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
                </div>
   -->
              </div>
  
             
  
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>


</center>
</body>
</html>