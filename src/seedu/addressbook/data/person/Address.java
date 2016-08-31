package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {
	/**
	 * These values represent the indices of string array storing different elements in the address,
	 * as well as the number of elements present in a valid address
	 */
	private static final int ELEMENTS_IN_ADDRESS = 4;
	private static final int BLOCK_INDEX = 0;
	private static final int STREET_INDEX = 1;
	private static final int UNIT_INDEX = 2;
	private static final int POSTAL_CODE_INDEX = 3;
		
    public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in the format BLOCK, STREET, UNIT, POSTAL_CODE";

    public String value;
    
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        parseAdress(address);
        if (!isValidAddress()) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
    }
    
    /**
     * Extracts the block, street, unit, postal code from the address given
     * 
     * @param address
     * @throws IllegalValueException
     */
    private void parseAdress(String address) throws IllegalValueException {
    	String[] parsedAddress = address.split(",");
    	if(parsedAddress.length < ELEMENTS_IN_ADDRESS) {
    		throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
    	}
    		
        this.block = new Block(parsedAddress[BLOCK_INDEX].trim());
        this.street = new Street(parsedAddress[STREET_INDEX].trim());
        this.unit = new Unit(parsedAddress[UNIT_INDEX].trim());
        this.postalCode = new PostalCode(parsedAddress[POSTAL_CODE_INDEX].trim());
	}

	/**
     * Returns true if a given string is a valid person address.
     */
    private boolean isValidAddress() {
        return block.isValid() && street.isValid() && unit.isValid() && postalCode.isValid();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}