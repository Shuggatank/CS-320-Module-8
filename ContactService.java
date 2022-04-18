package project1;

import java.util.ArrayList;


public class ContactService {
	private ArrayList<Contact> contactList;
    public ContactService() {
        contactList = new ArrayList<>();
    }
    
    //adding a contact
    public boolean addContact(Contact contact) {
        boolean contactExist = false;
        //checks if contact exist
        for(Contact search:contactList) {
            if(search.equals(contact)) {
                contactExist = true;
            }
        }
        if(!contactExist) {
            contactList.add(contact);
            return true;
        }
        else {
            return false;
        }
    }
    
    //deleting a contact
    public boolean deleteContact(String contactID) {
    //checks to see if contact id exist
        for(Contact search:contactList) {
            if(search.getContactID().equals(contactID)) {
                contactList.remove(search);
                return true;
            }
        }
        return false;
    }
    
    //update contact list
    public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        for(Contact search:contactList) {
            if(search.getContactID().equals(contactID)) {
            //checks & update first name
                if(!firstName.equals("") && !(firstName.length() > 10)) {
                    search.setFirstName(firstName);
                }
            //checks & update last name
                if(!lastName.equals("") && !(lastName.length() > 10)) {
                    search.setLastName(lastName);
                }
            //checks & update phone number
                if(!phoneNumber.equals("") && !(phoneNumber.length() > 10)) {
                    search.setPhoneNumber(phoneNumber);
                }
            //checks & update address
                if(!address.equals("") && !(address.length() > 30)) {
                    search.setAddress(address);
                }
                return true;
            } //end main if statement
        } //end of loop
        return false;
    } //end of updateContact
}
