package com.chitti.atmapp;

import com.chitti.atmapp.dto.AtmDTO;

public class atmUtil {
	
public static void main(String []args) {
	
	AtmDTO Atm=new AtmDTO();
	
	
	Atm.setBankname("Union Bank");
	Atm.setAtmno(65);
	Atm.setType("Debit Card ");
	
	System.out.println(Atm);
	
	System.out.println(Atm.hashCode());
	
	AtmDTO Atm1=new AtmDTO();
	
	
	Atm1.setBankname("Union Bank");
	Atm1.setAtmno(65);
	Atm1.setType("Debit Card ");
	
	
	System.out.println(Atm1.equals(Atm));
}
}
