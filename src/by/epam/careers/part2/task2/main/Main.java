package by.epam.careers.part2.task2.main;

import by.epam.careers.part2.task2.entity.Car;
import by.epam.careers.part2.task2.entity.Engine;
import by.epam.careers.part2.task2.entity.EngineType;
import by.epam.careers.part2.task2.logic.CarLogic;
import by.epam.careers.part2.task2.view.CarView;

/**Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля*/
public class Main {
    public static void main(String[] args) {
        CarLogic logic = CarLogic.getInstance();
        CarView view = CarView.getInstance();

        Car car = new Car("Nissan Primera", new Engine(EngineType.GAS, 125, 2.0),
                50, 5, 20.5, 200);
        logic.drive(car);
        logic.refuel(car, 30);
        logic.changeWheel(car, 1);
        logic.changeAllWheels(car, 18, 180);
        view.printModel(car);
    }
}
