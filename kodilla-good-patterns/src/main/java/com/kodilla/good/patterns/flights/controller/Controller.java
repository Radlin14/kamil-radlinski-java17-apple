package com.kodilla.good.patterns.flights.controller;

import com.kodilla.good.patterns.flights.model.Flight;
import com.kodilla.good.patterns.flights.model.SearchFlight;
import com.kodilla.good.patterns.flights.view.View;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private View view;
    private SearchFlight model;


    public Controller() {
        this.view = new View();
        this.model = new SearchFlight();
    }

    public void whatToDo() {
        boolean work = true;
        while (work) {
            String whatToDo = view.printHello();
            work = making(whatToDo);
        }
        view.closeScanning();
    }

    private boolean making(String toDo) {
        boolean answer = true;
        switch (toDo) {
            case "1" -> fromAirport();
            case "2" -> toAirport();
            case "3" -> throughAirport();
            case "4" -> direction();
            case "5" -> addAirport();
            case "0" -> answer = false;
        }
        return answer;
    }

    private void fromAirport() {
        List<Flight> flights;
        String airport = view.scan.nextLine();
        flights = model.findFlightsFromAirport(airport);
        view.printListOfFlights(flights);

    }

    private void toAirport() {
        List<Flight> flights;
        String airport = view.scan.nextLine();
        flights = model.findFlightsToAirport(airport);
        view.printListOfFlights(flights);

    }

    private void throughAirport() {
        List<Flight> flights;
        Scanner airport_scan = new Scanner(System.in);
        String from_airport = airport_scan.nextLine();
        String through = airport_scan.nextLine();
        String to_airport = airport_scan.nextLine();
        flights = model.findFlightsThroughAirport(from_airport, through, to_airport);
        view.printListOfFlights(flights);

    }

    private void direction() {
        List<Flight> flights;
        Scanner airport_scan = new Scanner(System.in);
        String from_airport = airport_scan.nextLine();
        String to_airport = airport_scan.nextLine();
        flights = model.findFlightsDirection(from_airport, to_airport);
        view.printListOfFlights(flights);

    }

    private void addAirport() {
        String date_str = view.scan.nextLine();
        String from_airport = view.scan.next();
        String through = view.scan.next();
        String to_airport = view.scan.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date date = dateFormat.parse(date_str);
            model.addFlight(from_airport, through, to_airport, date);
        } catch (ParseException e) {
            System.out.println("Błąd przy parsowaniu daty i godziny. Sprawdź poprawność formatu.");
        }
        view.printListOfFlights(model.getFlightsList());

    }

}

