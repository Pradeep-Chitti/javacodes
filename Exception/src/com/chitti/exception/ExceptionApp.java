package com.chitti.exception;

import java.util.Iterator;

public class ExceptionApp {
public static void main(String[] args) {
	try {
		int
		[] a=new int[5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		a[5]=12;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		String st=null;
		String str="null";
		System.out.println(st.equals(str));
	}
	catch (ArrayIndexOutOfBoundsException ar) {
	System.out.println("can not add more elements");
	}
	catch(NullPointerException e) {
		e.printStackTrace();
	}
	}
}

