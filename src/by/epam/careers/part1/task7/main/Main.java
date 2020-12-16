package by.epam.careers.part1.task7.main;

import by.epam.careers.part1.task7.entity.Point;
import by.epam.careers.part1.task7.entity.Triangle;
import by.epam.careers.part1.task7.logic.TriangleLogic;
import by.epam.careers.part1.task7.view.TriangleView;

/**Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.*/
public class Main {
    public static void main(String[] args) {
        TriangleLogic logic = TriangleLogic.getInstance();
        TriangleView view = TriangleView.getInstance();

        Triangle triangle = new Triangle(new Point(2, 2), new Point(7, 2),
                new Point(7, 6));

        double result = logic.areaTriangle(triangle);
        System.out.println("Площадь треугольника - " + result);

        result = logic.perimeterTriangle(triangle);
        System.out.println("Периметр треугольника - " + result);

        Point centroid = logic.triangleCentroid(triangle);
        System.out.println("Координаты центроида" + centroid.toString());
        view.print(triangle);
    }
}
