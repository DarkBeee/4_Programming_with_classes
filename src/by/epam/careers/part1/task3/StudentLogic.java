package by.epam.careers.part1.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {
    private static StudentLogic instance;

    private StudentLogic() {
    }

    public static StudentLogic getInstance() {
        if (instance == null) {
            instance = new StudentLogic();
        }
        return instance;
    }

    public List<Student> findBestStudent(List<Student> students) {
        List<Student> find = new ArrayList<Student>();
        boolean flag;
        for (Student student : students) {
            flag = true;
            for (int i = 0; i < student.getMarks().length; i++) {
                if (student.getMarks()[i]  < 9) {
                    flag = false;
                }
            }
            if (flag) {
                find.add(student);
            }
        }
        return find;
    }
}
