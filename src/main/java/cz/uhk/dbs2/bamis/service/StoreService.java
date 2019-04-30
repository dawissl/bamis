package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Store;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


/**
 * @author David Sladecek
 */
@Service
public interface StoreService {
	@Transactional
	void addStore(Store store);
	 List<Store> loadAllStores();

	 Store showStoreWithId (int id);
}
