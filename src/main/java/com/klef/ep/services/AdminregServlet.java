package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Admin;

@WebServlet("/adminreg")
public class AdminregServlet extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  @EJB(lookup = "java:global/CourierWebService/AdminServiceImpl!com.klef.ep.services.AdminService")
  AdminService adminService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String uname=request.getParameter("uname");
      String pwd=request.getParameter("pwd");
      
      Admin adm=new Admin();
      adm.setAdminid(uname);
      adm.setAdmindpwd(pwd);
      System.out.println(adm.toString());
      String result=adminService.adminRegistration(adm);
      out.println(result);
  }
}