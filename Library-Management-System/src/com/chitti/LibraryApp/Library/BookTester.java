package com.chitti.LibraryApp.Library;

import java.util.Scanner;

import com.chitti.LibraryApp.dto.BookDTO;
import com.chitti.LibraryApp.dto.LibraryImpl.LibraryImpl;
import com.chitti.LibraryApp.Library.LibraryApp;

public class BookTester {
	private static String text;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		
		LibraryApp lib=new LibraryImpl(size);
		
		for (int i = 0; i <size; i++) {
			
	
		
			BookDTO book=new BookDTO();
			
		System.out.println("enter book id");
		book.setBookId(sc.nextInt());
		
		System.out.println("enter book name");
		book.setBookName(sc.next());
		
		System.out.println("enter author name");
		book.setBookAuthorName(sc.next());
		
		System.out.println("enter price");
		book.setBookPrice(sc.nextFloat());
		
		System.out.println("enter a addition");
		book.setBookAddition(sc.next());
		
		System.out.println("enter publisher name");
		book.setBookPublisher(sc.next());
		
		System.out.println(lib.createBookDetails(book));
		}
		
		System.out.println();
		lib.getAllBookDetails();
		
		System.out.println("enter author name to update BOOK addition");
		lib.updateAdditionByAuthor(sc.next(), sc.next());
		
		System.out.println("enetr book name to delete all the book details");
		lib.deleteBookDetailsByName(sc.next());

	do{
		System.out.println("Enter 1 to get all the book details");
		System.out.println("Enter 2 to update book addtion by book author");
		System.out.println("Enter 3 to delete book details by name");
		int choice =sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter the Id");
		lib.getAllBookDetails();
		break;
		case 2:System.out.println("Enter author name to update Book edition");
		lib.updateAdditionByAuthor(sc.next(),sc.next());
		break;
		case 3: System.out.println("Enter book name to delete all the book details");
		lib.deleteBookDetailsByName(sc.next());
		break;
		}
		System.out.println("do you want to continue type Yes/No");
		text=sc.next();
	}
	while(text.equalsIgnoreCase("Yes"));
	}
}


