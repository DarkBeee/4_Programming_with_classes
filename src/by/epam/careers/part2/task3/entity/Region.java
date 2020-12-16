package by.epam.careers.part2.task3.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Region {
    private String regionName;
    private City regionCenter;
    private int population;
    private double areaRegion;
    private List<District> districts;

    {
        districts = new ArrayList<District>();
    }

    public Region() {
    }

    public Region(String regionName, City regionCenter, int population, double areaRegion) {
        this.regionName = regionName;
        this.regionCenter = regionCenter;
        this.population = population;
        this.areaRegion = areaRegion;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public void addDistrict(District ... district) {
        Collections.addAll(districts, district);
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAreaRegion() {
        return areaRegion;
    }

    public void setAreaRegion(double areaRegion) {
        this.areaRegion = areaRegion;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return population == region.population &&
                Double.compare(region.areaRegion, areaRegion) == 0 &&
                Objects.equals(regionName, region.regionName) &&
                Objects.equals(regionCenter, region.regionCenter) &&
                Objects.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, regionCenter, population, areaRegion, districts);
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", regionCenter=" + regionCenter +
                ", population=" + population +
                ", areaRegion=" + areaRegion +
                ", districts=" + districts +
                '}';
    }
}
