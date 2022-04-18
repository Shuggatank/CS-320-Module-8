package project1;

public class Contact {
	private String contactID; //length <= 10
	private String firstName; //length <= 10 
	private String lastName; //length <= 10 
	private String phoneNumber; //length <= 10 
	private String address; //length <= 30
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID - null or length > 10");
		}
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name - null or length > 10");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name - null or length > 10");
		}
		if(phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number - null or length != 10");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address - null or length > 30");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	
	}
	
	public String getContactID() {
		return this.contactID;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return this.address;
	}

	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
