package com.klef.ep.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;
import com.klef.ep.models.Branch;
import com.klef.ep.models.BranchOperator;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class BranchOperatorServiceImpl implements BranchOperatorService
{

  @Override
  public String branchoperatorRegistration(BranchOperator bop)
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      entityManager.persist(bop);
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
   
      
      return "BranchOperator registered";
  }

  @Override
  public BranchOperator branchoperatorLogin(String bopid,String boppwd)
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      Query qry=entityManager.createQuery("select bop from BranchOperator bop where branchoperatorid=? and  branchoperatorpwd=?");
      qry.setParameter(1, bopid);
      qry.setParameter(2, boppwd);
      
      BranchOperator bop = null;
      
      if (qry.getResultList().size()==1) 
      {
        bop = (BranchOperator) qry.getSingleResult();
      }
      
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
      return bop;
  }

@Override
public List<BranchOperator> getbranchOperator() {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    
    entityManager.getTransaction().begin();
    Query qry=entityManager.createQuery("select brcOp from BranchOperator brcOp");
  
    
    List<BranchOperator> brc =  qry.getResultList();

    entityManager.getTransaction().commit();
    
    entityManager.close();
    entityManagerFactory.close();
    
    return brc;
}

}