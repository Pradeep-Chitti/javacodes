package com.chitti.conditonandlooping;

public class Fibonacci {
	
	public static void main(String[] args) {
		
	int count=10;
	int num1=0;
	int num2=1;
	
	for(int i=1; i<=count; i++) {
		
		System.out.println(num1);
		
		//conditions
		 int newterm=num1+num2;//o+1=1//newterm=1
		 num1=num2;//num1=1;
		 num2=newterm;//num2=1
	}
	
	}

}
