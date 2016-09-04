/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * A read-only immutable interface for Name, Phone, Email, Address in the addressbook.
 *
 */
public interface Printable {

	/**
	  * Returns a concatenated version of the printable strings of each object.
	  */
	public String getPrintableString(Printable... printables);
}
