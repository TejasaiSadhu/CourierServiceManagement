<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Future RedHats</title>
</head>
<body>
<h3 align=center><u>BranchOperator Registration</u></h3>

 <a href="AdminHome.jsf">Admin Home</a>
   <a href="AddBranch.jsf">Add Branch</a><br></br>
    <a href="AddRoute.jsf">Add Route</a><br></br>
    <a href="ViewAllBranches.jsf">View All branches</a><br></br>
    <a href="ViewAllBranchOperators.jsf">View all Branch Operator</a><br></br>
<center>
<form method="post" action="branchoperatorreg">
Username <input type="text" name="bopid" required><br>
Password <input type="password" name="boppwd" required><br>

<input type="submit" value="Register">
 </form>
</center>
</body>
</html>