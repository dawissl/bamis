package cz.uhk.dbs2.bamis.repository;

import cz.uhk.dbs2.bamis.model.EmployeeCategory;
import cz.uhk.dbs2.bamis.model.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Sladecek
 */
@Repository
public interface EmployeeCategoryRepository extends JpaRepository<EmployeeCategory,Integer> {

}
