package by.epam.careers.part2.task2.logic;


import by.epam.careers.part2.task2.entity.Car;
import by.epam.careers.part2.task2.entity.Wheel;

public class CarLogic {
    private static CarLogic instance;

    private CarLogic() {
    }

    public static CarLogic getInstance() {
        if (instance == null) {
            instance = new CarLogic();
        }
        return instance;
    }

    public void refuel(Car car, int liter) {
        if (liter > car.getVolumeTank() - car.getPetrol()) {
            car.setPetrol(car.getVolumeTank());
            return;
        }
        car.setPetrol(car.getPetrol() + liter);
    }

    public void drive(Car car) {
        if (car.getPetrol() < 5 || car.getEngine().isStart()) {
            return;
        }
        car.setPetrol(car.getPetrol() - 5);
    }

    public void changeWheel(Car car, int poz) { // замена одного колеса
        switch (poz) {
            case (0):
                car.getWheels()[0] = new Wheel(car.getWheels()[0].getDiameter(),
                        car.getWheels()[0].getWidth()); // переднее левое
                break;
            case (1):
                car.getWheels()[1] = new Wheel(car.getWheels()[1].getDiameter(),
                        car.getWheels()[1].getWidth()); // переднее правое
                break;
            case (2):
                car.getWheels()[2] = new Wheel(car.getWheels()[2].getDiameter(),
                        car.getWheels()[2].getWidth()); // заднее левое
                break;
            case (4):
                car.getWheels()[3] = new Wheel(car.getWheels()[3].getDiameter(),
                        car.getWheels()[3].getWidth()); // заднее правое
                break;
        }
    }

    public void changeAllWheels(Car car, double diameter, double width) { // замена всех колёс
        for (int i = 0; i < car.getWheels().length; i++) {
            car.getWheels()[i] = new Wheel(diameter, width);
        }
    }
}
