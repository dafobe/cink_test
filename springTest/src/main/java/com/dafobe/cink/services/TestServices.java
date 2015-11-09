package com.dafobe.cink.services;

import java.util.List;

import com.dafobe.cink.model.entities.Ciudad;
import com.dafobe.cink.model.entities.Provincia;

public interface TestServices {

	List<Provincia> getProvincias();

	List<Ciudad> getCiudades();

	List<Ciudad> getCiudadesDeProvincia(String provinciaId);

	List<Ciudad> getCiudadesPorCodigoPostal(String codigoPostal);

}
