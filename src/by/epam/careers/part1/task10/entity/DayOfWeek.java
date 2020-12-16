package by.epam.careers.part1.task10.entity;

public enum DayOfWeek {
    MONDAY("понедельник"), TUESDAY("вторник"), WEDNESDAY("среда"),
    THURSDAY("четверг"), FRIDAY("пятница"), SATURDAY("суббота"),
    SUNDAY("воскресенье");

    private String realName;

    DayOfWeek(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String
    toString() {
        return realName;
    }
}
