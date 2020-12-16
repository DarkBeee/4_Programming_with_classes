package by.epam.careers.part1.task5;

/**Опишите класс, реализующий десятичный счётчик, который может увеличивать или уменьшать
 * своё значение на единицу в заданном диапазоне. Предусмотрите инициализацию счётчика
 * значениями по умолчанию и произвольными значениями. Счётчик имеет методы увеличения и
 * уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать
 * код, демонстрирующий все возможности класса.*/
public class Main {
    public static void main(String[] args) {
        DecimalCounter x = new DecimalCounter( 93);
        DecimalCounter y = new DecimalCounter();
        DecimalCounter z = new DecimalCounter(1, 10);
        x.printValue();
        y.printValue();
        z.printValue();
        x.increase();
        y.decrease();
        x.printValue();
        y.printValue();
    }

}
