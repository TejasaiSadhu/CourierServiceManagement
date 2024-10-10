package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="admin_table")
public class Admin implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="adminid")
	private String adminid;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getAdmindpwd() {
		return admindpwd;
	}
	public void setAdmindpwd(String admindpwd) {
		this.admindpwd = admindpwd;
	}
	private String admindpwd;
	
	
	
	
 

}
