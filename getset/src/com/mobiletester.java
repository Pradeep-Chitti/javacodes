package com;
import com.chitti.oops.encapsulation.mobile;
public class mobiletester {
	
	public static void main(String []args)

	{
		mobile name=new mobile();
		
		
		String mobile=name.getBrand();
		System.out.println(mobile);
		
		
		name.setBrand("Samsung");
		String mbl=name.getBrand();
		System.out.println(mbl);
	}
	}
	 

