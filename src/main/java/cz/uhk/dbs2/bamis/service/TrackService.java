package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface TrackService {

	 List<Track> loadAllTracks();

	 Track showTrackWithId (int id);
}
