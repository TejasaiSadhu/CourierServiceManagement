package com.klef.ep.services;

import java.io.*;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Orders;

@WebServlet("/tracking")
public class TrackingServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/CourierWebService/OrderServiceImpl!com.klef.ep.services.OrderService")
	OrderService orderService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      int oid=Integer.parseInt(request.getParameter("oid"));
      
      List<Orders> ordlist = orderService.trackOrder(oid);
      Orders o;

      
      for (Orders ord : ordlist)
      {
    	  request.setAttribute("ordid", ord.getOrderid());
    	  request.setAttribute("ordstatus",ord.getStatus());
    	  request.setAttribute("ordamount",ord.getAmount());
    	  request.setAttribute("ordfromplace", ord.getOrderfromplace());
    	  request.setAttribute("ordtoplace", ord.getOrdertoplace());
    	  request.setAttribute("orddate", ord.getOrderdate());
    	  request.setAttribute("ordatplace", ord.getOrderatplace());
    	  request.setAttribute("ordupdatedon", ord.getOrderupdatedon());


      }
     
      RequestDispatcher rd = request.getRequestDispatcher("orderstatusviewer.jsp");
      rd.include(request, response);

  }
}