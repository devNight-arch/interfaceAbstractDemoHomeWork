package interfaceAbstractDemoHomeWork.Concretes;

import interfaceAbstractDemoHomeWork.Abstracts.CustomerCheckService;
import interfaceAbstractDemoHomeWork.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;		
	}

	
	

}
