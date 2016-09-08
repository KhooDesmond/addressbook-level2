package seedu.addressbook.common;

import static org.junit.Assert.*;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilsTest {
	/**
	 * test isAnyNull method
	 */
	@Test
	public void testSingleNullObject() {
		Object test = null;
		assertTrue(Utils.isAnyNull(test));
	}

	@Test
	public void testSingleStringObject() {
		Object test = "hello";
		assertFalse(Utils.isAnyNull(test));
	}
	
	@Test
	public void testListOfObjects() {
		List<Object> testObjects = new ArrayList<Object>();
		int testInt = 92292;
		String testString = "helloWorld";
		assertFalse(Utils.isAnyNull(testObjects,testInt,testString));
	}
	
	@Test
	public void testListOfObjects2() {
		List<Object> testObjects = new ArrayList<Object>();
		Integer testInt = null;
		String testString = "helloWorld";
		
		assertTrue(Utils.isAnyNull(testObjects, testInt, testString));
	}
	
	/**
	 * test elementsAreUnique method
	 */
	@Test
	public void testUniqueCollection() {
		List<Object> testObjects = new ArrayList<Object>();
		testObjects.add("helloWorld");
		testObjects.add((int) 1);
		testObjects.add("goodbyeWorld");
		assertTrue(Utils.elementsAreUnique(testObjects));
	}
	
	@Test
	public void testNonUniqueCollection() {
		List<Object> testObjects = new ArrayList<Object>();
		testObjects.add("helloWorld");
		testObjects.add((int) 1);
		testObjects.add("helloWorld");

		assertFalse(Utils.elementsAreUnique(testObjects));
	}
	
	@Test
	public void testSingleCollection() {
		List<Object> testObjects = new ArrayList<Object>();
		testObjects.add("helloWorld");
		assertTrue(Utils.elementsAreUnique(testObjects));
	}

}
