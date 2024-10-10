package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.klef.ep.services.RouteService;


@ManagedBean(name = "rotBean",eager = true)
public class RouteBean 
{
	private int rid;
	private String response;
	private String rotfromPlace;
	private String rottoPlace;
	private double rotDistance;
	private int rotEstimatedDays;
	private String rotcount;
	private List<Route> routeList;
	
	public List<Route> getRouteList() {
		
		return routeService.getAllRoute();
	}

	public void setRouteList(List<Route> routeList) {
		this.routeList = routeList;
	}

	public String getRotfromPlace() {
		return rotfromPlace;
	}

	public void setRotfromPlace(String rotfromPlace) {
		this.rotfromPlace = rotfromPlace;
	}

	public String getRottoPlace() {
		return rottoPlace;
	}

	public void setRottoPlace(String rottoPlace) {
		this.rottoPlace = rottoPlace;
	}

	public double getRotDistance() {
		return rotDistance;
	}

	public void setRotDistance(double rotDistance) {
		this.rotDistance = rotDistance;
	}

	public int getRotEstimatedDays() {
		return rotEstimatedDays;
	}

	public void setRotEstimatedDays(int rotEstimatedDays) {
		this.rotEstimatedDays = rotEstimatedDays;
	}


	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}




	public String getRotcount() {
		return String.valueOf(getRouteList().size());
		
	}

	public void setRotcount(String rotcount) {
		this.rotcount = rotcount;
	}




	@EJB(lookup = "java:global/CourierWebService/RouteServiceImpl!com.klef.ep.services.RouteService")
	RouteService routeService;
	
		
	public void insertroute()
	{
		int min = 100;  
	    int max = 999; 
	    int id = (int)(Math.random()*(max-min+1)+min);
		try
		{
			
			Route rot = new Route();
			rot.setRouteid((id));
			rot.setRouteDistance(rotDistance);
			rot.setRouteEstimatedDays(rotEstimatedDays);
			rot.setRoutefromPlace(rotfromPlace);
			rot.setRoutetoPlace(rottoPlace);
			
			
		
			response= routeService.insertRoute(rot);
			
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	
	public String updateroute()
	{
		String value = FacesContext.getCurrentInstance().
		getExternalContext().getRequestParameterMap().get("hidden1");
		System.out.println(value);
		return "/uroute.xhtml?faces-redirect=true";
	}
	public void deleteroute(int rid)
	{
		try
		{
			response=routeService.deleteroute(rid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	

}
