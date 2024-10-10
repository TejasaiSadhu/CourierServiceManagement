package com.klef.ep.services;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.klef.ep.models.Admin;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class AdminServiceImpl implements AdminService
{

  @Override
  public String adminRegistration(Admin adm) 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      entityManager.persist(adm);
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
   
      
      return "Registration Success";
  }

  @Override
  public Admin adminLogin(String admid, String admpwd) 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      Query qry=entityManager.createQuery("select adm from Admin adm where adminid=? and  admindpwd=?");
      qry.setParameter(1, admid);
      qry.setParameter(2, admpwd);
      
      Admin adm = null;
      
      if (qry.getResultList().size()==1) 
      {
        adm = (Admin) qry.getSingleResult();
      }
      
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
      return adm;
  }

}