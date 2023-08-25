package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> airportMap;

    public FlightSearch() {
        airportMap = new HashMap<>();

        airportMap.put("WAW", true);
        airportMap.put("WRO", true);
        airportMap.put("KTW", false);
        airportMap.put("BXP", true);
        airportMap.put("SZZ", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if (!airportMap.containsKey(departureAirport) || !airportMap.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Route not found");
        }

        boolean canFlyToDeparture = airportMap.get(departureAirport);
        boolean canFlyToArrival = airportMap.get(arrivalAirport);

        if (!canFlyToDeparture || !canFlyToArrival) {
            throw new RouteNotFoundException("Cannot fly to/from specified airport(s)");
        }

        System.out.println("Flight available from " + departureAirport + " to " + arrivalAirport);
    }

}
