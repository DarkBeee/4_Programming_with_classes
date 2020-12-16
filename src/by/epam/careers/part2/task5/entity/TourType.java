package by.epam.careers.part2.task5.entity;

public enum TourType {
    RELAXATION("Отдых"), EXCURSION("Экскурсия"), TREATMENT("Оздоровление"),
    SHOPPING("Шопинг"), CRUISE("Круиз");
    private String realName;

    TourType(String realName) {
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
        return realName;
    }
}
