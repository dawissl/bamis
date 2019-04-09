package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Good;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface PackageService {

    @Transactional
    void addPackage(Good good);

    List<Good> loadAllPackages();

    Good showPackageWithId (int id);
}
