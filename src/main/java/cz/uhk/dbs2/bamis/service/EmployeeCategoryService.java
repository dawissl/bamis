package cz.uhk.dbs2.bamis.service;


import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface EmployeeCategoryService {

	 List<EmployeeCategory> loadAllEmployeeCategories();

	 EmployeeCategory showEmployeeCategoryWithId (int id);

}
