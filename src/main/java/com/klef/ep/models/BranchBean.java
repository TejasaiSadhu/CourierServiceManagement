package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.BranchService;


@ManagedBean(name = "brcBean",eager = true)
public class BranchBean 
{

	private String response;
	private String brcname;
	private String brccode;
	private String brccount;
	List<Branch> branchlist;
	
	
	
	public List<Branch> getBranchlist() {
		return branchService.getBranch();
	}

	public void setBranchlist(List<Branch> branchlist) {
		this.branchlist = branchlist;
	}

	public String getBrcname() {
		return brcname;
	}

	public void setBrcname(String brcname) {
		this.brcname = brcname;
	}

	public String getBrccode() {
		return brccode;
	}

	public void setBrccode(String brccode) {
		this.brccode = brccode;
	}

	
	
	
	@EJB(lookup = "java:global/CourierWebService/BranchServiceImpl!com.klef.ep.services.BranchService")
	BranchService branchService;
	
	

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
		
	public String getBrccount() {
		int cnt=getBranchlist().size();
		return String.valueOf(cnt);
	}

	public void setBrccount(String brccount) {
		this.brccount = brccount;
	}

	public void insertbranch()
	{
		int min = 1000;  
	    int max = 99999; 
	    int id = (int)(Math.random()*(max-min+1)+min);
		try
		{
			
			Branch brc = new Branch();
			brc.setBranchid((id));
			
			brc.setBranchName(brcname);
			brc.setBranchCode(brccode);
			
			
		
			response= branchService.insertbranch(brc);
			
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	
	public void viewallbranches() 
	{
		
		
	}
	

}
