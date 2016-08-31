package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address
 *
 */
public class Block {
	private static final String BLOCK_VALIDATION_REGEX = "\\d+";

	private final String value;
	
	public Block(String value) {
		this.value = value;
	}
	public boolean isValid() {
		return value.matches(BLOCK_VALIDATION_REGEX);
	}
}
