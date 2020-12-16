package by.epam.careers.part1.task4.entity;

import java.time.LocalTime;
import java.util.Objects;

public class Train {
    private String station;
    private int number;
    private LocalTime departureTime;

    public Train() {
    }

    public Train(String station, int number, LocalTime departureTime) {
        this.station = station;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                Objects.equals(station, train.station) &&
                Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(station, number, departureTime);
    }

    @Override
    public String toString() {
        return "Поезд №" + number + ", станция назначания: '" + station +
                "', время отправления: " + departureTime.getHour() +
                "ч " + departureTime.getMinute() + "мин";
    }

}
