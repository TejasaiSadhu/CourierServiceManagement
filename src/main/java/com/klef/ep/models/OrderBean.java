package com.klef.ep.models;

import java.util.List;

import javax.ejb.*;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.klef.ep.services.BranchService;
import com.klef.ep.services.OrderService;
import com.klef.ep.services.ProductService;
import com.klef.ep.services.RouteService;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

@ManagedBean(name = "ordBean",eager = true)
public class OrderBean 
{
	private int oid;
	private double oamount;
	private String ostatus;
	private String response;
	private String ordcount;
	private String totalamount;
	private String ordcntdelv;
	List<Orders> orderlist;
	List<Orders> statuslist;
	
	
	public String getOrdfromplace() {
		return ordfromplace;
	}

	public void setOrdfromplace(String ordfromplace) {
		this.ordfromplace = ordfromplace;
	}

	public String getOrdtoplace() {
		return ordtoplace;
	}

	public void setOrdtoplace(String ordtoplace) {
		this.ordtoplace = ordtoplace;
	}

	public double getOrddistance() {
		return orddistance;
	}

	public void setOrddistance(double orddistance) {
		this.orddistance = orddistance;
	}

	public double getOrdvalue() {
		return ordvalue;
	}

	public void setOrdvalue(double ordvalue) {
		this.ordvalue = ordvalue;
	}

	public String getOrdsenderdetails() {
		return ordsenderdetails;
	}

	public void setOrdsenderdetails(String ordsenderdetails) {
		this.ordsenderdetails = ordsenderdetails;
	}

	public String getOrdrecieverdetails() {
		return ordrecieverdetails;
	}

	public void setOrdrecieverdetails(String ordrecieverdetails) {
		this.ordrecieverdetails = ordrecieverdetails;
	}

	public String getOrdemail() {
		return ordemail;
	}

	public void setOrdemail(String ordemail) {
		this.ordemail = ordemail;
	}

	public String getOrdphonenum() {
		return ordphonenum;
	}

	public void setOrdphonenum(String ordphonenum) {
		this.ordphonenum = ordphonenum;
	}

	public String getOrddate() {
		return orddate;
	}

	public void setOrddate(String orddate) {
		this.orddate = orddate;
	}

	public int getOrdestimateddeliverydays() {
		return ordestimateddeliverydays;
	}

	public void setOrdestimateddeliverydays(int ordestimateddeliverydays) {
		this.ordestimateddeliverydays = ordestimateddeliverydays;
	}

	public String getOrdproductid() {
		return ordproductid;
	}

	public void setOrdproductid(String ordproductid) {
		this.ordproductid = ordproductid;
	}


	private String ordtoplace;
	private String ordfromplace;
	private double orddistance;
	private double ordvalue;
	private String ordsenderdetails;
	private String ordrecieverdetails;
	private String ordemail;
	private String ordphonenum;
	private String orddate;
	private int ordestimateddeliverydays;
	private String ordproductid;
	private String ordupdatedon;
	private String ordatplace;
	
	
	




	private String prouctid;
	private double proweight;
	private double proheight;
	private double prowidth;
	private double prolength;
	
	
	
	
	public String getProuctid() {
		return prouctid;
	}

	public void setProuctid(String prouctid) {
		this.prouctid = prouctid;
	}

	public double getProweight() {
		return proweight;
	}

	public void setProweight(double proweight) {
		this.proweight = proweight;
	}

	public double getProheight() {
		return proheight;
	}

	public void setProheight(double proheight) {
		this.proheight = proheight;
	}

	public double getProwidth() {
		return prowidth;
	}

	public void setProwidth(double prowidth) {
		this.prowidth = prowidth;
	}

	public double getProlength() {
		return prolength;
	}

	public void setProlength(double prolength) {
		this.prolength = prolength;
	}


	
	public String getOrdupdatedon() {
		return ordupdatedon;
	}

	public void setOrdupdatedon(String ordupdatedon) {
		this.ordupdatedon = ordupdatedon;
	}


	public String getOrdatplace() {
		return ordatplace;
	}

	public void setOrdatplace(String ordatplace) {
		this.ordatplace = ordatplace;
	}
	
	
	public double getOamount() {
		return oamount;
	}

	public void setOamount(double oamount) {
		this.oamount = oamount;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOstatus() {
		return ostatus;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	
	
	@EJB(lookup = "java:global/CourierWebService/OrderServiceImpl!com.klef.ep.services.OrderService")
	OrderService orderService;
	
	@EJB(lookup = "java:global/CourierWebService/ProductServiceImpl!com.klef.ep.services.ProductService")
	ProductService productService;
	
	@EJB(lookup = "java:global/CourierWebService/RouteServiceImpl!com.klef.ep.services.RouteService")
	RouteService routeService;
	
	@EJB(lookup = "java:global/CourierWebService/BranchServiceImpl!com.klef.ep.services.BranchService")
	BranchService branchService; 
	
	public List<Orders> getOrdlist() 
	{
		return orderService.viewallorders();
	}
	

	public void setOrdlist(List<Orders> ordlist) {
		this.orderlist = ordlist;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
		
	public String getOrdcount() {
		int cnt=getOrdlist().size();
		return String.valueOf(cnt);
	}

	public void setOrdcount(String ordcount) {
		this.ordcount = ordcount;
	}

	public String getTotalamount() {
		List<Orders> os = getOrdlist();
		int sum=0;
		 for (int i = 0; i < os.size(); i++) {
			 
	            // Print all elements of List
	            sum=(int) (sum+os.get(i).getAmount());
	        }
		return String.valueOf(sum);
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

	public String getOrdcntdelv() {
		List<Orders> os = getOrdlist();
		int cnt=0;
		String temp;
		 for (int i = 0; i < os.size(); i++) {
			 
	            // Print all elements of List
	            temp= os.get(i).getStatus();
	            if(temp.equals("Delivered")) {
	            	cnt++;
	            }
	        }
		return String.valueOf(cnt);
	}

	public void setOrdcntdelv(String ordcntdelv) {
		this.ordcntdelv = ordcntdelv;
	}

	public void insertord()
	{
		int min = 10000;  
	    int max = 999999; 
	    int id = (int)(Math.random()*(max-min+1)+min);
	    int min1 = 1000;  
	    int max1 = 99999; 
	    int pid = (int)(Math.random()*(max1-min1+1)+min1);
	    String value = FacesContext.getCurrentInstance().
	    getExternalContext().getRequestParameterMap().get("hidden1");
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
	    LocalDateTime now = LocalDateTime.now();
	    ordupdatedon=(dtf.format((now)));
	    //ordfromplace=value;
	    Route rot = routeService.getRouteInfo(ordfromplace, ordtoplace);
	    orddistance=rot.getRouteDistance();
	    ordestimateddeliverydays=rot.getRouteEstimatedDays();
	    if(ordestimateddeliverydays>3) {
	    	 oamount=144;
	    }
	    else if(ordestimateddeliverydays>1) {
	    	 oamount=108;
	    }
	    else if(ordestimateddeliverydays==1) {
	    	oamount=96;
	    }
	    else {
	    	oamount=198;
	    }
	    
	    
		try
		{
			Orders ord = new Orders();
			ord.setOrderid(id);
			ord.setStatus("to be dispatched");
			ord.setAmount(oamount);
			
			ord.setOrderfromplace(ordfromplace);
			ord.setOrderfromplace(value);
			ord.setOrdertoplace(ordtoplace);
			ord.setOrderdistance(orddistance);
			ord.setOrdervalue(ordvalue);
			ord.setOrdersenderdetails(ordsenderdetails);
			ord.setOrderrecieverdetails(ordrecieverdetails);
			ord.setOrderemail(ordemail);
			ord.setOrderphonenum(ordphonenum);
			ord.setOrderdate((dtf.format((now))).toString());
			ord.setOrderupdatedon(ordupdatedon);
			ord.setOrderestimateddeliverydays(ordestimateddeliverydays);
			ord.setOrderproductid(String.valueOf(pid));
			ord.setOrderatplace(ordfromplace);
			
			
			Product pro = new Product();
			pro.setProductid(pid);
			pro.setProductheight(proheight);
			pro.setProductlength(prolength);
			pro.setProductweight(proweight);
			pro.setProductwidth(prowidth);
			
			String res=productService.insertproduct(pro);
			response=orderService.insertorder(ord);
			response = response + "		Your Product ID : "+" "+res ;
			
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void updateord()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now();
	    ordupdatedon=(dtf.format((now)));
		try
		{
			Orders ord = new Orders();
			ord.setOrderid(oid);
			ord.setStatus(ostatus);
			ord.setAmount(oamount);
			
			
			ord.setOrderfromplace(ordfromplace);
			ord.setOrdertoplace(ordtoplace);
			
			ord.setOrderupdatedon(ordupdatedon);
			ord.setOrderatplace(ordatplace);
		
			response=orderService.updateorder(ord, oid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void deleteord()
	{
		try
		{
			response=orderService.deleteorder(oid);
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
	}
	public void viewallord()
	{
		try
		{
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public List<Orders> ordstatus()
	{
		return orderService.trackOrder(oid);
	}
	
	
	
	
	
	
	
	
	
	
	public static class FromPlace
    {
        public String fromplaceLabel;
        public String fromplaceValue;
        
        public FromPlace(String frmpLabel, String frmpValue)
        {
            this.fromplaceLabel = frmpLabel;
            this.fromplaceValue = frmpValue;
        }
        
        public String getFromplaceLabel()
        {
            return fromplaceLabel;
        }
        
        public String getFromplaceValue()
        {
            return fromplaceValue;
        }
    }
    
    public List<Branch> branch;
    
    public List<Branch> getFromplaceValue()
    {
    	//branch = new Branch[3];
        List<Branch> brc=branchService.getBranch();
//        for (int i = 0; i < brc.size(); i++) {
//        	branch[i] = brc.get(i);
//        	System.out.println(branch[i]);
//        }
            
        
    	return brc;
    	
    	
    	
    	
    	
    	
//    	fromplaceList[0] = new FromPlace("Hyderabad", "Hyd");
//    	fromplaceList[1] = new FromPlace("Bangalore", "bglr");
//    	fromplaceList[2] = new FromPlace("Visakhapatnam", "vskp");
//    
//        return fromplaceList;
    }
	
	
	
	
	
	
	
	
	
}
