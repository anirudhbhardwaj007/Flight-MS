package com.capg.flightmanagement.airportmanagement.dao;
import java.util.*;

import com.capg.flightmanagement.airportmanagement.entities.Airport;


public interface IAirportDao {

	public List<Airport> viewAirport();
	public String viewAirport(String airportCode);
	public List<Airport> addAirport(Airport airport);
	
}
