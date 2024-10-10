package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Route;

@Remote
public interface RouteService 
{
  public String insertRoute(Route rot);
  public String updateRoute(Route rot);
  public Route getRouteInfo(String rotfromplace,String rottoplace);
  public List<Route>  getAllRoute();
  public String deleteroute(int rid);

}