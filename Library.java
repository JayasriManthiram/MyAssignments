package week1.homeassignments;

public class Library {
	//Method signature
	//access modifier,returntype,method name,input parameters
	//access modifier public,return type void,
	
	public String addbook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	public void issuebook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		//create object for the library:
		
		Library books=new Library();
		//call the member of the class with the help of object reference
		books.addbook("Java for dummies");
		books.issuebook();
	}
		
		
		
}	
		
		
		
	
		
		
		
	

		
	
		
		
		
		
		
	
	
	   

