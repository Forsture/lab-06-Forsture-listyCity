package com.example.listycity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {
        private CityList mockCityList() {
            CityList cityList = new CityList();
            cityList.add(mockCity());
            return cityList;
        }
        private City mockCity() {
            return new City("Edmonton", "Alberta");

        }
    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException(){
            CityList cityList = mockCityList();
            City city = new City("Yellowknife", "Northwest Territories");
            cityList.add(city);
            assertThrows(IllegalArgumentException.class, () -> {
                cityList.add(city);
            });
    }
    @Test
    void testGetCities(){
            CityList cityList = mockCityList();

            assertEquals(0,mockCity().compareTo(cityList.getCities().get(0)));

            City city = new City("Vancouver", "British Columbia");
            cityList.add(city);

            assertEquals(0, city.compareTo(cityList.getCities().get(0)));
            assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity(){
        CityList cityList = mockCityList();
        assertTrue(cityList.hasCity(mockCity()));
        assertFalse(cityList.hasCity(new City("Calgary", "Alberta")));

    }

    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();
        City regina = new City("Regina", "Saskatchewan");
        cityList.add(regina);
        assertTrue(cityList.hasCity(regina));
        cityList.deleteCity(regina);
    }

    @Test
    void testDeleteCityException() {
            CityList cityList = mockCityList();
            City missing = new City("Toronto", "Ontario");
            assertThrows(IllegalArgumentException.class, () -> {
                cityList.deleteCity(missing);
            });
    }
    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));
        cityList.add(new City("Yellowknife", "Northwest Territories"));
        assertEquals(3, cityList.countCities());

        cityList.deleteCity(new City("Calgary", "Alberta"));
        assertEquals(2, cityList.countCities());
    }
}
