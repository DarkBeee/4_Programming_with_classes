package by.epam.careers.part2.task2.entity;

import java.util.Objects;

public class Wheel {
    private double diameter;
    private double width;

    public Wheel(double diameter, double width) {
        this.diameter = diameter;
        this.width = width;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.diameter, diameter) == 0 &&
                Double.compare(wheel.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, width);
    }

    @Override
    public String toString() {
        return "диаметр " + diameter + ", ширина " + width;
    }
}
