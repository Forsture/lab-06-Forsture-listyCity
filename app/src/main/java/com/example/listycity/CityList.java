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
     * @return a list of cities in alphabetical ascending order
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        list.sort(Collections.reverseOrder());
        return list;
    }

    /**
     * This method checks if a city is in the list
     * @param city
     * @return true if the city is in the list, else false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This method deletes a city from the list
     * @param city
     */
    public void deleteCity(City city) {
        if(!cities.remove(city)) {
            throw new IllegalArgumentException("No such city");
        }
        cities.remove(city);
    }

    /**
     * This method counts the number of cities in the list
     * @return list size
     */
    public int countCities() {
        return cities.size();
    }

}
