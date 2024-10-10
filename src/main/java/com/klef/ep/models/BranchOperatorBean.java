package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.BranchOperatorService;
import com.klef.ep.services.BranchService;


@ManagedBean(name = "brcOpBean",eager = true)
public class BranchOperatorBean 
{

	private String response;
	private String brcOpid;
	private String brOpcnt;
	private String brcOppwd;
	List<BranchOperator> branchoperatorlist;
	
	
	public String getBrcOpid() {
		return brcOpid;
	}

	public void setBrcOpid(String brcOpid) {
		this.brcOpid = brcOpid;
	}

	public String getBrcOppwd() {
		return brcOppwd;
	}

	public void setBrcOppwd(String brcOppwd) {
		this.brcOppwd = brcOppwd;
	}






	
	
	
	public void setBranchoperatorlist(List<BranchOperator> branchoperatorlist) {
		this.branchoperatorlist = branchoperatorlist;
	}

	public List<BranchOperator> getBranchoperatorlist() {
		
		return branchOperatorService.getbranchOperator();
	}



	
	
	
	@EJB(lookup = "java:global/CourierWebService/BranchOperatorServiceImpl!com.klef.ep.services.BranchOperatorService")
	BranchOperatorService branchOperatorService;
	
	

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getBrOpcnt() {
		return String.valueOf(getBranchoperatorlist().size());

	}

	public void setBrOpcnt(String brOpcnt) {
		this.brOpcnt = brOpcnt;
	}
		
	

}
