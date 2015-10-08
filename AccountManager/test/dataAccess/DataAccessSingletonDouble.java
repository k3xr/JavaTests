package dataAccess;

import java.util.Vector;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

//Clase hija de la clase a testear
public class DataAccessSingletonDouble extends DataAccessSingleton{
	
	@Override
	Vector <Customer> fakeDatabaseLoader() throws ParseException {			
		Vector<Customer> vc = new Vector<Customer>();
		Vector <Order> vo = new Vector <Order>();
		Order o = new Order(100.0, true, false);
		vo.add(o);
		Customer c = new Customer(1, 100.0, vo);
		vc.add(c);
		return vc;
	}
}