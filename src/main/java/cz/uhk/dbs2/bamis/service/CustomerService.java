package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface CustomerService {

	 List<Customer> loadAllCustomers();

	 Customer showCustomerWithId (int id);

	 void addCustomer(Customer customer);
}
