package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface CustomerService {
	
	 List<Customer> loadAllCustomers();

	 Customer showCustomerWithId (int id);
}
