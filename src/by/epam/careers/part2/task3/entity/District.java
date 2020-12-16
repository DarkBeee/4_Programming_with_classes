package by.epam.careers.part2.task3.entity;

import java.util.Objects;

public class District {
    private String districtName;
    private City districtCenter;

    public District() {
    }

    public District(String districtName, City districtCenter) {
        this.districtName = districtName;
        this.districtCenter = districtCenter;
    }

    public String getDistrictName() {
        return districtName;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }


    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(districtName, district.districtName) &&
                Objects.equals(districtCenter, district.districtCenter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtName, districtCenter);
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                ", districtCenter=" + districtCenter +
                '}';
    }
}
