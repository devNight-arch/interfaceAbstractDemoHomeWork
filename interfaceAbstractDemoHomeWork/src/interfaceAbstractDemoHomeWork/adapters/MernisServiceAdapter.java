package interfaceAbstractDemoHomeWork.adapters;

import interfaceAbstractDemoHomeWork.Abstracts.CustomerCheckService;
import interfaceAbstractDemoHomeWork.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService  {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
	}

}
