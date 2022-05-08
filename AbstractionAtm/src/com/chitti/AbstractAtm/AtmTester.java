package com.chitti.AbstractAtm;

public class AtmTester {
public static void main(String[] args) {
	Atm swipe=new BankFactory().getBank("HdfcBank");
	
	if(swipe !=null) {
		
		swipe.Swippping();
	}
}
}
