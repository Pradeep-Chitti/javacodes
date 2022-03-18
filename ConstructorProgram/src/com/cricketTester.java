package com;

import com.chitti.cricket.cricket;

public class cricketTester {
	
	public static void main(String []args) {
		cricket cric=new cricket("outdoor" ,"Cricket", 50.00f, 11, "Chinnaswami","Banglore",6, 3, 2, "Virat" );
		
		cricket cr=new cricket("indore","chess", 20.00f, 12, "edengarden", "Kolkata", 3, 6, 2 , "Virat" );
		
		cricket crii=new cricket("dont know", "football", 22.20f, 20, "Manchester", "England", 5, 5, 1, "Ronaldo");
		
		cric.about();
		cric.greatplayers();
		cric.special();
	
}

	

}
