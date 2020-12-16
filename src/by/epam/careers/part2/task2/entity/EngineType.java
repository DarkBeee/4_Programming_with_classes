package by.epam.careers.part2.task2.entity;

public enum EngineType {
    DIESEL("дизель"), GAS("бензин");

    private String realName;

    EngineType(String realName) {
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
