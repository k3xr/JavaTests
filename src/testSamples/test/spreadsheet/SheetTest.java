package spreadsheet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetTest {

	@Test
	public void setCellA1to1() {
		Sheet s = new Sheet();
		s.set("A1", "1");		
		assertEquals("1", s.get("A1"));
	}
	
	@Test
	public void setCellA10to3plus2() {
		Sheet s = new Sheet();
		s.set("A10", "3+2");		
		assertEquals("3+2", s.get("A10"));
	}
	
	@Test
	public void evaluateSimpleNumberCell() {
		Sheet s = new Sheet();
		s.set("A1", "20");		
		assertEquals("20", s.evaluate("A1"));
	}
	
	@Test
	public void evaluateSimpleFormulaPlus() {
		Sheet s = new Sheet();
		s.set("A1", "=1+2");		
		assertEquals("3", s.evaluate("A1"));
	}
	
	@Test
	public void evaluateSimpleFormulaMinus() {
		Sheet s = new Sheet();
		s.set("A1", "=3-2");		
		assertEquals("1", s.evaluate("A1"));
	}
	
	@Test
	public void evaluateComplexFormula() {
		Sheet s = new Sheet();
		s.set("A1", "=3-2*8");		
		assertEquals("8", s.evaluate("A1"));
	}
	
	@Test
	public void evaluateComplexFormula2() {
		Sheet s = new Sheet();
		s.set("A1", "=3-2*8*1*2/4");		
		assertEquals("4", s.evaluate("A1"));
	}
	
	@Test
	public void testDivBy0() {
		Sheet s = new Sheet();
		s.set("A1", "=3/0");		
		assertEquals("Error", s.evaluate("A1"));
	}
	
	@Test
	public void testDivBy0_2() {
		Sheet s = new Sheet();
		s.set("A1", "=3*1/0");		
		assertEquals("Error", s.evaluate("A1"));
	}
	

}
