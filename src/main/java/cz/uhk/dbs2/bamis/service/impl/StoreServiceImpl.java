package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.Store;
import cz.uhk.dbs2.bamis.repository.StoreRepository;
import cz.uhk.dbs2.bamis.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;

    @Override
    public void addStore(Store store) {
        storeRepository.save(store);
    }

    @Override
    public List<Store> loadAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public Store showStoreWithId(int id) {
        return storeRepository.findById(id).get();
    }
}
