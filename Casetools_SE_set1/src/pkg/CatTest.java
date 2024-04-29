package pkg;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatTest {
	
	static Cat ob;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ob=new Cat("John","Blue");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetColour() {
		String results,expected;
		expected="Blue";
		results=ob.getColour();
		assertEquals(expected,results);
	}

	@Test
	void testGetName() {
		String results,expected;
		expected="John";
		results=ob.getName();
		assertEquals(expected,results);
 
	}

}
