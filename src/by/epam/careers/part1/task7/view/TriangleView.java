package by.epam.careers.part1.task7.view;

import by.epam.careers.part1.task7.entity.Triangle;

public class TriangleView {
    private static TriangleView instance;

    private TriangleView() {
    }

    public static TriangleView getInstance() {
        if (instance == null) {
            instance = new TriangleView();
        }
        return instance;
    }

    public void print(Triangle triangle) {
        System.out.println(triangle.toString());
    }

    public void print(String message, Triangle triangle) {
        System.out.println(message);
        System.out.println(triangle.toString());
    }
}
