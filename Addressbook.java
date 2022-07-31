package AddressBook;

public class Addressbook {

	public static void main(String[] args) {
		
			System.out.println("Welcome To Address Book");
			ContactDetails ContactPerson = new ContactDetails();
			ContactPerson.createContacts();
			Operation  Operation1 = new Operation();
			Operation1.addDetails();
			Operation1.edit();
			Operation1.delete();
		}

}
