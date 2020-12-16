package by.epam.careers.part2.task2.view;


import by.epam.careers.part2.task2.entity.Car;

public class CarView {
    private static CarView instance;

    private CarView() {
    }

    public static CarView getInstance() {
        if (instance == null) {
            instance = new CarView();
        }
        return instance;
    }

    public void print(Car car) {
        System.out.println(car);
    }
    public void print(String message, Car car) {
        System.out.println(message);
        System.out.println(car);
    }

    public void printModel(Car car) {
        System.out.println(car.getModel());
    }
}
