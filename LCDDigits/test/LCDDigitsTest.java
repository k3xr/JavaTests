import static org.junit.Assert.*;

import org.junit.Test;

public class LCDDigitsTest {

	@Test
	public void number0() {
		LCDDigits l = new LCDDigits();
		assertEquals(l.row00+"\n"+l.row01+"\n"+l.row02+"\n", l.stringRepresentation(0));
	}
	@Test
	public void number7() {
		LCDDigits l = new LCDDigits();
		assertEquals(l.row70+"\n"+l.row71+"\n"+l.row72+"\n", l.stringRepresentation(7));
	}
	@Test
	public void number9() {
		LCDDigits l = new LCDDigits();
		assertEquals(l.row90+"\n"+l.row91+"\n"+l.row92+"\n", l.stringRepresentation(9));
	}
	@Test
	public void number2() {
		LCDDigits l = new LCDDigits();
		assertEquals(l.row20+"\n"+l.row21+"\n"+l.row22+"\n", l.stringRepresentation(2));
	}
	@Test
	public void number12() {
		LCDDigits l = new LCDDigits();
		assertEquals(l.row10+l.row20+"\n"+
				l.row11+l.row21+"\n"+
				l.row12+l.row22+"\n", l.stringRepresentation(12));
	}

	@Test
	public void number240() {
		LCDDigits l = new LCDDigits();		
		assertEquals(l.row20+l.row40+l.row00+"\n"+
				l.row21+l.row41+l.row01+"\n"+
				l.row22+l.row42+l.row02+"\n", l.stringRepresentation(240));
	}

	@Test
	public void number000() {
		LCDDigits l = new LCDDigits();		
		assertEquals(l.row00+"\n"+l.row01+"\n"+l.row02+"\n", l.stringRepresentation(000));
	}

	@Test
	public void number9999() {
		LCDDigits l = new LCDDigits();		
		assertEquals(l.row90+l.row90+l.row90+l.row90+"\n"+
				l.row91+l.row91+l.row91+l.row91+"\n"+
				l.row92+l.row92+l.row92+l.row92+"\n", l.stringRepresentation(9999));
	}

}
