package day2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test public void
	input_1_should_be_1() {
		assertEquals("1", fizzBuzz.getResult(1));
	}
	
	@Test public void
	input_2_should_be_2() {
		assertEquals("2", fizzBuzz.getResult(2));
	}
	
	@Test public void
	input_3_should_be_Fizz() {
		assertEquals("Fizz", fizzBuzz.getResult(3));
	}
	
	@Test public void
	input_5_should_be_Buzz() {
		assertEquals("Buzz", fizzBuzz.getResult(5));
	}
	
	@Test public void
	input_6_should_be_Fizz() {
		assertEquals("Fizz", fizzBuzz.getResult(6));
	}
	
	@Test public void
	input_10_should_be_Buzz() {
		assertEquals("Buzz", fizzBuzz.getResult(10));
	}
	
	@Test public void
	input_15_should_be_FizzBuzz() {
		assertEquals("FizzBuzz", fizzBuzz.getResult(15));
	}
	
	@Test
	public void
	input_7_should_be_Wow() {
		assertEquals("Wow", fizzBuzz.getResult(7));
	}

}
