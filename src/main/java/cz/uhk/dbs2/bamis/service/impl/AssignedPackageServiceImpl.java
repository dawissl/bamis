package cz.uhk.dbs2.bamis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.dbs2.bamis.model.AssignedPackage;
import cz.uhk.dbs2.bamis.repository.AssignedPackageRepository;
import cz.uhk.dbs2.bamis.service.AssignedPackageService;

@Service
public class AssignedPackageServiceImpl implements AssignedPackageService {

	@Autowired
	AssignedPackageRepository assignedPackageRepository;
	
	@Override
	public List<AssignedPackage> loadAllAssignedPackages() {
		return assignedPackageRepository.findAll();
	}

}
