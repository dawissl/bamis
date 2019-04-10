package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.GoodCategoryRepository;
import cz.uhk.dbs2.bamis.service.GoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class GoodCategoryServiceImpl implements GoodCategoryService {

    @Autowired
    GoodCategoryRepository goodCategoryRepository;
}
