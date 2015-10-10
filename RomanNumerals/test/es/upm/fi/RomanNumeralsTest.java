package es.upm.fi;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void num5ToV() {
		
		assertEquals("V", RomanNumerals.numToRomans(5));
	}
	
	@Test
	public void num3ToIII() {
		
		assertEquals("III", RomanNumerals.numToRomans(3));
	}
	
	@Test
	public void num7ToVII() {
		
		assertEquals("VII", RomanNumerals.numToRomans(7));
	}

	@Test
	public void num4ToIV() {
		
		assertEquals("IV", RomanNumerals.numToRomans(4));
	}

}
