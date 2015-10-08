package factories;

import static org.junit.Assert.*;

import org.junit.Test;

import dataAccess.DataAccessSingletonDouble;
import exceptions.NonExistingCustomer;

public class CustomerFactoryTest {

	@Test
	public void cliente1TieneBalenceCeroDespuesDeProcesamiento() throws NonExistingCustomer {
		
		DataAccessSingletonDouble d = new DataAccessSingletonDouble();
		CustomerFactory.definirObjetoAccesoABD(d);
		CustomerFactory.updateCustomerBalance(1);
		assertEquals(0.0, d.getCustomer(1).getBalance(), 0.01);
	}

}
