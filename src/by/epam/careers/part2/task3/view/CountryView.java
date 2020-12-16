package by.epam.careers.part2.task3.view;

import by.epam.careers.part2.task3.entity.Country;
import by.epam.careers.part2.task3.entity.Region;

public class CountryView {
    private static CountryView instance;

    private CountryView() {
    }

    public static CountryView getInstance() {
        if (instance == null) {
            instance = new CountryView();
        }
        return instance;
    }

    public void printCapital(Country country) {
        System.out.println("Столица: " + country.getTheCapital());
    }

    public void printRegion(Country country) {
        System.out.println("Количество областей: " + country.getRegions().size());
    }

    public void printAreaCountry(Country country) {
        System.out.println("Площадь: " + country.getArea() + " км^2");
    }

    public void printRegionCenter(Country country) {
        System.out.println("Областные центры:");
        for (Region region : country.getRegions()) {
            System.out.println(region.getRegionName() + " - " + region.getRegionCenter());
        }
    }
}
