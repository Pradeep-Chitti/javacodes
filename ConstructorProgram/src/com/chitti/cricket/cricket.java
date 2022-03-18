package com.chitti.cricket;

public class cricket {
	
	public String type;
	public String name;
	public float overs;
	public int players;
	public String stadium;
	public String venue;
	public int totalBatsmans;
	public int totalBowlers;
	public int totalallrounders;
	public String fvtbatsman;

	
	
	public cricket(String a, String b, float c, int d, String e, String f, int g, int h, int i, String j)
	{
		type=a;
		name=b;
		overs=c;
		players=d;
		stadium=e;
		venue=f;
		totalBatsmans=g;
		totalBowlers=h;
		totalallrounders=i;
		fvtbatsman=j;
		
		System.out.println(type+ "\t" +name+ "\t" +overs+ "\t" +players+ "\t" +stadium+ "\t" +venue+ "\t" +totalBatsmans+ "\t" +totalBowlers+ "\t" +totalallrounders+ "\t" +fvtbatsman );
		
	}
	
	public void about()
	{
		System.out.println("Cricket is good game");
	}
	
	public void greatplayers()
	{
		System.out.println("Dhoni"+ "\t" +"Virat Kohli"+ "\t" + "Abdvilliers");
	}

		public void special()
		{
			System.out.println("Cricket is a good sport for developing overall fitness, stamina and hand–eye coordination");
		
		

		
		
		
	}
	
	
	
	
	

}
