package interfaceAbstractDemoHomeWork.Entities;

import interfaceAbstractDemoHomeWork.Abstracts.CustomerService;

public class Customer implements CustomerService {
private int id;
private String firstName;
private String nationalityId;

@Override
public void save(Customer customer) {
	// TODO Auto-generated method stub
	
}

public Customer(int id, String firstName, String nationalityId) {
	
	this.id = id;
	this.firstName = firstName;
	this.nationalityId = nationalityId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getNationalityId() {
	return nationalityId;
}

public void setNationalityId(String nationalityId) {
	this.nationalityId = nationalityId;
}
}
