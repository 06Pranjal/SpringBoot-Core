package com.social.demo.entity;

public class Location {
    private int locationId;
    private String city;
    private String country;

    public Location(int locationId, String city, String country) {
        this.locationId = locationId;
        this.city = city;
        this.country = country;
    }

    public Location() {}

    public int getLocationId() { return locationId; }
    public void setLocationId(int locationId) { this.locationId = locationId; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}

