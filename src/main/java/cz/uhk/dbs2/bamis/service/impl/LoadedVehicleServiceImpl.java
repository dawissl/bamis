package cz.uhk.dbs2.bamis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.dbs2.bamis.model.LoadedVehicle;
import cz.uhk.dbs2.bamis.repository.LoadedVehicleRepository;
import cz.uhk.dbs2.bamis.service.LoadedVehicleService;

@Service
public class LoadedVehicleServiceImpl implements LoadedVehicleService {

	@Autowired
	LoadedVehicleRepository loadedVehicleRepository;
	@Override
	public List<LoadedVehicle> loadAllLoadedVehicles() {
		return loadedVehicleRepository.findAll();
	}

}
