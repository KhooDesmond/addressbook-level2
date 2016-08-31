package seedu.addressbook.data.person;

/**
 * Represents a Person's unit in the address
 *
 */
public class Unit {
	private static final String UNIT_VALIDATION_REGEX = ".+";
	
	private final String value;
	
	public Unit(String value) {
		this.value = value;
	}
	
	public boolean isValid() {
		return value.matches(UNIT_VALIDATION_REGEX);
	}
}
