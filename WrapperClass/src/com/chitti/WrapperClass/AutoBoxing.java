package com.chitti.WrapperClass;

public class AutoBoxing {
	
	public static void main (String []args)
	{
		int i=20;
		System.out.println(i);
		Integer i1=i; //autoboxing
		System.out.println(i1.toString());
		System.out.println(i1.hashCode());

		short s=30;
		System.out.println(s);
		Short s1=s; //Autoboxing
		System.out.println(s1.hashCode());
		System.out.println(s1.toString());
		
		
		byte b=22;
		System.out.println(b);
		Byte b1=b; //Autoboxing
		System.out.println(b1.hashCode());
		System.out.println(b1.toString());
		
		
		long l=10000;
		System.out.println(l);
		Long l1=l; //Autoboxing
		System.out.println(l1.toString());
		System.out.println(l1.hashCode());
		
		float f=22.22f;
		System.out.println(f);
		Float f1=f;
		System.out.println(f1.hashCode());
		System.out.println(f1.toString());
		
		
		double d=55.22d;
		System.out.println(d);
		Double d1=d;
		System.out.println(d1.hashCode());
		System.out.println(d1.toString());
		}

}

