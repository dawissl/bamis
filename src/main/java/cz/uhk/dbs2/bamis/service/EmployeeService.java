package cz.uhk.dbs2.bamis.service;
import cz.uhk.dbs2.bamis.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface EmployeeService {

	 List<Employee> loadAllEmployees();

	 Employee showEmployeeWithId (int id);

	 void addEmployee(Employee employee);
}
