import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down");
	}

	@Test
	public void test() {
		assertTrue(true);
		System.out.println("This is a sample change statement.");
	}
	
	@Test
	public void test2() {
		assertTrue(true);
		System.out.println("This is another test added via github for Jenkins Build testing.");
	}

}
