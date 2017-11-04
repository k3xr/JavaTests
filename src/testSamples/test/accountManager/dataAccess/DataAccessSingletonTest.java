package accountManager.dataAccess;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataAccessSingletonTest {
	
	@Test
	public void seRetornaElCliente1() {
		DataAccessSingletonDouble dtest = new DataAccessSingletonDouble();
		Customer c = dtest.getCustomer(1);
		assertSame(1, c.getId());
	}

}
