package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.GoodCategory;
import cz.uhk.dbs2.bamis.model.GoodCategory;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author David Sladecek
 */
@Service
public interface GoodCategoryService {
	@Transactional
	void addGoodCategory(GoodCategory goodCategory);
	 List<GoodCategory> loadAllGoodCategories();

	 GoodCategory showGoodCategoryWithId (int id);

}
