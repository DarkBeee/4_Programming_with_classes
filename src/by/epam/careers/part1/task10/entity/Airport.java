package by.epam.careers.part1.task10.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Airport {
    private List<Airline> listFlight;

    {
        listFlight = new ArrayList<Airline>();
    }

    public Airport() {
    }

    public Airport(List<Airline> listFlight) {
        this.listFlight = listFlight;
    }

    public void addAllFlight(Airline ... airline) {
        Collections.addAll(listFlight, airline);
    }

    public void addFlight(Airline airline) {
        listFlight.add(airline);
    }

    public List<Airline> getListFlight() {
        return listFlight;
    }

    public void setListFlight(List<Airline> listFlight) {
        this.listFlight = listFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(listFlight, airport.listFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listFlight);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "listFlight=" + listFlight +
                '}';
    }
}
