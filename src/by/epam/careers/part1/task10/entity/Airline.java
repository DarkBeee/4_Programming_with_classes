package by.epam.careers.part1.task10.entity;

import java.time.LocalTime;
import java.util.Objects;

public class Airline {
    private String destination;
    private String flightNumber;
    private Plane plane;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, String flightNumber, Plane plane,
                   LocalTime departureTime, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }


    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(destination, airline.destination) &&
                Objects.equals(flightNumber, airline.flightNumber) &&
                Objects.equals(plane, airline.plane) &&
                Objects.equals(departureTime, airline.departureTime) &&
                dayOfWeek == airline.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flightNumber, plane, departureTime, dayOfWeek);
    }

    @Override
    public String toString() {
        return "Рейс " + flightNumber + ", пункт назначения '" + destination + "', " + plane +
                ", время вылета " + departureTime.getHour() + "ч " +
                departureTime.getMinute() + "мин, день недели " + dayOfWeek;
    }
}
