package com.chitti.constroctorchain;

public class Fan {

	public byte noOfwinngs;
	public String BrandName;
	public String color;
	
	
	
	public Fan() {
		
		System.out.println("Invoking default constructor");
		
	}
	public Fan(String bname){
		
		System.out.println("invoking one param constructor");
		
		BrandName=bname;
		
	}
	public Fan(byte Noofwinngs, String colo, String bname) {
	
	System.out.println("invoking 2 parameters");
	noOfwinngs=Noofwinngs;
	color=colo;
		}
		
	
		
	@Override
	public String toString() {
		return "Fan=[noOfwings="+noOfwinngs+",BrandName="+BrandName+",color="+color+"]";
		
		
	}
	
		
	}
