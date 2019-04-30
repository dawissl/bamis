package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Status;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface StatusService {

	 List<Status> loadAllStatuses();

	 Status showStatusWithId (int id);
}
