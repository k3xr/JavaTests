import static org.junit.Assert.*;

import org.junit.Test;

public class MineFieldTest {

	@Test
	public void twoMines4x3() {
		assertEquals("*21112*10111", MineField.hintField("*.....*.....",4,3));
	}

	@Test
	public void oneMine4x3() {
		assertEquals("*10011000000", MineField.hintField("*...........",4,3));
	}

	@Test
	public void threeMines4x3() {
		assertEquals("12321***1232", MineField.hintField(".....***....",4,3));
	}
	
	@Test
	public void fourMines4x3() {
		assertEquals("2332****2332", MineField.hintField("....****....",4,3));
	}
	
	@Test
	public void noMines4x3() {
		assertEquals("000000000000", MineField.hintField("............",4,3));
	}
	
	@Test
	public void fullMines4x3() {
		assertEquals("************", MineField.hintField("************",4,3));
	}
	
	@Test
	public void sixMines4x3() {
		assertEquals("2**23**32**2", MineField.hintField(".**..**..**.",4,3));
	}
	
	@Test
	public void size3x3() {
		assertEquals("1111*1111", MineField.hintField("....*....",3,3));
	}
	
	@Test
	public void twoMinesSize3x3() {
		assertEquals("*212*1111", MineField.hintField("*...*....",3,3));
	}
	
	@Test
	public void size1x1() {
		assertEquals("*", MineField.hintField("*",1,1));
	}
	
	@Test
	public void size1x1Empty() {
		assertEquals("0", MineField.hintField(".",1,1));
	}

}
