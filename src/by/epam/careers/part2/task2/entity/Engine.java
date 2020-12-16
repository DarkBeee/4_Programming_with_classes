package by.epam.careers.part2.task2.entity;

import java.util.Objects;

public class Engine {
    private EngineType type;
    private int power;
    private double volume;
    private boolean isStart;

    public Engine(EngineType type, int power, double volume) {
        this.type = type;
        this.power = power;
        this.volume = volume;
        this.isStart = false;
    }

    public EngineType getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isStart() {
        return isStart;
    }

    public void setStart(boolean start) {
        isStart = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                Double.compare(engine.volume, volume) == 0 &&
                isStart == engine.isStart &&
                type == engine.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, power, volume, isStart);
    }

    @Override
    public String toString() {
        return type + ", мощность " + power + ", объём " + volume;
    }
}
