package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.StoreRepository;
import cz.uhk.dbs2.bamis.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;
}
