package by.epam.careers.part1.task6;

/**Составте описание класса для представления времени. Предусмотрите возможности установки
 * времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости
 * вводимых значений. В случае недопустимых значений полей поле устанавливается в значение
 * 0. Создать методы изменения времени на заданное количество часов, минут и секунд.*/
public class Main {
    public static void main(String[] args) {
        Time time = new Time(10, 22, 100);
        Time time1 = new Time();
        System.out.println(time1.toString());
        time1.setHours(12);
        time1.setMinutes(61);
        time1.setSeconds(19);
        System.out.println(time1.toString());
    }
}
