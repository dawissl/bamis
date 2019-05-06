package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.repository.EmployeeRepository;
import cz.uhk.dbs2.bamis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> loadAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee showEmployeeWithId(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void removeEmployeeWithId(int id) {
        employeeRepository.deleteById(id);
    }
}
