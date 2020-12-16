package by.epam.careers.part2.task5.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TravelAgency {
    private String name;
    private List<TourPackage> tourPackages;
    private List<Client> clients;

    {
        tourPackages = new ArrayList<TourPackage>();
        clients = new ArrayList<Client>();
    }

    public void addTourPackage(TourPackage tour) {
        tourPackages.add(tour);
    }

    public void addTourPackage(TourPackage ... tour) {
        Collections.addAll(tourPackages, tour);
    }

    public TravelAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TourPackage> getTourPackages() {
        return tourPackages;
    }

    public void setTourPackages(List<TourPackage> tourPackages) {
        this.tourPackages = tourPackages;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelAgency that = (TravelAgency) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(tourPackages, that.tourPackages) &&
                Objects.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tourPackages, clients);
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "name='" + name + '\'' +
                ", tourPackages=" + tourPackages +
                ", clients=" + clients +
                '}';
    }
}
