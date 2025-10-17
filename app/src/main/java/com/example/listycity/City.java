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

    /**
     * This method returns the name of the city
     * @return city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This method returns the name of the province
     * @return province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compares two cities as objects based on their names
     * @param o the city object to be compared.
     * @return negative if this city name comes before {@code o},zero if equal, positive otherwise
     */
    @Override
    public int compareTo(City o){
        City city = (City) o;
        return this.city.compareTo(o.getCityName());
    }

    /**
     * This method checks if two cities are equal, to be used to check if already in list
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof City)) return false;
        City c = (City) o;
        return city.equals(c.city) && province.equals(c.province);
    }
}
