package cz.uhk.dbs2.bamis.repository;

import cz.uhk.dbs2.bamis.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Sladecek
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
