package by.epam.careers.part1.task10.logic;

import by.epam.careers.part1.task10.entity.Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {
    private static AirlineLogic instance;

    private AirlineLogic() {
    }

    public static AirlineLogic getInstance() {
        if (instance == null) {
            instance = new AirlineLogic();
        }
        return instance;
    }

    public List<Airline> findDestination(String destination, List<Airline> listFlight) {
        List<Airline> find = new ArrayList<Airline>();
        for (Airline airline : listFlight) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                find.add(airline);
            }
        }
        return find;
    }

    public List<Airline> findDayOfWeek(String day, List<Airline> listFlight) {
        List<Airline> find = new ArrayList<Airline>();
        for (Airline airline : listFlight) {
            String name = airline.getDayOfWeek().getRealName();
            if (name.equalsIgnoreCase(day)) {
                find.add(airline);
            }
        }
        return find;
    }

    public List<Airline> findDepartureTime(String day, int hours, int minutes, List<Airline> listFlight) {
        List<Airline> find = new ArrayList<Airline>();
        LocalTime time = LocalTime.of(hours, minutes);
        for (Airline airline : listFlight) {
            String name = airline.getDayOfWeek().getRealName();
            if (name.equalsIgnoreCase(day)) {
                if (airline.getDepartureTime().isAfter(time)) {
                    find.add(airline);
                }
            }
        }
        return find;
    }
}
