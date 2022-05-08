package com.chitti.abstractapp;

public class LightTester {
	public static void main(String[] args) {
		Switch on=new LightFactory().getLight("CflBulb");
		if(on !=null) {
			on.sOn();
			on.sOff();
		}
		//Tubelight tube=new Tubelight();
		//tube.sOn();
		//tube.sOff();
		
		// CflBulbmpl cfl=new CflBulbmpl();
		//cfl.sOn();
		//cfl.sOff();
	}

}
