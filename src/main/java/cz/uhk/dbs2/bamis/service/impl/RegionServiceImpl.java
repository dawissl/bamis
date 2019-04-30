package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.RegionRepository;
import cz.uhk.dbs2.bamis.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class RegionServiceImpl  implements RegionService {
    @Autowired
    RegionRepository regionRepository;
    
    @Override
    public void addRegion(Region region) {
        regionRepository.save(region);
    }

    @Override
    public List<Region> loadAllRegions() {
        return regionRepository.findAll();
    }

    @Override
    public Region showPRegionWithId(int id) {
        return regionRepository.findById(id).get();
    }
}
