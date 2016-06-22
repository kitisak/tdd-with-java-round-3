package workshop01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircularBufferTest {
	
	CircurlarBuffer circurlarBuffer = 
			new CircurlarBuffer(); 
	
	@Test(expected=BufferEmptyException.class)
	public void 
	should_throw_BufferEmptyException_when_read_empty_buffer2() {
		circurlarBuffer.read();
	}
	
	@Test
	public void 
	should_throw_BufferEmptyException_when_read_empty_buffer() {
		try {
			circurlarBuffer.read();
			fail("Buffer not empty");
		}catch(BufferEmptyException e) {
			//TODO
		}
	}
	
	
	@Test
	public void addA(){
		circurlarBuffer.add("A");
		String actualResult = circurlarBuffer.read();
		assertEquals("A", actualResult);
	}
	
	@Test
	public void addB(){
		circurlarBuffer.add("B");
		String actualResult = circurlarBuffer.read();
		assertEquals("B", actualResult);
	}
	
	@Test
	public void addAB(){
		circurlarBuffer.add("A");
		circurlarBuffer.add("B");
		assertEquals("A", circurlarBuffer.read());
		assertEquals("B", circurlarBuffer.read());
	}
	
	@Test public void 
	buffer_should_be_full() {
		circurlarBuffer.add("A");
		circurlarBuffer.add("B");
		circurlarBuffer.add("C");
		circurlarBuffer.add("D");
		circurlarBuffer.add("E");
		assertTrue("Buffer not full", circurlarBuffer.isFull());
	}
	
	@Test public void
	buffer_should_be_not_full() {
		circurlarBuffer.add("A");
		circurlarBuffer.add("B");
		circurlarBuffer.add("C");
		circurlarBuffer.add("D");
		assertFalse("Buffer is full", circurlarBuffer.isFull());
	}
	
	
	
	

}