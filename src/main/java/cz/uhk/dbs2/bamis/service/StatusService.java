package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface StatusService {

	 List<Status> loadAllStatuses();

	 Status showStatusWithId (int id);
}
