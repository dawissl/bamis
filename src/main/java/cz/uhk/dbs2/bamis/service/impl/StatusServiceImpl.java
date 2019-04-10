package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.StatusRepository;
import cz.uhk.dbs2.bamis.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;
}
