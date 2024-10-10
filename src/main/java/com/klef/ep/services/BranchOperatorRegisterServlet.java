package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.BranchOperator;

@WebServlet("/branchoperatorreg")
public class BranchOperatorRegisterServlet extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  @EJB(lookup = "java:global/CourierWebService/BranchOperatorServiceImpl!com.klef.ep.services.BranchOperatorService")
  BranchOperatorService branchOperatorService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String uname=request.getParameter("bopid");
      String pwd=request.getParameter("boppwd");
      
      BranchOperator bop=new BranchOperator();
      bop.setBranchoperatorid(uname);
      bop.setBranchoperatorpwd(pwd);
      System.out.println(bop.toString());
      String result=branchOperatorService.branchoperatorRegistration(bop);
      out.println(result);
  }
}