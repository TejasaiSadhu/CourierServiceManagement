package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.klef.ep.models.Product;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProductServiceImpl implements ProductService
{

  @Override
  public String insertproduct(Product pro) 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      entityManager.persist(pro);
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
   
      
      return  String.valueOf(pro.getProductid());
  }

 
}