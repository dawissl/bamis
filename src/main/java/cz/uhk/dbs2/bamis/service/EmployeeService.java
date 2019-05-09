package cz.uhk.dbs2.bamis.service;
import cz.uhk.dbs2.bamis.model.Employee;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface EmployeeService {

	@Transactional
	void addEmployee(Employee employee);

	 List<Employee> loadAllEmployees();

	 Employee showEmployeeWithId (int id);

	@Transactional
	void removeEmployeeWithId(int id);

	void editEmployeeWithId(String id, Employee employee);
}
