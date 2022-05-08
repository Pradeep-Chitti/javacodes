package com.chitti.hospitalapp.dto;

public class HospitalDTO {
	private String Name;
	private int noOfdoctors;
	private String venue;
	
	
	public HospitalDTO() {
		System.out.println(this.getName() +"HospitalDTO object is created");
		
		
	}
	public String getName() {
		return Name ;
	}
	public void setName(String name) {
		Name=name;
		
	}
	public int getnoOfdoctors() {
	return noOfdoctors;
	}
	public void setnoOfdoctors(int NoOfdoctors) {
		noOfdoctors=NoOfdoctors;
		
	}
	
	public String getvenue(String Venue) {
		return venue;
	}
	public void setvenue(String Venue) {
		venue=Venue;
		
	}
	
	@Override
	public String toString() {
	

		return "Name="+Name+",noOfdoctors="+noOfdoctors+",venue="+venue+"";
	
	}

}


