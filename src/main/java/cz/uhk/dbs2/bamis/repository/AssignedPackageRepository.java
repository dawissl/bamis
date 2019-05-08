package cz.uhk.dbs2.bamis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.uhk.dbs2.bamis.model.AssignedPackage;

public interface AssignedPackageRepository extends JpaRepository<AssignedPackage, Integer> {

}
