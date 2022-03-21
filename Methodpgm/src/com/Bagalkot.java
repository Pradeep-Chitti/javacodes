package com;
import com.chitti.ClassAndObject.Gld;

public class Bagalkot {
	
	
	public static void main (String []args)
	{
	String lan=Gld.lan;
	System.out.println(lan);
	
	
	
	
	
	
	
	
	
	Gld res=new Gld();
	
	String special=res.spl;
	System.out.println(special);
	
	long population=res.pop;
	System.out.println(population);
	
	String Lezend=res.lazends;
	System.out.println(Lezend);
	
	String peoples=res.ppls;
	System.out.println(peoples);
	
	double inco=res.totalincome;
	System.out.println(inco);
	
	
	res.KFC();
	res.KTM();
	res.ppls();
	res.totalboys();
	res.crush();
	
	}		

}