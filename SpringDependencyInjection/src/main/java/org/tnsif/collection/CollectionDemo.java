package org.tnsif.collection;

import java.util.List;
import java.util.Set;

public class CollectionDemo {
         private List<String>contactNo;
         private Set<String>books;
         
         //setters
         public void setContactNo(List<String> contactNo) {
 			this.contactNo = contactNo;
 		}

 		public void setBooks(Set<String> books) {
 			this.books = books;
 		}
		
         public void display()
         {
        	 System.out.println("List of contactNo:");
        	 for(String contact: contactNo)
        	 {
        		 System.out.println(contact);
        	 }
        	 System.out.println();
        	 System.out.println("Set of books:");
        	 for (String b: books)
        	 {
        		 System.out.println(b);
        	 }
         }

}
