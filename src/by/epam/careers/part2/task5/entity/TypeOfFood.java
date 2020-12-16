package by.epam.careers.part2.task5.entity;

public enum TypeOfFood {
    NOT_INCLUDED("не включено"), BREAKFAST("завтрак"),
    DINNER("обед"), ALL_INCLUSIVE("всё включено");
    private String realName;

    TypeOfFood(String realName) {
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
