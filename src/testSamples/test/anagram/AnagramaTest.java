package anagram;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramaTest {

	@Test
	public void UnaPalabraVacia() {
		Anagrama anagrama = new Anagrama();
		List<String[]> list = new ArrayList<String[]>();
		list.add(new String[]{"documenting", ""});
		List<String[]> list2 = anagrama.generarAnagrama("documenting");
		assertEquals("documenting",list2.get(0)[0]);
		assertEquals("",list2.get(0)[1]);
	}
}
