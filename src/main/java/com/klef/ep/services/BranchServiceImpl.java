package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Branch;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class BranchServiceImpl implements BranchService
{

  @Override
  public String insertbranch(Branch brc) 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      entityManager.persist(brc);
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
   
      
      return "Branch Added";
  }

  @Override
  public List<Branch> getBranch() 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      Query qry=entityManager.createQuery("select brc from Branch brc");
    
      
      List<Branch> brc =  qry.getResultList();

      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
      return brc;
  }

}