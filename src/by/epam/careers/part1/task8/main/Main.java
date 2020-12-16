package by.epam.careers.part1.task8.main;

import by.epam.careers.part1.task8.entity.Customer;
import by.epam.careers.part1.task8.entity.CustomerBase;
import by.epam.careers.part1.task8.logic.CustomerLogic;
import by.epam.careers.part1.task8.view.CustomerView;

import java.util.List;

/**Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
 * Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и
 * вывести эти данные на консоль. Класс Customer: id, фамилия, имя, отчество, адрес, номер
 * кредитной карточки, номор банковского счёта. Найти и вывести:
 * а) список покупателей в алфовитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/
public class Main {
    public static void main(String[] args) {
        CustomerBase base = new CustomerBase();
        CustomerLogic logic = CustomerLogic.getInstance();
        CustomerView view = CustomerView.getInstance();

        Customer customer1 = new Customer(123456, "Александр", "Черкас", "Витальевич",
                "Сморгонь", 1234_5678_9876L, 564856161146L);
        Customer customer2 = new Customer(456133, "Владислав", "Заяц", "Александрович",
                "Минск", 6713_6825_2497L, 372732735286L);
        Customer customer3 = new Customer(753189, "Олег", "Голосевич", "Игоревич",
                "Орша", 3447_6471_9453L, 238413547587L);
        Customer customer4 = new Customer(564126, "Алексей", "Бутримович", "Витальевич",
                "Витебск", 2171_5678_5643L, 931763472471L);
        Customer customer5 = new Customer(827478, "Николай", "Шпакович", "Иванович",
                "Минск", 3513_7538_6772L, 137955784741L);
        base.addAllCustomer(customer1, customer2, customer3, customer4, customer5);

        List<Customer> sorted = logic.sortBySurname(base.getListCustomer());
        view.print("Список покупателей в алфовитном порядке", sorted);

        sorted = logic.findByCreditCard(3000_0000_0000L, 7000_0000_0000L, base.getListCustomer());
        view.print("Список покупателей с номерами кредитных карточек в заданном диапазоне", sorted);

    }
}
