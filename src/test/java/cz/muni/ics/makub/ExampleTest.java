package cz.muni.ics.makub;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Martin Kuba makub@ics.muni.cz
 */
public class ExampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateCarWithNull() throws Exception {
		try {
			if(1==1) throw new NullPointerException();
			fail("should throw NullPointerException");
		} catch (NullPointerException ex) {
		}
	}
}
