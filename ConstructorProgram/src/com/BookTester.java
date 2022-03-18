package com;

import com.chitti.books.Book;

public class BookTester {
	 
	public static void main(String []args)
	{
	Book boo=new Book("book", "Sukha_dukha",125, "November", 150, "C R Chandrashekar", "Swapna Book stall", "1/8dimension", 9845605615d, true );
	
	
	
    Book booo=new Book("Books", "Sukha", 130, "december",350, "Pradeep", "Library","1/10dimensions", 9036455410d,false);
	
	
    Book bo=new Book("bookss","Dukha",150, "august",250,"Pradee","Bookstall", "1/5dimensions",9886255410d,true);
    
    
    
    boo.about();
    boo.importance();
    boo.fact();
    
	}
}
