package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.TrackRepository;
import cz.uhk.dbs2.bamis.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class TrackServiceImpl implements TrackService {

    @Autowired
    TrackRepository trackRepository;
    
    @Override
    public void addTrack(Track track) {
        trackRepository.save(track);
    }

    @Override
    public List<Track> loadAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Track showTrackWithId(int id) {
        return trackRepository.findById(id).get();
    }
}
