package by.epam.careers.part1.task7.logic;

import by.epam.careers.part1.task7.entity.Triangle;
import by.epam.careers.part1.task7.entity.Point;

import static java.lang.Math.sqrt;

public class TriangleLogic {
    private static TriangleLogic instance;

    private TriangleLogic() {
    }

    public static TriangleLogic getInstance() {
        if (instance == null) {
            instance = new TriangleLogic();
        }
        return instance;
    }

    public double areaTriangle(Triangle triangle) {
        if (!triangle.isExist()) {
            System.out.println("Такого треугольника не существует.");
            return 0.0;
        }
        double p = (triangle.getSideAB().getValue() + triangle.getSideBC().getValue() +
                triangle.getSideAC().getValue()) / 2;
        double s = sqrt(p * (p - triangle.getSideAB().getValue()) *
                (p - triangle.getSideBC().getValue()) * (p - triangle.getSideAC().getValue()));
        return s;
    }

    public double perimeterTriangle(Triangle triangle) {
        if (!triangle.isExist()) {
            System.out.println("Такого треугольника не существует.");
            return 0.0;
        }
        return triangle.getSideAB().getValue() + triangle.getSideBC().getValue() +
                triangle.getSideAC().getValue();
    }

    public Point triangleCentroid(Triangle triangle) {
        if (!triangle.isExist()) {
            System.out.println("Такого треугольника не существует.");
            return null;
        }
        double x = (triangle.getA().getX() + triangle.getB().getX() +
                triangle.getC().getX()) / 3;
        double y = (triangle.getA().getY() + triangle.getB().getY() +
                triangle.getC().getY()) / 3;
        return new Point(x, y);
    }

}
