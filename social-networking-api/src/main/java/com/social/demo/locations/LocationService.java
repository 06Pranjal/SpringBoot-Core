package com.social.demo.locations;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class LocationService {
    public List<Location> getAllLocations() {
        return Arrays.asList(
            new Location("127021", "HR")
        );
    }
}
