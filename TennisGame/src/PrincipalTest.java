import static org.junit.Assert.*;

import org.junit.Test;


public class PrincipalTest {
	

	@Test
	public void get_score_loveTest() {
		int number1 = 0;
		int number2 = 0;
		Principal p = new Principal();
		assertEquals("love - love",p.get_score(number1, number2));
	}

	@Test
	public void get_score_quinceloveTest() {
		int number1 = 1;
		int number2 = 0;
		Principal p = new Principal();
		assertEquals("fifteen - love",p.get_score(number1, number2));
	}
	
	@Test
	public void get_score_thirtyfortyTest() {
		int number1 = 2;
		int number2 = 3;
		Principal p = new Principal();
		assertEquals("thirty - forty",p.get_score(number1, number2));
	}
	
	@Test
	public void get_score_fortyfortyTest() {
		int number1 = 3;
		int number2 = 3;
		Principal p = new Principal();
		assertEquals("deuce",p.get_score(number1, number2));
	}
	@Test
	public void get_score_win1() {
		int number1 = 5;
		int number2 = 1;
		Principal p = new Principal();
		assertEquals("Gana 1",p.get_score(number1, number2));
	}
	
	@Test
	public void get_score_advantage1() {
		int number1 = 5;
		int number2 = 4;
		Principal p = new Principal();
		assertEquals("Ventaja 1",p.get_score(number1, number2));
	}
	
	@Test
	public void get_score_advantage1_2() {
		int number1 = 7;
		int number2 = 6;
		Principal p = new Principal();
		assertEquals("Ventaja 1",p.get_score(number1, number2));
	}

}
