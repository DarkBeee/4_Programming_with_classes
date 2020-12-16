package by.epam.careers.part1.task10.view;

import by.epam.careers.part1.task10.entity.Airline;

import java.util.List;

public class AirlineView {
    private static AirlineView instance;

    private AirlineView() {
    }

    public static AirlineView getInstance() {
        if (instance == null) {
            instance = new AirlineView();
        }
        return instance;
    }

    public void print(List<Airline> listFlight) {
        for (Airline airline : listFlight) {
            System.out.println(airline.toString());
        }
    }

    public void print(String message, List<Airline> listFlight) {
        System.out.println(message);
        for (Airline airline : listFlight) {
            System.out.println(airline.toString());
        }
    }
}
