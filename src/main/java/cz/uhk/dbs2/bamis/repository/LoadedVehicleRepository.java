package cz.uhk.dbs2.bamis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.uhk.dbs2.bamis.model.LoadedVehicle;

public interface LoadedVehicleRepository extends JpaRepository<LoadedVehicle, String> {

}
