package seedu.addressbook.parser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameIsSimilarTest {

	
	@Test
	public void test1() throws IllegalValueException {
		Name p1 = new Name("John");
		Name p2 = new Name("John");
	
		assertTrue(p2.isSimilar(p1));
	}
	
	@Test
	public void test2() throws IllegalValueException {
		Name p1 = new Name("John");
		Name p2 = new Name("Saufi");
	
		assertFalse(p1.isSimilar(p2));
	}
	
	@Test
	public void test3() throws IllegalValueException {
		Name p1 = new Name("John");
		Name p2 = new Name("john");
	
		assertTrue(p1.isSimilar(p2));
	}
	@
	Test
	public void test4() throws IllegalValueException {
		Name p1 = new Name("John");
	
		assertFalse(p1.isSimilar(null));
	}
}
