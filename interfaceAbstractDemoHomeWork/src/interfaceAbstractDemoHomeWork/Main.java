package interfaceAbstractDemoHomeWork;

import interfaceAbstractDemoHomeWork.Abstracts.BaseCustomerManager;
import interfaceAbstractDemoHomeWork.Concretes.NeroCustomerManager;import interfaceAbstractDemoHomeWork.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager  = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Efe", "12345678901") );
	}

	
	}


