package com.chitti.javamemory;

public class baba{
	public static void main(String[] args) {
	//String Literals
		String name="baba";
		String name1="baba";
				
				String n=new String("Baba");
				System.out.println(name==name1);
				System.out.println(name==n);
				System.out.println(name1.equalsIgnoreCase(name));
	}

}


