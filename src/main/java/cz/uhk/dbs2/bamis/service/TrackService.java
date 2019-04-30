package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Track;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface TrackService {

	 List<Track> loadAllTracks();

	 Track showTrackWithId (int id);

	 void addTrack(Track track);
}
