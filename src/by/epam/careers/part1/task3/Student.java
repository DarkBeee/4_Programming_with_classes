package by.epam.careers.part1.task3;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private int group;
    private int[] marks;

    public Student() {
    }

    public Student(String name, int group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group &&
                Objects.equals(name, student.name) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }


    @Override
    public String toString() {
        return "Студент: " + "имя '" + name + ", группа №" +
                group + ", отметки: " + Arrays.toString(marks);
    }
}