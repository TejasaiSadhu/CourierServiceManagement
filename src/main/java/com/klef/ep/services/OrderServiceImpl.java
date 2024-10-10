package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Orders;


@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class OrderServiceImpl implements OrderService
{

	@Override
	public String insertorder(Orders ord) 
	{
		
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    entityManager.persist(ord);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Order Placed  \nYour OrderID : " + String.valueOf(ord.getOrderid());
	}

	@Override
	public String updateorder(Orders ord, int oid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Orders o=entityManager.find(Orders.class,oid);
	    o.setOrderid(ord.getOrderid());
	    o.setStatus(ord.getStatus());
	    o.setOrderatplace(ord.getOrderatplace());
	    o.setOrderupdatedon(ord.getOrderupdatedon());
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "Status Updated Successfully";
		
	}

	@Override
	public String deleteorder(int oid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Orders o=entityManager.find(Orders.class,oid);
	    entityManager.remove(o);
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return "OrderID: "+o.getOrderid()+" deleted Successfully";
		
	}

	@Override
	public List<Orders> viewallorders() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select ord from Orders ord");
	    List<Orders> ordlist=qry.getResultList();
	    entityManager.getTransaction().commit();
	    
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return ordlist;
		
	}

	@Override
	public List<Orders> trackOrder(int oid) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
	    EntityManager entityManager = entityManagerFactory.createEntityManager();
	    
	    
	    entityManager.getTransaction().begin();
	    Query qry=entityManager.createQuery("select ord from Orders ord where orderid =?");
	    qry.setParameter(1,oid );
	   // System.out.println(oid);
	    List<Orders> ordlist=qry.getResultList();
	    entityManager.getTransaction().commit();
//	    for (Orders ord : ordlist) {
//	    	System.out.println(ord.getStatus());
//	    }
	    entityManager.close();
	    entityManagerFactory.close();
	    
	    return ordlist;
	}
   
}
