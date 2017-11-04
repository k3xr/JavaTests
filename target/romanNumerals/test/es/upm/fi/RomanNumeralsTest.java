package es.upm.fi;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class RomanNumeralsTest {

	private int n;
	private String result;

	public RomanNumeralsTest(int n, String result) {
		this.n = n;
		this.result = result;
	}

	@Parameters(name = "Test {index} : RomanNumerals.numToRomans({1}) = {0}")
	public static Collection<Object[]> myData() {
		return Arrays.asList(new Object[][] { {-1, "Invalid input number"},
				{0, "Invalid input number"},
				{4000, "Invalid input number"},
				{5, "V"},
				{3, "III"}, 
				{7, "VII"},
				{4, "IV"},
				{10, "X"},
				{11, "XI"},
				{14, "XIV"},
				{19, "XIX"},
				{21, "XXI"},
				{49, "XLIX"},
				{51, "LI"},
				{900, "CM"},
				{1846, "MDCCCXLVI"},
				{3107, "MMMCVII"},
				{3444, "MMMCDXLIV"},
				{3999, "MMMCMXCIX"}});
	}

	@Test
	public void checkValue(){
		assertEquals(result, RomanNumerals.numToRomans(n));
	}
}
