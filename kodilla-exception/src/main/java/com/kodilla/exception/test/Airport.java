package com.kodilla.exception.test;

public class Airport {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        Flight validFlight = new Flight("WAW", "WRO");
        Flight invalidFlight = new Flight("WAW", "SZZ");

        try {
            flightSearch.findFlight(validFlight);
            flightSearch.findFlight(invalidFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
