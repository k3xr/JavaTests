package accountManager.factories;

import accountManager.dataAccess.Customer;
import accountManager.dataAccess.DataAccessSingleton;
import accountManager.exceptions.NonExistingCustomer;

public class CustomerFactory {
	
	static DataAccessSingleton objeto;

	static public void definirObjetoAccesoABD(DataAccessSingleton objetoInyectado){
		objeto = objetoInyectado;
	}
	
	static public void updateCustomerBalance(int id) throws NonExistingCustomer {
		Customer myCustomer = objeto.getCustomer(id);
		if (myCustomer == null)
			throw new NonExistingCustomer();
		else
			myCustomer.updateBalance();
	}
}
