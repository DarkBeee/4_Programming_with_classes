package by.epam.careers.part2.task5.entity;

import java.util.Objects;

public class TourPackage {
    private String country;
    private String city;
    private TourType tourType;
    private TypeOfTransport typeOfTransport;
    private TypeOfFood typeOfFood;
    private int numberOfDays;
    private double price;

    public TourPackage() {
    }

    public TourPackage(String country, String city, TourType tourType, TypeOfTransport
            typeOfTransport, TypeOfFood typeOfFood, int numberOfDays, double price) {
        this.country = country;
        this.city = city;
        this.tourType = tourType;
        this.typeOfTransport = typeOfTransport;
        this.typeOfFood = typeOfFood;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(TypeOfFood typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourPackage that = (TourPackage) o;
        return numberOfDays == that.numberOfDays &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(country, that.country) &&
                Objects.equals(city, that.city) &&
                tourType == that.tourType &&
                typeOfTransport == that.typeOfTransport &&
                typeOfFood == that.typeOfFood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, tourType, typeOfTransport, typeOfFood, numberOfDays, price);
    }

    @Override
    public String toString() {
        return "Туристическая путёвка: " + "страна '" + country + ", город " + city +
                ", тип тура " + tourType + ", транспорт " + typeOfTransport +
                ", питание " + typeOfFood + ", количество дней " + numberOfDays +
                ", цена " + price;
    }
}
