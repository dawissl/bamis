package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.GoodCategory;
import cz.uhk.dbs2.bamis.repository.GoodCategoryRepository;
import cz.uhk.dbs2.bamis.service.GoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class GoodCategoryServiceImpl implements GoodCategoryService {

    @Autowired
    GoodCategoryRepository goodCategoryRepository;

    @Override
    public void addGoodCategory(GoodCategory goodCategory) {
        goodCategoryRepository.save(goodCategory);
    }

    @Override
    public List<GoodCategory> loadAllGoodCategories() {
        return goodCategoryRepository.findAll();
    }

    @Override
    public GoodCategory showGoodCategoryWithId(int id) {
        return goodCategoryRepository.findById(id).get();
    }
}
