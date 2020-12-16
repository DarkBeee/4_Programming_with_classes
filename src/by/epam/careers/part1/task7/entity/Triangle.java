package by.epam.careers.part1.task7.entity;

import java.util.Objects;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private Side sideAB;
    private Side sideBC;
    private Side sideAC;
    private boolean isExist;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sideAB = Side.getSideLength(a, b);
        this.sideBC = Side.getSideLength(b, c);
        this.sideAC = Side.getSideLength(a, c);
        this.isExist = triangleExist(sideAB, sideBC, sideAC);
    }

    public boolean triangleExist(Side a, Side b, Side c) {
        return a.getValue() + b.getValue() > c.getValue() &&
                a.getValue() + c.getValue() > b.getValue() &&
                b.getValue() + c.getValue() > a.getValue();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Side getSideAB() {
        return sideAB;
    }

    public void setSideAB(Side sideAB) {
        this.sideAB = sideAB;
    }

    public Side getSideBC() {
        return sideBC;
    }

    public void setSideBC(Side sideBC) {
        this.sideBC = sideBC;
    }

    public Side getSideAC() {
        return sideAC;
    }

    public void setSideAC(Side sideAC) {
        this.sideAC = sideAC;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return isExist == triangle.isExist &&
                Objects.equals(a, triangle.a) &&
                Objects.equals(b, triangle.b) &&
                Objects.equals(c, triangle.c) &&
                Objects.equals(sideAB, triangle.sideAB) &&
                Objects.equals(sideBC, triangle.sideBC) &&
                Objects.equals(sideAC, triangle.sideAC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, sideAB, sideBC, sideAC, isExist);
    }

    @Override
    public String toString() {
        return "Параметры треугольника: " +
                "точка a" + a + ", точка b" + b + ", точка c" + c +
                ", сторона AB = " + sideAB + ", сторона BC = " + sideBC +
                ", сторона AC = " + sideAC + ", isExist=" + isExist;
    }
}
