import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	void testContactCreatedSuccessfully() {
		Contact contact = new Contact("1234567890", "Angel", "Rivera", "1234567890", "123 Main Street");
	
	    assertEquals("1234567890", contact.getContactId());
	    assertEquals("Angel", contact.getFirstName());
	    assertEquals("Rivera", contact.getLastName());
	    assertEquals("1234567890", contact.getPhone());
	    assertEquals("123 Main Street", contact.getAddress());
	}
	
	@Test
	void testContactIdCannotBeNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Angel", "Rivera", "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testContactIdCannotBeLongerThanTenCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Angel", "Rivera", "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testFirstNameCannotBeNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", null, "Rivera", "1234567890", "123 Main Street");
		});
    }
	
	@Test
	void testFirstNameCannotBeLongerThanTenCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "LongFirstName", "Rivera", "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testLastNameCannotBeNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", null, "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testLastNameCannotBeLongerThanTenCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", "VeryLongLastName", "1234567890", "123 Main Street");
		});
	}
	
	@Test
	void testPhoneCannotBeNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", "Rivera", null, "123 Main Street");
		});
	}
	
	@Test
	void testPhoneMustBeExactlyTenDigits() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", "Rivera", "12345", "123 Main Street");
		});
	}
	
	@Test
	void testPhoneMustContainOnlyDigits() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", "Rivera", "12345abcde", "123 Main Street");
		});
	}
	
	@Test
	void testAddressCannotBeNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", "Rivera", "1234567890", null);
		});
	}
		
	@Test
	void testAddressCannotBeLongerThanThirtyCharacters() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123", "Angel", "Rivera", "1234567890", "12334567890123345678901233456789012334567890");
		});
	}
}