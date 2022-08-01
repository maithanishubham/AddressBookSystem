package AddressBook;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Scanner;

public class Operation {
		
	Scanner sc = new Scanner(System.in);
    ArrayList<ContactDetails> contactlist = new ArrayList<>();
   
	
	//To add the entries
    public void add() {
    	System.out.println("Enter First Name :");
    	String fName = sc.next();
    	//contact.setFirstName(fName);
    	
    	System.out.println("Enter Last Name :");
    	String lName = sc.next();
    	//contact.setLastName(lName);
    	
    	System.out.println("Enter Address :");
    	String address = sc.next();
    	//contact.setAddress(address);
    	
    	System.out.println("Enter City :");
    	String city = sc.next();
    	//contact.setCity(city);
    	
    	System.out.println("Enter State:");
    	String state = sc.next();
    	//contact.setState(state);
    	
    	System.out.println("Enter Zip Code :");
    	String zip = sc.next();
    	//contact.setZip(zip);
    	
    	System.out.println("Enter Phone :");
    	String phoneno = sc.next();
    	//contact.setPhoneNo(phoneno);
    	
    	
    	ContactDetails contact = new ContactDetails(fName, lName, address, city, state, zip, phoneno, phoneno);
    	
    	this.contactlist.add(contact);
    	
    }
    // To find the person
    public int indexOfPerson(){

		System.out.println();
		System.out.println("Enter the Person Full Name");
		String fname = sc.next();
    	String lname = sc.next();
    	int index = 0;
    	for(ContactDetails contact : this.contactlist) {
    		
    		if(contact.getFirstName().equalsIgnoreCase(fname) && contact.getLastName().equalsIgnoreCase(lname)) {
    			return index;
    		}
    		index++;
    	}
    	
		return -1;		
    }
    
    //To Remove the entries
    public void delete() {
    	
    	int index = this.indexOfPerson();
    	if(index != -1) {
    		ContactDetails contact = this.contactlist.remove(index);
    		System.out.println("Person details deleted");
    	}else {
    		System.out.println("Person does not exist");
    	}
    }
	
	//To Print the entries
    public void printlist( ArrayList<ContactDetails> contactlist) {
		
		for(ContactDetails contact : this.contactlist) {
			
			System.out.println(contact.toString());
	    }	
	}
    
    //To Edit Entries
    public void edit() {
    	 System.out.println();
		int index = this.indexOfPerson();
		if(index != -1) {
			System.out.print("Enter the field name want to update\n 1. FirstName \n 2. LastName "
					+ "\n 3. Address \n 4. City \n 5. State \n 6. Zip \n 7. PhoneNumber");
			int option = sc.nextInt();
			switch(option) {
			
			   case 1 :System.out.println("Update the First Name");
			           this.contactlist.get(index).setFirstName(sc.next());
			           break;
			           
			   case 2 :System.out.println("Update the Last Name");
	                   this.contactlist.get(index).setLastName(sc.next());
	                   break;
			   
			   case 3 :System.out.println("Update the Address");
                       this.contactlist.get(index).setAddress(sc.next());
                       break;
			   
			   case 4 :System.out.println("Update the City Name");
                       this.contactlist.get(index).setCity(sc.next());
                       break;
			   
			   case 5 :System.out.println("Update the State Name");
                       this.contactlist.get(index).setState(sc.next());
                       break;
			   
			   case 6 :System.out.println("Update the Zip Code");
                       this.contactlist.get(index).setZip(sc.next());
                       break;
			   
			   case 7 :System.out.println("Update Phone Number ");
                       this.contactlist.get(index).setPhoneNo(sc.next());
                       break;
			   
			  
                      
			   default: System.out.println("Please enter correct Field");        
			   
			}
		 
		 }else {
			 
			 System.out.println("Person does not exist");
		 }
	 }	
 }
	    
