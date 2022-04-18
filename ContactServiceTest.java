package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project1.Contact;
import project1.ContactService;

class ContactServiceTest {

	@Test
	void testAdd() {
		ContactService cs = new ContactService();
		Contact test = new Contact("1234567890", "Jon", "Smith", "5556667777", "1234 Maple Street");
		assertEquals(true,cs.addContact(test));
	}
	
	@Test
	public void testDelete() {
		
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1234567890", "Jon", "Smith", "5556667777", "1234 Maple Street");
		Contact test2 = new Contact("56988", "Jane", "Apple", "3338887777", "999 Drive Street");
		
		cs.addContact(test1);
		cs.addContact(test2);
		
		assertEquals(true,cs.deleteContact("1234567890"));
		assertEquals(true,cs.deleteContact("56988"));
		assertEquals(false,cs.deleteContact("56989"));
	}
	
	@Test
	public void testUpdate() {
		ContactService cs = new ContactService();
		Contact test1 = new Contact("1234567890", "Jon", "Smith", "5556667777", "1234 Maple Street");
		Contact test2 = new Contact("56988", "Jane", "Apple", "3338887777", "999 Drive Street");
		
		cs.addContact(test1);
		cs.addContact(test2);
		
		assertEquals(true, cs.updateContact("1234567890", "Adam", "Johnson", "5556667777", "1234 Maple Street"));
		assertEquals(false, cs.updateContact("1234567", "Adam", "Johnson", "5556667777", "1234 Maple Street"));
		
	}

}
