package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Customer;
import cz.uhk.dbs2.bamis.model.Employee;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.List;


/**
 * @author David Sladecek
 */
@Service
public interface CustomerService {
	@Transactional
	void addCustomer(Customer customer);

	 List<Customer> loadAllCustomers();

	 Customer showCustomerWithId (int id);
}
