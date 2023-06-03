package dao;

import model.City;

import java.util.List;

public interface CityDAO {

    void create(City city);

    City readById(int id);

    List<City> readAll();

    void updateCity(City city);

    void deleteCity(City city);
}
