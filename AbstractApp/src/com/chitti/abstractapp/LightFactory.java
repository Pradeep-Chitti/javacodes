package com.chitti.abstractapp;

public class LightFactory {
	
	public Switch getLight(String type) {
		if(type.equalsIgnoreCase("Tubelight")) {
			return new Tubelight();
		}
		else if (type.equalsIgnoreCase("Cflbulb")) {
			
			return new CflBulbmpl();
		}
		else {
			System.out.println("not avilble");
		}
		return null;
		
	}

}
