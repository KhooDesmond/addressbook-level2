/**
 * 
 */
package seedu.addressbook;

import java.util.List;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 *Represent an adding or deleting of a tag for a specific person that happened during that session
 *
 */
public class Tagging {
	private static List<Tagging> taggingHistory;
	
    private Person person;
	private Tag tag;
	private boolean isAddition; //false if the tagging is tag deletion
	
	/**
	 * An add/delete tag command is parsed, and processed in the Command class, and passed to this class
	 * Validity checking of person and tag is done in the Command class
	 */
	public Tagging(Person person, Tag tag, boolean isAddition) {
		this.person = person;
		this.tag = tag;
		this.isAddition = isAddition;
		taggingHistory.add(this);
	}
	
	public Person getPerson() {
		return person;
	}
	
	public Tag getTag() {
		return tag;
	}
	
	public boolean isAddition() {
		return isAddition;
	}

	/**
	 * Returns the list of tagging during this session
	 */
	public List<Tagging> getTagHistory() {
		return taggingHistory;
	}
}
