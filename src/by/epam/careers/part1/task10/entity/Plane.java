package by.epam.careers.part1.task10.entity;

import java.util.Objects;

public class Plane {
    private PlaneType planeType;
    private String model;

    public Plane(PlaneType planeType, String model) {
        this.planeType = planeType;
        this.model = model;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return planeType == plane.planeType &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeType, model);
    }

    @Override
    public String toString() {
        return "самолёт " + planeType.name() + " " + model;
    }
}
