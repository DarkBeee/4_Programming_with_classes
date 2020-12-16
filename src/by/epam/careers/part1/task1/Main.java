package by.epam.careers.part1.task1;

/**Создайте класс Test1 двумя переменными. Добавте метод вывода на экран и
 * методы изменения этих переменных. Добавте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.*/
public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1(8, 5);
        System.out.println(test1.toString());
        test1.setA(3);
        test1.setB(7);
        System.out.println(test1.toString());
        System.out.println("Сумма переменных: " + test1.sumNumber());
        System.out.println("Наибольшее значение: " + test1.maxValue());
    }
}
