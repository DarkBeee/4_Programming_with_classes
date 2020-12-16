package by.epam.careers.part2.task3.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Country {
    private String countryName;
    private City theCapital;
    private List<Region> regions;
    private double area;
    private int countryPopulation;

    {
        regions = new ArrayList<Region>();
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(String countryName, City theCapital, double area,
                   int countryPopulation, Region... region) {
        this.countryName = countryName;
        this.theCapital = theCapital;
        this.area = area;
        this.countryPopulation = countryPopulation;
        Collections.addAll(regions, region);
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public void addRegion(Region ... region) {
        Collections.addAll(regions, region);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getTheCapital() {
        return theCapital;
    }

    public void setTheCapital(City theCapital) {
        this.theCapital = theCapital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Double.compare(country.area, area) == 0 &&
                Objects.equals(countryName, country.countryName) &&
                Objects.equals(theCapital, country.theCapital) &&
                Objects.equals(regions, country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName, theCapital, regions, area);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", theCapital=" + theCapital +
                ", regions=" + regions +
                '}';
    }
}
