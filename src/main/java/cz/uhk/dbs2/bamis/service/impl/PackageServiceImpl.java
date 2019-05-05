package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.Good;
import cz.uhk.dbs2.bamis.repository.GoodRepository;
import cz.uhk.dbs2.bamis.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    GoodRepository goodRepository;

    @Override
    public void addPackage(Good good) {
        goodRepository.save(good);
    }

    @Override
    public List<Good> loadAllPackages() {
        return goodRepository.findAll();
    }

    @Override
    public Good showPackageWithId(int id) {
        return goodRepository.findById(id).get();
    }

    @Override
    public void removePackageWithId(int id) {
        goodRepository.deleteById(id);
    }
}
