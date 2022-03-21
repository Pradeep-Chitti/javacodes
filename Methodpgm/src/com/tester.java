package com;

import com.chitti.Stringpgm.demo;
public class tester {
	public static void main(String []args)
	{
		String res=demo.name;
		System.out.println(res);
		
		char ch=res.charAt(5);
		System.out.println(ch);
		
		int Index=res.indexOf("to");
		System.out.println(Index);
		
		boolean boo=res.isEmpty();
		System.out.println(boo);
		
		
		int in=res.length();
		System.out.println(in);
		
		
		String st=res.replace("to", "yes");
		System.out.println(st);
		
		String high=res.toUpperCase();
		System.out.println(high);
		
		
		String low=res.toLowerCase();
		System.out.println(low);
		
		
		String spl[]=res.split("to");
		System.out.println(spl[0]);
		
		
		
		char abc[] =res.toCharArray();
		System.out.println(abc[11]);
		
		
		int len=res.length();
		System.out.println(len);
		
		
		
		
		
		
		
		
	
				
		
	}

}
