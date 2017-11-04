import static org.junit.Assert.*;

import org.junit.Test;

public class IntervaloTest {

	@Test
	public void solapamientoCompletoTest() {
		Intervalo inter1 = new Intervalo('[',1,1,']');
		Intervalo inter2 = new Intervalo('[',1,1,']');

		assertTrue(inter1.contiene(inter2));
	}

	@Test
	public void noContieneExtremoDerechoTest() {
		Intervalo inter1 = new Intervalo('[',1,2,']');
		Intervalo inter2 = new Intervalo('[',1,4,']');

		assertFalse(inter1.contiene(inter2));
	}

	@Test
	public void noContieneExtremoIzquierdoTest() {
		Intervalo inter1 = new Intervalo('[',1,2,']');
		Intervalo inter2 = new Intervalo('[',0,2,']');

		assertFalse(inter1.contiene(inter2));
	}

	@Test
	public void diferenciaIzquierdaTest() {
		Intervalo inter1 = new Intervalo('[',0,3,']');
		Intervalo inter2 = new Intervalo('[',1,3,']');
		Intervalo interRes = new Intervalo('[',0,0,']');

		assertEquals(0, inter1.diferencia(inter2).compareTo(interRes));
	}

	@Test
	public void diferenciaDerechaTest() {
		Intervalo inter1 = new Intervalo('[',1,3,']');
		Intervalo inter2 = new Intervalo('[',1,2,']');
		Intervalo interRes = new Intervalo('[',3,3,']');

		assertEquals(0, inter1.diferencia(inter2).compareTo(interRes));
	}

	@Test
	public void diferenciaIzquierdaDosValoresTest() {
		Intervalo inter1 = new Intervalo('[',-1,3,']');
		Intervalo inter2 = new Intervalo('[',1,3,']');
		Intervalo interRes = new Intervalo('[',-1,0,']');

		assertEquals(0, inter1.diferencia(inter2).compareTo(interRes));
	}

	@Test
	public void diferenciaDerechaDosValoresTest() {
		Intervalo inter1 = new Intervalo('[',1,4,']');
		Intervalo inter2 = new Intervalo('[',1,2,']');
		Intervalo interRes = new Intervalo('[',3,4,']');

		assertEquals(0, inter1.diferencia(inter2).compareTo(interRes));
	}
	
	@Test
	public void solapamientoCompletoAbierto() {
		Intervalo inter1 = new Intervalo('(',1,3,')');
		Intervalo inter2 = new Intervalo('(',1,3,')');

		assertTrue(inter1.contiene(inter2));
	}
	
	@Test
	public void noSolapamientoAbierto() {
		Intervalo inter1 = new Intervalo('(',1,3,')');
		Intervalo inter2 = new Intervalo('(',1,4,')');

		assertFalse(inter1.contiene(inter2));
	}
	
	@Test
	public void noSolapamientoAbiertoYCerrado() {
		Intervalo inter1 = new Intervalo('(',1,3,')');
		Intervalo inter2 = new Intervalo('(',1,3,']');

		assertFalse(inter1.contiene(inter2));
	}
	
	@Test
	public void solapamientoAbiertoYCerrado() {
		Intervalo inter1 = new Intervalo('(',1,3,']');
		Intervalo inter2 = new Intervalo('(',1,3,')');

		assertTrue(inter1.contiene(inter2));
	}
	
	@Test
	public void diferenciaAbiertos() {
		Intervalo inter1 = new Intervalo('(',-5,1,']');
		Intervalo inter2 = new Intervalo('(',-4,-1,']');
		Intervalo interRes = new Intervalo('[',0,1,']');

		assertEquals(0, inter1.diferencia(inter2).compareTo(interRes));
	}
}
