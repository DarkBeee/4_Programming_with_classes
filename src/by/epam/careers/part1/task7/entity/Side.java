package by.epam.careers.part1.task7.entity;

import java.util.Objects;

public class Side {
    private double value;

    public Side() {
    }

    public Side(double value) {
        this.value = value;
    }

    public static Side getSideLength(Point a, Point b) {
        double p = Math.pow((a.getX() - b.getX()), 2);
        double d = Math.pow((a.getY() - b.getY()), 2);
        return new Side(Math.sqrt(p + d));
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Side side = (Side) o;
        return Double.compare(side.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
