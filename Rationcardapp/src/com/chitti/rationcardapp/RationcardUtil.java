
package com.chitti.rationcardapp;

import com.chitti.rationcardapp.dto.RationcardDTO;

public class RationcardUtil {

	public static void main(String []args)
	{
		
		RationcardDTO Rationcard =new RationcardDTO();
	
		Rationcard.setMembers((byte)8);
		Rationcard.setCardno("BDM20503120");
		Rationcard.setType("BPL");
		System.out.println(Rationcard);
		System.out.println(Rationcard.hashCode());
		
		RationcardDTO Rationcard1 =new RationcardDTO();
		
		Rationcard1.setMembers((byte)8);
		Rationcard1.setCardno("BDM20503120");
		Rationcard1.setType("BPL");
		System.out.println(Rationcard1);
		System.out.println(Rationcard1.hashCode());
		
		System.out.println(Rationcard.equals(Rationcard1));
		
		
}
}