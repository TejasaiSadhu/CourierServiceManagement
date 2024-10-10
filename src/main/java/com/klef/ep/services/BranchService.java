package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Branch;

@Remote
public interface BranchService 
{
  public String insertbranch(Branch brc);
  public List<Branch> getBranch();

}