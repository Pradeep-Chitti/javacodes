package com.chitti.metroapp.dto;
import com.chitti.metroapp.dto.MetroDTO;
public class MetroUtil {
	
public static void main(String[] args) {
		
	
	
	MetroDTO metro=new MetroDTO();
	
	metro.setName("Namm Metro");
	metro.setType("Electric");
	metro.setOftickets((byte)10);
	
   System.out.println(metro);
   
   MetroDTO metro1=new MetroDTO();
	
	metro1.setName("Namm Metro");
	metro1.setType("Electric");
	metro1.setOftickets((byte)10);
	
   
   System.out.println(metro.equals(metro1));
	
	System.out.println(metro.hashCode());
}	
	
}

	


