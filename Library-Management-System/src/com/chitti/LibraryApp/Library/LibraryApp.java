package com.chitti.LibraryApp.Library;

import com.chitti.LibraryApp.dto.BookDTO;

public interface LibraryApp {
		public boolean createBookDetails(BookDTO dto); 
			
		public void getAllBookDetails() ;
			
		public boolean updateAdditionByAuthor(String authorName,String bookAddition); 
				
		
		public boolean deleteBookDetailsByName(String bookName);
		
			
					
		
		
	}
