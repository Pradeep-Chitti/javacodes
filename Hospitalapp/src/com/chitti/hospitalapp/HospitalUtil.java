package com.chitti.hospitalapp;

import com.chitti.hospitalapp.dto.HospitalDTO;

public class HospitalUtil {
	
	public static void main(String []args)
	{
		
		HospitalDTO hospital=new HospitalDTO();
		
		hospital.setName("Tejaswini Hospital");
		hospital.setnoOfdoctors(3);
		hospital.setvenue("Guledagudda");
		
		System.out.println(hospital);
	
	
	HospitalDTO hospital1=new HospitalDTO();
	
	
	hospital1.setName("government hospital");
    hospital1.setnoOfdoctors(5);
    hospital.setvenue("Bagalkot");
    System.out.println(hospital1);
 
 

	}

}
