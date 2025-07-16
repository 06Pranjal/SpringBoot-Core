package com.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.services.LocationService;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public String getUser() {
        return locationService.getUser();
    }
}
