package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="order_table")
public class Orders implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="orderid")
	private int orderid;
	private double amount;
	@Column(name="orderstatus")
	private String status;
	
	public String getOrderfromplace() {
		return orderfromplace;
	}
	public void setOrderfromplace(String orderfromplace) {
		this.orderfromplace = orderfromplace;
	}
	public String getOrdertoplace() {
		return ordertoplace;
	}
	public void setOrdertoplace(String ordertoplace) {
		this.ordertoplace = ordertoplace;
	}
	public double getOrderdistance() {
		return orderdistance;
	}
	public void setOrderdistance(double orderdistance) {
		this.orderdistance = orderdistance;
	}
	public double getOrdervalue() {
		return ordervalue;
	}
	public void setOrdervalue(double ordervalue) {
		this.ordervalue = ordervalue;
	}
	public String getOrdersenderdetails() {
		return ordersenderdetails;
	}
	public void setOrdersenderdetails(String ordersenderdetails) {
		this.ordersenderdetails = ordersenderdetails;
	}
	public String getOrderrecieverdetails() {
		return orderrecieverdetails;
	}
	public void setOrderrecieverdetails(String orderrecieverdetails) {
		this.orderrecieverdetails = orderrecieverdetails;
	}
	public String getOrderemail() {
		return orderemail;
	}
	public void setOrderemail(String orderemail) {
		this.orderemail = orderemail;
	}
	public String getOrderphonenum() {
		return orderphonenum;
	}
	public void setOrderphonenum(String orderphonenum) {
		this.orderphonenum = orderphonenum;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public int getOrderestimateddeliverydays() {
		return orderestimateddeliverydays;
	}
	public void setOrderestimateddeliverydays(int orderestimateddeliverydays) {
		this.orderestimateddeliverydays = orderestimateddeliverydays;
	}
	public String getOrderproductid() {
		return orderproductid;
	}
	public void setOrderproductid(String orderproductid) {
		this.orderproductid = orderproductid;
	}
	private String orderfromplace;
	private String ordertoplace;
	private double orderdistance;
	private double ordervalue;
	private String ordersenderdetails;
	private String orderrecieverdetails;
	private String orderemail;
	private String orderphonenum;
	private String orderdate;
	private int orderestimateddeliverydays;
	private String orderproductid;
	private String orderupdatedon;
	private String orderatplace;
	
   
	public String getOrderatplace() {
		return orderatplace;
	}
	public void setOrderatplace(String orderatplace) {
		this.orderatplace = orderatplace;
	}
	public String getOrderupdatedon() {
		return orderupdatedon;
	}
	public void setOrderupdatedon(String orderupdatedon) {
		this.orderupdatedon = orderupdatedon;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
 

}
