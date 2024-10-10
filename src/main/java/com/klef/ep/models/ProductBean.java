package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;

import com.klef.ep.services.ProductService;


@ManagedBean(name = "proBean",eager = true)
public class ProductBean 
{
	private String prouctid;
	private double proweight;
	private double proheight;
	private double prowidth;
	private double prolength;
	public String getProuctid() {
		return prouctid;
	}

	public void setProuctid(String prouctid) {
		this.prouctid = prouctid;
		
	}

	public double getProweight() {
		return proweight;
	}

	public void setProweight(double proweight) {
		this.proweight = proweight;
	}

	public double getProheight() {
		return proheight;
	}

	public void setProheight(double proheight) {
		this.proheight = proheight;
	}

	public double getProwidth() {
		return prowidth;
	}

	public void setProwidth(double prowidth) {
		this.prowidth = prowidth;
	}

	public double getProlength() {
		return prolength;
	}

	public void setProlength(double prolength) {
		this.prolength = prolength;
	}

	private int result;
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	private String response;
	List<Product> orderlist;
	List<Orders> statuslist;

	@EJB(lookup = "java:global/CourierWebService/ProductServiceImpl!com.klef.ep.services.ProductService")
	ProductService productService;
	
	

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
		
	public void insertpro()
	{
		int min = 1000;  
	    int max = 99999; 
	    int id = (int)(Math.random()*(max-min+1)+min);
		try
		{
			
			Product pro = new Product();
			pro.setProductid((id));
			
			pro.setProductheight(proheight);
			pro.setProductlength(prolength);
			pro.setProductweight(proweight);
			pro.setProductwidth(prowidth);
			
		
			response= productService.insertproduct(pro);
			
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	

}
