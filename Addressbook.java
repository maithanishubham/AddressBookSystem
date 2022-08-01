package AddressBook;

import java.util.HashMap;
import java.util.Scanner;

public class Addressbook {

	Scanner sc = new Scanner(System.in);
	static  HashMap<String, Addressbook> map=new HashMap<>();
	
	Operation AddressBook = new Operation();
	Operation book = new Operation();
	
	private int select() {
		int selection;
		do {
			System.out.println();
	 	    System.out.println("Enter 1. To Add the contacts");
	           System.out.println("Enter 2. To Print all contacts");
		    System.out.println("Enter 3. To Edit the contacts");
		    System.out.println("Enter 4. To Delete the contacts");
		    System.out.println("Enter 5. To Exit");
		    System.out.println("Enter your choice");
		    selection = sc.nextInt(); 
		}while(selection<1 || selection > 5);
			
		return selection;
	}
	
	int choice;
	private void showAddressBook() {
		
		do {		
        	choice = select();
		    switch(choice) {
		
		         case 1 :book.add();
		            break;
		         case 2 :book.printlist(book.contactlist);
		            break;
		         case 3 :book.edit();
		            break;
		         case 4: book.delete();
		            break;
		         case 5: System.out.println("End");
		  }
	   }while(choice != 5);
	}
		
	public static void main(String[] args) {
		//AddressBook addBook = new AddressBook(); 
		Addressbook addBook = new Addressbook(); 
		Addressbook addBookOne = new Addressbook(); 
		Addressbook addBookTwo = new Addressbook(); 
		Addressbook addBookThree = new Addressbook(); 
		map.put("Ajay", addBookOne);
		map.put("Onkar", addBookTwo);
		map.put("Arpita", addBookThree);
		
	
		
		int choice;
		System.out.println("---------------Address Book----------------");
		System.out.println();
		while(true) {
			System.out.println("Enter the 1,2,3 for Address Book and 4 for exist ");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			String key=null;
          switch(option) {
            case 1: 
     	            key = "Ajay";
     	            System.out.println("Welcome "+ key);
     	            addBookOne.showAddressBook();
     	            break;
            case 2:
       	           key = "Onkar";
       	           System.out.println("Welcome "+ key);
       	           addBookOne.showAddressBook();
       	           break;
            case 3:
       	           key = "Arpita";
       	           System.out.println("Welcome "+ key);
       	           addBookThree.showAddressBook();
       	           break;       
          }	
          if(option == 4) {
        	  break;
          }
        
      }
		
    }		
}