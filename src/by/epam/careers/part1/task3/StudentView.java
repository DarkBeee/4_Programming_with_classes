package by.epam.careers.part1.task3;

import java.util.List;

public class StudentView {
    private static StudentView instance;

    private StudentView() {
    }

    public static StudentView getInstance() {
        if (instance == null) {
            instance = new StudentView();
        }
        return instance;
    }

    public void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void print(String message, List<Student> students) {
        System.out.println(message);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void print(Student student) {
        System.out.println(student);
    }

}
