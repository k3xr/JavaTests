import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
