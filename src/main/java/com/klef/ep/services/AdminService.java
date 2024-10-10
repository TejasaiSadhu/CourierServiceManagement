package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Admin;

@Remote
public interface AdminService 
{
  public String adminRegistration(Admin adm);
  public Admin adminLogin(String admid,String admpwd);
}