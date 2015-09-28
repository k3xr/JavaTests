package factories;

import dataAccess.Customer;
import dataAccess.DataAccessSingleton;
import exceptions.NonExistingCustomer;

public class CustomerFactory {

	static public void updateCustomerBalance(int id) throws NonExistingCustomer {
		Customer myCustomer = DataAccessSingleton.getInstance().getCustomer(id);
		if (myCustomer == null)
			throw new NonExistingCustomer();
		else
			myCustomer.updateBalance();
	}
	
}
