package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Store;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface StoreService {

	 List<Store> loadAllStores();

	 Store showStoreWithId (int id);

	 void addStore(Store store);
}
