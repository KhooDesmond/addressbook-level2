package seedu.addressbook.data.person;

/**
 * Represents a Person's postal code in the address
 *
 */
public class PostalCode {
	private static final String POSTAL_CODE_VALIDATION_REGEX = "\\d+";
	
	private final String value;
	
	public PostalCode(String value) {
		this.value = value;
	}

	public boolean isValid() {
		return value.matches(POSTAL_CODE_VALIDATION_REGEX);
	}
}
