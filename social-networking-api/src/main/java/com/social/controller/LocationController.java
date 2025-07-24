package com.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.demo.entity.Location;

import java.util.Arrays;
import java.util.List;

@RestController
public class LocationController {

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return Arrays.asList(
            new Location(1, "Delhi", "India"),
            new Location(2, "New York", "USA")
        );
    }
}
