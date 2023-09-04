package com.kodilla.good.patterns.flights.model;

import java.util.Date;
import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String layoverAirport;
    private String destinationAirport;
    private Date date;

    public Flight(String departureAirport, String layoverAirport, String destinationAirport, Date date) {
        this.departureAirport = departureAirport;
        this.layoverAirport = layoverAirport;
        this.destinationAirport = destinationAirport;
        this.date = date;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getLayoverAirport() {
        return layoverAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public Date getDate() {
        return date;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public void setLayoverAirport(String layoverAirport) {
        this.layoverAirport = layoverAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight flight)) return false;
        return getDepartureAirport().equals(flight.getDepartureAirport()) && Objects.equals(getLayoverAirport(), flight.getLayoverAirport())
                && getDestinationAirport().equals(flight.getDestinationAirport()) && getDate().equals(flight.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getLayoverAirport(), getDestinationAirport(), getDate());
    }

    @Override
    public String toString() {
        return "Lotnisko początkowe: " + this.departureAirport + "; Lotnisko końcowe: "
                + this.destinationAirport + "; Lot przez: " + this.layoverAirport + "; Termin odlotu: " + this.date;
    }

}
