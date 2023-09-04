package com.kodilla.good.patterns.flights.view;

import com.kodilla.good.patterns.flights.model.Flight;

import java.util.List;
import java.util.Scanner;

public class View {
    public Scanner scan = new Scanner(System.in);

    public void printListOfFlights(List<Flight> list) {
        System.out.println("Wybrane loty: ");
        for (Flight flight : list) {
            System.out.println(flight.toString());
        }
    }

    public String printHello() {
        System.out.println("Witaj! Co chcesz zrobić? [1] Znajdź lot z... [2] Znajdź lot do... [3] Znajdź lot przez... [4] Znajdź połączenie [5] Dodaj połączenie [0] Zakończ");
        String whatToDo = this.scan.nextLine();
        return whatToDo;
    }

    public void closeScanning() {
        this.scan.close();
    }
}
