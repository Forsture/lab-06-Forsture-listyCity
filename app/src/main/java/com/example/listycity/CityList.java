package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private final List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list of cities
     * @param city
     * This is the city we want to add
     * @throws IllegalArgumentException if the city is already in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This method sorts the lists of cities
     * @return
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        list.sort(Collections.reverseOrder());
        return list;
    }

}
