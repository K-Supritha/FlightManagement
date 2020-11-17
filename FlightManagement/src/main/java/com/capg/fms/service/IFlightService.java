package com.capg.fms.service;

import java.util.List;
import java.util.Optional;

import com.capg.fms.dto.Flight;

public interface IFlightService {

	 public Flight addFlight(Flight flight);
	  public void updateFlight(Flight flight);
	  public void deleteFlight(String flightNo);
	  public List<Flight> getFlights();
	  public Optional<Flight> getFlight(String flightNo);
}
