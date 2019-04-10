package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.EmployeeCategoryRepository;
import cz.uhk.dbs2.bamis.service.EmployeeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class EmployeeCategoryServiceImpl implements EmployeeCategoryService {
    @Autowired
    EmployeeCategoryRepository employeeCategoryRepository;
}
