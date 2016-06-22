package workshop01;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {
	Range range = new Range();
	
	@Test public void
	end_number_with_exclusive() {
		assertEquals(4, range.getEndNumber("[1,5)"));
	}
	
	@Test public void
	end_number_with_inclusive() {
		assertEquals(5, range.getEndNumber("[1,5]"));
	}
	
	@Test public void
	start_number_with_exclusive() {
		assertEquals(2, range.getStartNumber("(1,5]"));
	}
	
	@Test public void
	start_number_with_inclusive() {
		assertEquals(1, range.getStartNumber("[1,5]"));
	}
	
	@Test public void
	end_with_inclusive() {
		assertTrue( range.endWithInclusive("[1,5]") );
	}
	
	@Test public void
	end_with_exclusive() {
		assertFalse( range.endWithInclusive("[1,5)") );
	}
	
	@Test public void
	start_with_exclusive() {
		assertFalse( range.startWithInclusive("(1,5]") );
	}
	
	@Test public void
	start_with_inclusive() {
		assertTrue( range.startWithInclusive("[1,5]") );
	}
	
	@Test public void
	เอาหมด() {
		String actualResult = range.format("[1,5]");
		assertEquals("12345", actualResult);
	}

}
