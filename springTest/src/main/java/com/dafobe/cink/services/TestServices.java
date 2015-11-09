package com.dafobe.cink.services;

import java.util.List;

import com.dafobe.cink.model.entities.City;
import com.dafobe.cink.model.entities.Province;

public interface TestServices {

	List<Province> getProvinces();

	List<City> getCities();

	List<City> getProvinceCities(String provinciaId);

	List<City> getCitiesByPostalCode(String codigoPostal);

}
