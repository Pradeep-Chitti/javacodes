package com.chitti.exception;

public class Exceptionpropagation {
	public static void main(String[] args)throws ClassNotFoundException 
	{
		System.out.println("main method started");
		m1();
		System.out.println("main method ended");
	}

	private static void m1() throws ClassNotFoundException{
		System.out.println("m1 method started");
		m2();
		System.out.println("m1 method ended");
	}

	private static void m2() throws ClassNotFoundException{
		System.out.println("m2 method started");
		m3();
		System.out.println("m2 method ended");
	}

	private static void m3() throws ClassNotFoundException{
		System.out.println("m3 method started");
		m4();
		System.out.println("m4 method ended");
	}

	private static void m4() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.chitti.exception.Exceptionpropagation");
	}

}
