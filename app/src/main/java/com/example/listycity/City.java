package com.example.listycity;

/**
 * This class defines a city
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compares two cities as objects based on their names
     * @param o the city object to be compared.
     * @return
     */
    @Override
    public int compareTo(City o){
        City city = (City) o;
        return this.city.compareTo(o.getCityName());
    }
}
