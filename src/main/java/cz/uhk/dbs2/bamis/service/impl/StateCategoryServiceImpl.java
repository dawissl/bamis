package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.StateCategoryRepository;
import cz.uhk.dbs2.bamis.service.StateCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class StateCategoryServiceImpl implements StateCategoryService {

    @Autowired
    StateCategoryRepository stateCategoryRepository;
}
