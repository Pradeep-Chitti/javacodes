package com.chitti.atmapp.dto;

public class AtmDTO {
	private String Bankname;
	private int Atmno;
	private String Type;
	
	
	public AtmDTO() {
		
		
	}
	public String getBankname() {
		
		return Bankname;
	} 
	public void setBankname(String bankname)
	{
		Bankname=bankname;
		
	}
	public double getAtmno() {
		
		return Atmno;
	}
	
	public  void setAtmno(int atmno) {
		Atmno=atmno;
		
	} 
	public String getype() {
		
		return Type;
	}
	
	public void setType(String type) {
		
		Type=type;
	}
	
	@Override
	public String toString() {
		
		return "ATM=[Bnakname= "+Bankname+",Atmno= "+Atmno+",Type= "+Type+",]";
	}
	
	public int hashCode() {
		return Atmno;
	}
	
	@Override
	public boolean equals(Object obj) {
		AtmDTO atm=(AtmDTO)obj;
		if(this.Bankname==atm.Bankname)
			return true;
		return false;
		
	}
}



