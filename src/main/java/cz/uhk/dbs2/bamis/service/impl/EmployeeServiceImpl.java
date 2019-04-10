package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.EmployeeRepository;
import cz.uhk.dbs2.bamis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
}
