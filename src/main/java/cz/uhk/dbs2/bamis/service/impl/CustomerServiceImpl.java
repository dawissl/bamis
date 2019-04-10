package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.CustomerRepository;
import cz.uhk.dbs2.bamis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

}
