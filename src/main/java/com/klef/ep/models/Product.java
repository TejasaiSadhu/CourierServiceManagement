package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="product_table")
public class Product implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="productid")
	private int productid;
	private double productweight;
	private double productheight;
	private double productwidth;
	private double productlength;
	public double getProductweight() {
		return productweight;
	}

	public double getProductheight() {
		return productheight;
	}

	public void setProductheight(double productheight) {
		this.productheight = productheight;
	}

	public double getProductwidth() {
		return productwidth;
	}

	public void setProductwidth(double productwidth) {
		this.productwidth = productwidth;
	}

	public double getProductlength() {
		return productlength;
	}

	public void setProductlength(double productlength) {
		this.productlength = productlength;
	}

	public void setProductweight(double productweight) {
		this.productweight = productweight;
	}


	
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}



	
	
	
	
	
 

}
