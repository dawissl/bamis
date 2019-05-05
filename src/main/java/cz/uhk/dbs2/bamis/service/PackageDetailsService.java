package cz.uhk.dbs2.bamis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cz.uhk.dbs2.bamis.model.PackageDetails;

@Service
public interface PackageDetailsService {
	
	@Transactional
	List<PackageDetails> loadAllPackageDetails();

}
