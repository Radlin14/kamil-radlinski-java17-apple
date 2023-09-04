package com.kodilla.good.patterns.flights.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlight {
    private List<Flight> flights = new ArrayList<Flight>();

    public List<Flight> getFlightsList() {
        return flights;
    }

    public void setFlightsList(List<Flight> flights) {
        this.flights = flights;
    }

    public void addFlight(String departureAirport, String layoverAirport, String destinationAirport, Date date) {
        Flight flight = new Flight(departureAirport, layoverAirport, destinationAirport, date);
        flights.add(flight);
    }

    public List<Flight> findFlightsFromAirport(String airport) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToAirport(String airport) {
        return flights.stream()
                .filter(flight -> flight.getDestinationAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsDirection(String fromAirport, String toAirport) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(fromAirport) &&
                        flight.getDestinationAirport().equals(toAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsThroughAirport(String fromAirport, String layoverAirport, String toAirport) {
        return flights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(fromAirport) &&
                        flight.getLayoverAirport().equals(layoverAirport) &&
                        flight.getDestinationAirport().equals(toAirport))
                .collect(Collectors.toList());
    }
}
