import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
	private ContactService contactService;
	private Contact contact;
	
	@BeforeEach
	void setUp() {
		contactService = new ContactService();
		contact = new Contact("123", "Angel", "Rivera", "1234567890", "123 Main Street");
	}
	
	@Test
	void testAddContactSuccessfully() {
	    contactService.addContact(contact);	
	    
	    Contact savedContact = contactService.getContact("123");
	    
	    assertEquals("Angel", savedContact.getFirstName());
	    assertEquals("Rivera", savedContact.getLastName());
	    assertEquals("1234567890", savedContact.getPhone());
	    assertEquals("123 Main Street", savedContact.getAddress());
	}
	
	@Test
	void testAddDuplicateContactIdThrowsException() {
		contactService.addContact(contact);
		
		Contact duplicateContact = new Contact("123", "John", "Smith", "0987654321", "456 Main Street");
		
		assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(duplicateContact);
		});
	}

	@Test
	void testDeleteContactSuccessfully() {
		contactService.addContact(contact);
		contactService.deleteContact("123");
		
		assertThrows(IllegalArgumentException.class, () -> {
			contactService.getContact("123");
		});
	}
	
	@Test
	void testDeleteContactThatDoesNotExistThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			contactService.deleteContact("999");
		});
	}
	
	@Test
	void testUpdateFirstNameSuccessfully() {
		contactService.addContact(contact);
		contactService.updateFirstName("123", "John");
		
		assertEquals("John", contactService.getContact("123").getFirstName());
    }

	@Test
	void testUpdateLastNameSuccessfully() {
		contactService.addContact(contact);
		contactService.updateLastName("123", "Smith");
		
		assertEquals("Smith", contactService.getContact("123").getLastName());
    }

    @Test
    void testUpdatePhoneSuccessfully() {
	    contactService.addContact(contact);
	    contactService.updatePhone("123", "0987654321");
	
	    assertEquals("0987654321", contactService.getContact("123").getPhone());      
    }
    
    @Test
    void testUpdateAddressSuccessfully() {
	    contactService.addContact(contact);
	    contactService.updateAddress("123", "456 Main Street");
	
	    assertEquals("456 Main Street", contactService.getContact("123").getAddress());
    }
    
    @Test
    void testUpdateInvalidFirstNameThrowsException() {
    	contactService.addContact(contact);
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    		contactService.updateFirstName("123", "LongFirstName");
    	});
    }
	
    @Test
    void testUpdateInvalidPhoneThrowsException() {
    	contactService.addContact(contact);
    	
    	assertThrows(IllegalArgumentException.class, () -> {
    		contactService.updatePhone("123", "12345");
    	});
    }
    
    @Test
    void testUpdateContactThatDoesNotExistThrowsException() {
    	assertThrows(IllegalArgumentException.class, () -> {
    		contactService.updateFirstName("999", "John");
    	});
    }
}