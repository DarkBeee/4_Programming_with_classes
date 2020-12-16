package by.epam.careers.part1.task2;

import java.util.Objects;

public class Test2 {
    private int a;
    private int b;

    public Test2() {
    }

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test2 test2 = (Test2) o;
        return a == test2.a &&
                b == test2.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Test2{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
