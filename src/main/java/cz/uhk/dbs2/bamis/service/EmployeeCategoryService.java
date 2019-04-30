package cz.uhk.dbs2.bamis.service;


import cz.uhk.dbs2.bamis.model.EmployeeCategory;
import cz.uhk.dbs2.bamis.model.Good;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface EmployeeCategoryService {

	@Transactional
	void addEmployeeCategory(EmployeeCategory employeeCategory);

	 List<EmployeeCategory> loadAllEmployeeCategories();

	 EmployeeCategory showEmployeeCategoryWithId (int id);

	 void addEmployeeCategory(EmployeeCategory employeeCategory);

}
