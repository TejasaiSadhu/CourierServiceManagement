package com.klef.ep.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="route_table")
public class Route implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="routeid")
	private int routeid;
	public int getRouteid() {
		return routeid;
	}
	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}
	public String getRoutefromPlace() {
		return routefromPlace;
	}
	public void setRoutefromPlace(String routefromPlace) {
		this.routefromPlace = routefromPlace;
	}
	public String getRoutetoPlace() {
		return routetoPlace;
	}
	public void setRoutetoPlace(String routetoPlace) {
		this.routetoPlace = routetoPlace;
	}
	public double getRouteDistance() {
		return routeDistance;
	}
	public void setRouteDistance(double routeDistance) {
		this.routeDistance = routeDistance;
	}
	private String routefromPlace;
	private String routetoPlace;
	private double routeDistance;
	private int routeEstimatedDays;
	public int getRouteEstimatedDays() {
		return routeEstimatedDays;
	}
	public void setRouteEstimatedDays(int routeEstimatedDays) {
		this.routeEstimatedDays = routeEstimatedDays;
	}
	
	
	
	
	
 

}
