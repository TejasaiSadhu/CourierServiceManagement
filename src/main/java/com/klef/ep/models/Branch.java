package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="branch_table")
public class Branch implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="Branchid")
	private int Branchid;
	private String BranchName;
	private String BranchCode;
	
	
	
	
	
	
	public int getBranchid() {
		return Branchid;
	}
	public void setBranchid(int branchid) {
		Branchid = branchid;
	}
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public String getBranchCode() {
		return BranchCode;
	}
	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}
	
	
	
	
	
	
 

}
