package by.epam.careers.part2.task2.entity;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String model;
    private Engine engine;
    private Wheel[] wheels;
    private int volumeTank;
    private int petrol;

    public Car(String model, Engine engine, int volumeTank, int petrol, double diameter, double width) {
        this.model = model;
        this.engine = engine;
        this.petrol = petrol;
        this.volumeTank = volumeTank;
        this.wheels = new Wheel[]{new Wheel(diameter, width), new Wheel(diameter, width),
                new Wheel(diameter, width), new Wheel(diameter, width)};
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getVolumeTank() {
        return volumeTank;
    }

    public void setVolumeTank(int volumeTank) {
        this.volumeTank = volumeTank;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return volumeTank == car.volumeTank &&
                petrol == car.petrol &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Arrays.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model, engine, volumeTank, petrol);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return model + "\nдвигатель - " + engine + "\nКолёса - " +
                wheels[0] + "\nОбъём бака - " + volumeTank;
    }
}
