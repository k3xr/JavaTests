import static org.junit.Assert.*;

import org.junit.Test;

public class LCDDigitsTest {

	@Test
	public void number0() {
		LCDDigits l = new LCDDigits();
		assertEquals(" _ \n| |\n|_|\n", l.stringRepresentation(0));
	}
	@Test
	public void number7() {
		LCDDigits l = new LCDDigits();
		assertEquals(" _ \n  |\n  |\n", l.stringRepresentation(7));
	}
	@Test
	public void number9() {
		LCDDigits l = new LCDDigits();
		assertEquals(" _ \n|_|\n  |\n", l.stringRepresentation(9));
	}
	@Test
	public void number2() {
		LCDDigits l = new LCDDigits();
		assertEquals(" _ \n _|\n|_ \n", l.stringRepresentation(2));
	}
	@Test
	public void number12() {
		LCDDigits l = new LCDDigits();
		assertEquals("    _ \n  | _|\n  ||_ \n", l.stringRepresentation(12));
	}
	
	@Test
	public void number240() {
		LCDDigits l = new LCDDigits();
		System.out.println(l.stringRepresentation(240));
		System.out.println(l.row20+l.row40+l.row00+"\n"+
				l.row21+l.row41+l.row01+"\n"+
				l.row22+l.row42+l.row02+"\n");
		assertEquals(l.row20+l.row40+l.row00+"\n"+
				l.row21+l.row41+l.row01+"\n"+
				l.row22+l.row42+l.row02+"\n", l.stringRepresentation(240));
	}

}
