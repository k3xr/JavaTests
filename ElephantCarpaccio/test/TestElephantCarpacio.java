import static org.junit.Assert.*;

import org.junit.Test;


public class TestElephantCarpacio {

	@Test
	public void testUTMenos1000() {
		assertEquals(534.25, ElephantCarpacio.calculaValor(1,500,"UT"),0.001);
	}
	
	@Test
	public void testCAMenos1000(){
		assertEquals(541.25, ElephantCarpacio.calculaValor(1,500,"CA"), 0.001);
	}
	
	@Test
	public void testTXMas1000(){
		assertEquals(1545.94, ElephantCarpacio.calculaValor(3,500,"TX"), 0.01);
	}
	
	@Test
	public void testALMas5000(){
		assertEquals(4940.0, ElephantCarpacio.calculaValor(5,1000,"AL"), 0.01);
	}
	
	@Test
	public void testTXMas7000(){
		assertEquals(6916.87, ElephantCarpacio.calculaValor(7,1000,"TX"), 0.01);
	}

}
