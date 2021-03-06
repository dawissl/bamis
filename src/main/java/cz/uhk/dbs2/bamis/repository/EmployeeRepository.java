package cz.uhk.dbs2.bamis.repository;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Sladecek
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
