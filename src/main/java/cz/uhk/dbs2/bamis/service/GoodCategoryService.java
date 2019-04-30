package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface GoodCategoryService {

	 List<GoodCategory> loadAllGoodCategories();

	 GoodCategory showGoodCategoryWithId (int id);
}
