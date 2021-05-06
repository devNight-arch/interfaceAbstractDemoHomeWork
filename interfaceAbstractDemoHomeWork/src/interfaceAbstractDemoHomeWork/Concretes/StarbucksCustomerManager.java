package interfaceAbstractDemoHomeWork.Concretes;

import interfaceAbstractDemoHomeWork.Abstracts.BaseCustomerManager;
import interfaceAbstractDemoHomeWork.Abstracts.CustomerCheckService;
import interfaceAbstractDemoHomeWork.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	 CustomerCheckService customerCheckService;
	 public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		 this.customerCheckService = customerCheckService;
	 }
	 
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			save(customer);
		}else {
			new Exception("No a valid person");
		} 
	
	} 
	
}
