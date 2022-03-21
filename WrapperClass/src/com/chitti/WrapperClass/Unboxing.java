package com.chitti.WrapperClass;

public class Unboxing {

	public static void main(String[] args) {
		Byte b=22;
		byte b1=b.byteValue();
		System.out.println(b1);
		
		Short s=33;
		short s1=s.shortValue();
		System.out.println(s1);
		
		Integer i=55;
		int i1=i.byteValue();
		System.out.println(i1);
		
		Long l=650l;
		long l1=l.longValue();
		System.out.println(l1);
		
		Float f=88.88f;
		float f1=f.floatValue();
		System.out.println(f1);
		
		Double d=105.55d;
		double d1=d.doubleValue();
		System.out.println(d1);
		
		Character c='k';
		char c1=c.charValue();
		System.out.println(c1);
		
		Boolean B=true;
		boolean B1=B.booleanValue();
		System.out.println(b1);
	}
}
