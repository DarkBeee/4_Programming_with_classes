package by.epam.careers.part1.task3;

import java.util.ArrayList;
import java.util.List;

/**Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
 * номер группы, успеваемость (массив из пяти элементов). Создайте массив
 * из десяти элементов такого типа. Добавте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.*/
public class Main {
    public static void main(String[] args) {
        StudentLogic logic = StudentLogic.getInstance();
        StudentView view = StudentView.getInstance();

        List<Student> students = new ArrayList<Student>(10);
        students.add(new Student("Черкас А.В.", 22, new int[]{5, 4, 6, 5, 3}));
        students.add(new Student("Чигаров Д.И.", 22, new int[]{9, 8, 8, 10, 9}));
        students.add(new Student("Сечих А.М.", 22, new int[]{4, 5, 7, 10, 6}));
        students.add(new Student("Заяц В.Н.", 31, new int[]{5, 7, 1, 7, 4}));
        students.add(new Student("Голосевич О.В.", 31, new int[]{10, 9, 9, 9, 9}));
        students.add(new Student("Шпакович Н.Г.", 32, new int[]{9, 9, 10, 10, 9}));
        students.add(new Student("Азарков Е.Т.", 31, new int[]{9, 9, 8, 10, 9}));
        students.add(new Student("Пенязь П.П.", 32, new int[]{3, 6, 5, 7, 4}));
        students.add(new Student("Нечайкин А.Н.", 21, new int[]{2, 9, 9, 7, 10}));
        students.add(new Student("Шарлан И.А.", 22, new int[]{10, 9, 9, 10, 9}));

        List<Student> bestStudent = logic.findBestStudent(students);
        view.print(bestStudent);

    }
}
