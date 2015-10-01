package dataAccess;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Vector;

import org.junit.Test;

public class DataAccessSingletonTest {
	
	// Clase hija de la clase a testear
	public class DataAccessSingletonDouble extends DataAccessSingletonTest{
		public DataAccessSingletonDouble(){
			super();
		}
		
		@Override
		private Vector <Customer> fakeDatabaseLoader() throws ParseException {
			Customer c = new Customer(1, 100.0, null);
			Vector<Customer> customers = new Vector<Customers>();
			customers.add(c);
			return null;
		}
	}

	@Test
	public void encuentraUnClienteExistente() {
		DataAccessSingleton d = DataAccessSingleton.getInstance();
		Customer c = new Customer(1, 100.0, null);
		assertSame(c, d.getCustomer(1));
		fail("Not yet implemented");
	}

}
