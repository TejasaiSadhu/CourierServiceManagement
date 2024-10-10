package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="branchoperator_table")
public class BranchOperator implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="branchoperatorid")
	private String Branchoperatorid;
	public String getBranchoperatorid() {
		return Branchoperatorid;
	}
	public void setBranchoperatorid(String branchoperatorid) {
		Branchoperatorid = branchoperatorid;
	}
	public String getBranchoperatorpwd() {
		return Branchoperatorpwd;
	}
	public void setBranchoperatorpwd(String branchoperatorpwd) {
		Branchoperatorpwd = branchoperatorpwd;
	}
	private String Branchoperatorpwd;
	
	
	
	
	

	
	
	
	
	
 

}
