package com.klef.ep.services;

import javax.ejb.Remote;

import com.klef.ep.models.Product;

@Remote
public interface ProductService 
{
  public String insertproduct(Product pro);
}