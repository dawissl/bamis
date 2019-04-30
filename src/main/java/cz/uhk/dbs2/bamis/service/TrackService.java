package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.Track;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface TrackService {
	@Transactional
	void addTrack(Track track);
	 List<Track> loadAllTracks();

	 Track showTrackWithId (int id);
}
