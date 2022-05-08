package com;

import com.chitti.oops.encapsulation.ticket;

public class tickettester {

	public static void main(String []args)
	{
	ticket tic=new ticket();
			
			
	tic.setname("VRL");
	System.out.println(tic.getname());
	
	tic.setfrom("Guledagudd");
	System.out.println(tic.getfrom());
	
	tic.setto("banglor");
	System.out.println(tic.getto());
	
	tic.setdate((short) 07);
	System.out.println(tic.getdate());
	
	tic.setamount(750);
	System.out.println(tic.getamount());
	
	tic.setgender("male");
	System.out.println(tic.getgender());
	
	
	tic.settnumber((byte) 120);
	System.out.println(tic.gettnumber());

	
	tic.setage((byte) 22);
	System.out.println(tic.getage());
	
	
	tic.setserNo("KA29 EJ2127");
	System.out.println(tic.getserNo());
	
	
	
	tic.setsleeper(true);
	System.out.println(tic.getsleeper());
	}
}
