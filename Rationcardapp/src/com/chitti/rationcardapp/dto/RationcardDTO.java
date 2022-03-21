package com.chitti.rationcardapp.dto;

public class RationcardDTO {
	
	private String cardno;
	private int members;
	private String type;
	
	
	public RationcardDTO() {
		System.out.println(this.getClass().getSimpleName()+ "Ration card object is created");
		
		
	}


	public String getCardno() {
		return cardno;
	}


	public void setCardno(String cardno) {
		this.cardno = cardno;
	}


	public int getMembers() {
		return members;
	}


	public void setMembers(int members) {
		this.members = members;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		
		return "RationcardDTO [Cardno= "+cardno+" Members= "+members+", Type= "+type+"]";
	}

	@Override
	public int hashCode() {
		return this.members;
	}
public boolean equals(Object obj)
{
	RationcardDTO Rationcard=(RationcardDTO)obj;
	if(this.members==Rationcard.members)
		return true;
	   return false;
}
	}


