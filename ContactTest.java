package test;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import project1.Contact;

class ContactTest {
	  protected String contactId, firstNameTest, lastNameTest, phoneNumberTest,
      addressTest;
	  protected String tooLongContactId, tooLongFirstName, tooLongLastName,
      tooLongPhoneNumber, tooShortPhoneNumber, tooLongAddress;
	  
	  
	  @BeforeEach
	  void initialValues() {
	    contactId = "1029F847A6";
	    firstNameTest = "John";
	    lastNameTest = "Smith";
	    phoneNumberTest = "5553331234";
	    addressTest = "1 First Los Angeles CA 90210";
	    tooLongContactId = "112233445566778899";
	    tooLongFirstName = "John Jacob Jingle";
	    tooLongLastName = "-heimer Schmidt";
	    tooLongPhoneNumber = "55512341234";
	    tooShortPhoneNumber = "1234567";
	    tooLongAddress = "1 Audrey Zapp Drive, Jersey City, NJ 07305";
	  }
	  
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(tooLongContactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
		});
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(null, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
		});
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, tooLongFirstName, lastNameTest, phoneNumberTest, addressTest);
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, null, lastNameTest, phoneNumberTest, addressTest);
		});
	}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, tooLongLastName, phoneNumberTest, addressTest);
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, null, phoneNumberTest, addressTest);
		});
	}
	
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, lastNameTest, tooLongPhoneNumber, addressTest);
		});
	}
	
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, lastNameTest, tooShortPhoneNumber, addressTest);
		});
	}
	
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, lastNameTest, null, addressTest);
		});
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, tooLongAddress);
		});
	}

	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()-> {
			new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, null);
		});
	}

	

  @Test
  void allTheProperThingsConstructorTest() {
    Contact contact = new Contact(contactId, firstNameTest, lastNameTest,
                                  phoneNumberTest, addressTest);
    assertAll(
              ()
                  -> assertEquals(contactId, contact.getContactID()),
              ()
                  -> assertEquals(firstNameTest, contact.getFirstName()),
              ()
                  -> assertEquals(lastNameTest, contact.getLastName()),
              ()
                  -> assertEquals(phoneNumberTest, contact.getPhoneNumber()),
              ()  
              	  -> assertEquals(addressTest, contact.getAddress()));
  }

  @Test
  void updateFirstNameTest() {
    Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
    assertEquals(firstNameTest, contact.getFirstName());
  }

  @Test
  void updateLastNameTest() {
    Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
    contact.setLastName(lastNameTest);
    assertEquals(lastNameTest, contact.getLastName());
  }

  @Test
  void updatePhoneNumberTest() {
    Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
    contact.setPhoneNumber(phoneNumberTest);
    assertEquals(phoneNumberTest, contact.getPhoneNumber());
  }

  @Test
  void updateAddressTest() {
    Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
    contact.setAddress(addressTest);
    assertEquals(addressTest, contact.getAddress());
  }

  @Test
  void updateContactIdTest() {
    Contact contact = new Contact(contactId, firstNameTest, lastNameTest, phoneNumberTest, addressTest);
    contact.setContactID(contactId);
    assertEquals(contactId, contact.getContactID());
  }
}
