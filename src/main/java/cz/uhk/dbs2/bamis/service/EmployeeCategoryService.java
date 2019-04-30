package cz.uhk.dbs2.bamis.service;


import cz.uhk.dbs2.bamis.model.EmployeeCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface EmployeeCategoryService {

	 List<EmployeeCategory> loadAllEmployeeCategories();

	 EmployeeCategory showEmployeeCategoryWithId (int id);

	 void addEmployeeCategory(EmployeeCategory employeeCategory);

}
