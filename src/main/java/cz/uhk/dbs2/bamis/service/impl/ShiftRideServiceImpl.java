package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.ShiftRideRepository;
import cz.uhk.dbs2.bamis.service.ShiftRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class ShiftRideServiceImpl implements ShiftRideService {

    @Autowired
    ShiftRideRepository shiftRideRepository;
}
