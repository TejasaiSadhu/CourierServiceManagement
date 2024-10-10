<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.klef.ep.models.*"  %>
<%
int ordid = (int) request.getAttribute("ordid");
String ordstatus = (String)request.getAttribute("ordstatus");
Double ordamount = (Double)request.getAttribute("ordamount");
String from =(String) request.getAttribute("ordfromplace");
String to =(String) request.getAttribute("ordtoplace");
String date =(String) request.getAttribute("orddate");
String atplace =(String) request.getAttribute("ordatplace");
String updatedon =(String) request.getAttribute("ordupdatedon");




%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'></link>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"></link>
	
	<link rel="stylesheet" href="navbarcss/style.css"></link>
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" ></link>


<title>View Your Order</title>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" ></script>

<center>
<h3>View your Order Details</h3>
<table border="2px solid red" class="table table-light table-hover">
<tr><th>OrderID</th>
<th>Order From</th>
<th>Order To</th>
<th>Order Date</th>
</tr>
<th>
<tr>
<td widt> <%=ordid %> </td>
<td> <%=from %> </td>
<td> <%=to %> </td>
<td> <%=date %> </td>
</tr>


</table>

<table border="2px solid red" class="table table-light table-hover">
<tr><th>Status</th>
<th>Order At</th>
<th>Last Updated On</th>

</tr>
<th>
<tr>
<td > <%=ordstatus %> </td>
<td> <%=atplace %> </td>
<td> <%=updatedon %> </td>
</tr>


</table>
	
</center>
</body>
</html>