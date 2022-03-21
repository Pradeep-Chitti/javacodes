package com.chitti.socialmediaaap.dto;

public class socialmediaapptester {
	
	public static void main (String []args)
	{
		
		socialmediaapp socialmedia=new socialmediaapp();
			 socialmedia.setAppname("Instagram");
			 socialmedia.setFounder("Kevin Systrom");
			 socialmedia.setId((byte)20);
			 socialmedia.setSize((byte)30);
			 
			 
			System.out.println(socialmedia);
			
			socialmediaapp socialmedia1=new socialmediaapp();
			
			
			socialmedia1.setAppname("Facebook");
			socialmedia1.setFounder("Mark zukerberg");
			socialmedia1.setId(22);
			socialmedia1.setSize(25);
			
		
			System.out.println(socialmedia1);
			
	
	System.out.println(socialmedia.hashCode());
	
	System.out.println(socialmedia.equals(socialmedia1));
	
	
	

}}