package com.klef.ep.services;

import javax.ejb.Remote;
import java.util.List;

import com.klef.ep.models.Orders;

@Remote
public interface OrderService 
{
   public String insertorder(Orders ord);
   public String updateorder(Orders ord,int oid);
   public String deleteorder(int oid);
   public List<Orders> viewallorders();
   public List<Orders> trackOrder(int id);
}
