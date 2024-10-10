package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.BranchOperator;

@Remote
public interface BranchOperatorService 
{
  public String branchoperatorRegistration(BranchOperator bop);
  public BranchOperator branchoperatorLogin(String bopid,String boppwd);
  public List<BranchOperator>  getbranchOperator();
}