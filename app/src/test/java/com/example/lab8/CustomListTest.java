package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void testHasCity() {
        CustomList cityList = MockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));
    }

    @Test
    public void testDelete(){
        CustomList cityList = MockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);
        cityList.delete(city);
        Assert.assertEquals(0, cityList.getCities().size());
    }

    @Test
    public void testCountCities(){
        CustomList cityList = MockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city);
        Assert.assertEquals(1, cityList.countCities());
    }

}
