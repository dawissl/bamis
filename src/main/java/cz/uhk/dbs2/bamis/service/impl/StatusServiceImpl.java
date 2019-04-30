package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.Status;
import cz.uhk.dbs2.bamis.repository.StatusRepository;
import cz.uhk.dbs2.bamis.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;
    
    @Override
    public void addStatus(Status status) {
        statusRepository.save(status);
    }

    @Override
    public List<Status> loadAllStatuses() {
        return statusRepository.findAll();
    }

    @Override
    public Status showStatusWithId(int id) {
        return statusRepository.findById(id).get();
    }
}
