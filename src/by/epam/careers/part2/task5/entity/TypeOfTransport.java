package by.epam.careers.part2.task5.entity;

public enum TypeOfTransport {
    PLANE("Самолёт"), BUS("Автобус"), TRAIN("Поезд"),
    SHIP("Корабль"), CAR("Машина");
    private String realName;

    TypeOfTransport(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return realName.toLowerCase();
    }
}
