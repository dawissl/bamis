package cz.uhk.dbs2.bamis.service;
import cz.uhk.dbs2.bamis.model.StateCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface StateCategoryService {

	 List<StateCategory> loadAllStateCategories();

	 StateCategory showStateCategoryWithId (int id);

	 void addStateCategory(StateCategory stateCategory);
}
