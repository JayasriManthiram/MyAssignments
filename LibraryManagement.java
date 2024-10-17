package week1.homeassignments;

public class LibraryManagement {
	
	public static void  main(String[] args) {
		
	//To access library management method,create object for  library class
		
		Library book=new Library();
		String addbook=book.addbook("Java for Dummies");
		book.issuebook();
		System.out.println(addbook);
		System.out.println();
		
	}
	
	
	

}
