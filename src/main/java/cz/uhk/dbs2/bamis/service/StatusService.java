package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.Status;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface StatusService {
	@Transactional
	void addStatus(Status status);
	 List<Status> loadAllStatuses();

	 Status showStatusWithId (int id);
}
