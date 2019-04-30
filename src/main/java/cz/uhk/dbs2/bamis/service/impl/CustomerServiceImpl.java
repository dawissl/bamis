package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.Customer;
import cz.uhk.dbs2.bamis.repository.CustomerRepository;
import cz.uhk.dbs2.bamis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> loadAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer showCustomerWithId(int id) {
        return customerRepository.findById(id).get();
    }

}
