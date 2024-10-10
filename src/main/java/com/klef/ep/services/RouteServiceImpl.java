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
import com.klef.ep.models.Orders;
import com.klef.ep.models.Route;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class RouteServiceImpl implements RouteService
{

  @Override
  public String insertRoute(Route rot) 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      entityManager.persist(rot);
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
   
      
      return "Route Added";
  }

  @Override
  public Route getRouteInfo(String rotfromplace, String rottoplace) 
  {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      
      
      entityManager.getTransaction().begin();
      Query qry=entityManager.createQuery("select rot from Route rot where routefromPlace=? and  routetoPlace=?");
      qry.setParameter(1, rotfromplace);
      qry.setParameter(2, rottoplace);
      
      Route rot = null;
      
      if (qry.getResultList().size()==1) 
      {
        rot =  (Route) qry.getSingleResult();
      }
      
      entityManager.getTransaction().commit();
      
      entityManager.close();
      entityManagerFactory.close();
      
      return rot;
  }

@Override
public List<Route> getAllRoute() {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    
    entityManager.getTransaction().begin();
    Query qry=entityManager.createQuery("select rot from Route rot");
  
    
    List<Route> rot =  qry.getResultList();

    entityManager.getTransaction().commit();
    
    entityManager.close();
    entityManagerFactory.close();
    
    return rot;
}

@Override
public String updateRoute(Route rot) {
	
	return "Route Updated";
}

@Override
public String deleteroute(int rid) 
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    
    entityManager.getTransaction().begin();
    Route o=entityManager.find(Route.class,rid);
    entityManager.remove(o);
    entityManager.getTransaction().commit();
    
    entityManager.close();
    entityManagerFactory.close();
    
    return "RouteID: "+o.getRouteid()+" deleted Successfully";
	
}

}