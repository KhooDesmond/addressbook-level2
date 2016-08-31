package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address
 *
 */
public class Street {
	private static final String STREET_VALIDATION_REGEX = ".+";

	private final String value;
	
	public Street(String value) {
		this.value = value;
	}

	public boolean isValid() {
		return value.matches(STREET_VALIDATION_REGEX);
	}
}
