package AddressBook;
import java.util.Scanner;
public class ContactDetails {
	
	 private String firstName;
     private String lastName;
     private String address;
     private String city;
     private String state;
     private String zip;
     private String phoneNumber;
     

     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public String getLastName(){
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }

     public String getAddress(){
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public String getCity(){
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getState(){
         return state;
     }

     public void setState(String state) {
         this.state = state;
     }

     public String getzip(){
         return zip;
     }

     public void setZip(String zip) {
         this.zip = zip;
     }

     public String getPhoneNumber() {
         return phoneNumber;
     }

     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }

     Scanner sc = new Scanner(System.in);
     public void createContacts() {
         System.out.print(" Enter First Name : ");
         setFirstName(sc.nextLine());
         System.out.print(" Enter Last Name : ");
         setLastName(sc.nextLine());
         System.out.print(" Enter Address : ");
         setAddress(sc.nextLine());
         System.out.print(" Enter city : ");
         setCity(sc.nextLine());
         System.out.print(" Enter State : ");
         setState(sc.nextLine());
         System.out.print(" Enter Zip Code : ");
         setZip(sc.nextLine());
         System.out.print(" Enter Phone Number : ");
         setPhoneNumber(sc.nextLine());
         
     }
     
     

  
 }