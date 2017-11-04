package accountManager.factories;

import static org.junit.Assert.*;

import accountManager.dataAccess.DataAccessSingletonDouble;
import accountManager.exceptions.NonExistingCustomer;
import org.junit.Test;

public class CustomerFactoryTest {

	@Test
	public void cliente1TieneBalenceCeroDespuesDeProcesamiento() throws NonExistingCustomer {

		DataAccessSingletonDouble d = new DataAccessSingletonDouble();
		CustomerFactory.definirObjetoAccesoABD(d);
		CustomerFactory.updateCustomerBalance(1);
		assertEquals(0.0, d.getCustomer(1).getBalance(), 0.01);
	}

}
