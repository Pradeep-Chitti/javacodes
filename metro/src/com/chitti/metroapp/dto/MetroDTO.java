package com.chitti.metroapp.dto;

public class MetroDTO {

	private String name;
	private String type;
	private byte noOftickets;
	
	
	
	
	public MetroDTO() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	
		// TODO Auto-generated constructor s
	}
	
	public String getName() {
		return name;
	
	} 
	public void setName(String Namee) {
		
		name=Namee;
	}
	public String getType() {
		return type;
	}
	
	public void setType(String typee) {
		
	    type=typee;
	}
	public byte getnoOftickets() {
		return noOftickets;
	}
	public void setOftickets(byte NoOftickets) {
		noOftickets=NoOftickets;
		
		
		
	}
	@Override
	public String toString() {
	
		return "name="+name+",type="+type+",no of tickets="+noOftickets+"";
		
	}
	
	@Override
	public int hashCode() {
		
		return this.noOftickets;
	}
	
	public boolean equals(Object obj) {
		MetroDTO metro=(MetroDTO)obj;
		if(this.name==metro.name)
			return true;
		return false;
	}
	
	
	
}
