package primeFactors;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import primeFactors.PrimeFactors;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

	@Test
	public void factors1isEmpty() {
		PrimeFactors pf = new PrimeFactors();
		List<Integer> primesList = new ArrayList<Integer>();
		assertEquals(primesList,pf.generate(1));
	}

	@Test
	public void factors2is2() {
		PrimeFactors pf = new PrimeFactors();
		List<Integer> primesList = new ArrayList<Integer>();
		primesList.add(2);
		assertEquals(primesList,pf.generate(2));
	}

	@Test
	public void factors10are5and2() {
		PrimeFactors pf = new PrimeFactors();
		List<Integer> primesList = new ArrayList<Integer>();
		primesList.add(5);
		primesList.add(2);
		assertEquals(primesList,pf.generate(10));
	}

	@Test
	public void factors20are5and2and2() {
		PrimeFactors pf = new PrimeFactors();
		List<Integer> primesList = new ArrayList<Integer>();
		primesList.add(5);
		primesList.add(2);
		primesList.add(2);
		assertEquals(primesList,pf.generate(20));
	}

	@Test
	public void factors22are11and2() {
		PrimeFactors pf = new PrimeFactors();
		List<Integer> primesList = new ArrayList<Integer>();
		primesList.add(11);
		primesList.add(2);
		assertEquals(primesList,pf.generate(22));
	}
}
