package stringCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

	@Test
	public void empty() {
		assertEquals(0,StringCalculator.Add(""));
	}

	@Test
	public void singleNumber() {
		assertEquals(2,StringCalculator.Add("2"));
	}

	@Test
	public void commaSeparated2() {
		assertEquals(3,StringCalculator.Add("1,2"));
	}

	@Test
	public void commaSeparated3() {
		assertEquals(9,StringCalculator.Add("1,2,6,0"));
	}

	@Test
	public void commaSeparatedNegative() {
		assertEquals(5,StringCalculator.Add("1,-2,6,0"));
	}
	
	@Test
	public void characterSeparated() {
		assertEquals(3,StringCalculator.Add(";\n1;2"));
	}
	
	@Test
	public void characterSeparatedNegative() {
		assertEquals(-1,StringCalculator.Add(";\n1;-2"));
	}
	
	@Test
	public void stringSeparated() {
		assertEquals(11,StringCalculator.Add("separator\n1separator5separator5"));
	}
	
	@Test
	public void stringSeparated2() {
		assertEquals(10,StringCalculator.Add("-\n0-5-5"));
	}
	
	@Test
	public void wrongSeparator() {
		assertEquals(0,StringCalculator.Add("separator\n1;5;5"));
	}
	
	@Test
	public void wrongSeparator2() {
		assertEquals(0,StringCalculator.Add("separator\n1,5,5"));
	}
	
	@Test
	public void wrongSeparator3() {
		assertEquals(0,StringCalculator.Add("\n\n1\n5"));
	}

}
