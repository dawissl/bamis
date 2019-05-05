package cz.uhk.dbs2.bamis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.uhk.dbs2.bamis.model.PackageDetails;
import cz.uhk.dbs2.bamis.repository.PackageDetailsRepository;
import cz.uhk.dbs2.bamis.service.PackageDetailsService;

@Service
public class PackageDetailsServiceImpl implements PackageDetailsService {

	@Autowired
	PackageDetailsRepository packageDetailsRepository;
	
	@Override
	public List<PackageDetails> loadAllPackageDetails() {
		return packageDetailsRepository.findAll();
	}

}
