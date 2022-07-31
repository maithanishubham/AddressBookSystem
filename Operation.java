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


}
	