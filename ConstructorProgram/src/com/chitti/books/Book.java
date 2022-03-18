package com.chitti.books;

public class Book {
	
	public String type;
	public String name;
	public int price;
	public  String first_print;
	public int noOfpages;
	public String author;
	public String available;
	public String booksize;
	public double author_no;
	public boolean good;
	
	public Book(String a,String b, int c, String d, int e, String f, String g, String h, double i, boolean j)
	{
		type=a;
		name=b;
		price=c;
		first_print=d;
		noOfpages=e;
		author=f;
		available=g;
		booksize=h;	
		author_no=i;
		good=j;
		
		System.out.println(type+ "\t" +name+ "\t" +price+ "\t" +first_print+ "\t" +noOfpages+ "\t" +author+ "\t" +available+ "\t" +booksize+ "\t" +author_no+ "\t" +good+ "\t" );
		
	}
	public void about()
	{
		System.out.println("This book is amazing");
	}
	public void importance()
	{
		System.out.println("providing knowledge of the outside world, improving their reading, ");
		
	}
	public void fact()
	{
		System.out.println("improves brain connectivity.\r\n"
				+ "increases your vocabulary and comprehension.s");
	}
	}
	
				
	

