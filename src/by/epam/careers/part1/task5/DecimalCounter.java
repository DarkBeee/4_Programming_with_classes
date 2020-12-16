package by.epam.careers.part1.task5;

import java.util.Objects;

import static java.lang.Math.random;

public class DecimalCounter {
    private int min = 10;
    private int max = 99;
    private int value;

    public DecimalCounter(int value) {
        this.value = value;
    }

    public DecimalCounter() {
        value = (int) (random() * 50 + 20);
    }

    public DecimalCounter(int min, int max) {
        this.min = min;
        this.max = max;
        this.value = (max - min) / 2;
    }

    public void increase() {
        if (value > max) {
            value = min;
        }
        value++;
    }

    public void decrease() {
        if (value < min) {
            value = max;
        }
        value--;
    }

    public void printValue() {
        System.out.println(this.toString());
    }

    public int getValue() {
        return value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecimalCounter that = (DecimalCounter) o;
        return min == that.min &&
                max == that.max &&
                value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, value);
    }

    @Override
    public String toString() {
        return "Значение счётчика: " + value;
    }
}
