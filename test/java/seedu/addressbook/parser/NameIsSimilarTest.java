package seedu.addressbook.parser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameIsSimilarTest {

	
	@Test
	public void test1() throws IllegalValueException {
		Name p2 = new Name("John");
		Name p3 = new Name("John");
	
		assertTrue(p2.isSimilar(p3));
	}
	
}
