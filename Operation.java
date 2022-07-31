package AddressBook;
import java.util.ArrayList;
import java.util.Scanner;
public class Operation {
		
	 ArrayList<ContactDetails> contactDetails = new ArrayList<>();
	    static Scanner scanner = new Scanner(System.in);
	    ContactDetails con = new ContactDetails();

	    public void addDetails() {

	        Scanner scanner = new Scanner(System.in);
	        ContactDetails details = new ContactDetails();
	        System.out.println("Enter the First Name ");
	        details.setFirstName(scanner.nextLine());
	        System.out.println("Enter the Last Name ");
	        details.setLastName(scanner.nextLine());
	        System.out.println("Enter the Address ");
	        details.setAddress(scanner.nextLine());
	        System.out.println("Enter the City ");
	        details.setCity(scanner.nextLine());
	        System.out.println("Enter the State ");
	        details.setState(scanner.nextLine());
	        System.out.println("Enter the Zip Code ");
	        details.setZip(scanner.nextLine());
	        System.out.println("Enter the Phone Number ");
	        details.setPhoneNumber(scanner.nextLine());
	     
	        contactDetails.add(details);
	    }
	    public void display() {

	        System.out.println(contactDetails);
	    }

	   
	    public void edit() {
			 System.out.println("Enter the First and Last name of a Person to be edit ");
			 String fname = scanner.next();
			 String lname = scanner.next();
			 String Fname = con.getFirstName();
			 String Lname = con.getLastName();
			 if(fname.equalsIgnoreCase(Fname) && lname.equalsIgnoreCase(Lname)) {
				    System.out.println("Edit First Name :");
			    	String fName = scanner.next();
			    	con.setFirstName(fName);
			    	
			    	System.out.println("Edit Last Name :");
			    	String lName = scanner.next();
			    	con.setLastName(lName);
			    	
			    	System.out.println("Edit Address :");
			    	String address = scanner.next();
			    	con.setAddress(address);
			    	
			    	System.out.println("Edit City :");
			    	String city = scanner.next();
			    	con.setCity(city);
			    	
			    	System.out.println("Edit State:");
			    	String state = scanner.next();
			    	con.setState(state);
			    	
			    	System.out.println("Edit Zip Code :");
			    	String zip = scanner.next();
			    	con.setZip(zip);
			    	
			    	System.out.println("Edit Phone :");
			    	String phoneno = scanner.next();
			    	con.setPhoneNumber(phoneno);
			 }		    	
		 }
			
				public void delete() {
					System.out.println("Delete the Person");
					String fname = scanner.next();
					System.out.println(fname+"");
					if (fname.equals(con.getFirstName())) {
							contactDetails.remove(con);
							System.out.println("contact is Deleted from the Address Book");
						}
	}
	    }