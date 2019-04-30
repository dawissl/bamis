package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.StateCategory;
import cz.uhk.dbs2.bamis.repository.StateCategoryRepository;
import cz.uhk.dbs2.bamis.service.StateCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class StateCategoryServiceImpl implements StateCategoryService {

    @Autowired
    StateCategoryRepository stateCategoryRepository;

    @Override
    public void addStateCategory(StateCategory stateCategory) {
        stateCategoryRepository.save(stateCategory);
    }

    @Override
    public List<StateCategory> loadAllStateCategories() {
        return stateCategoryRepository.findAll();
    }

    @Override
    public StateCategory showStateCategoryWithId(int id) {
        return stateCategoryRepository.findById(id).get();
    }
}
