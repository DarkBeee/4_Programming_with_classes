package by.epam.careers.part1.task4.main;

import by.epam.careers.part1.task4.logic.TrainLogic;
import by.epam.careers.part1.task4.entity.Depo;
import by.epam.careers.part1.task4.entity.Train;
import by.epam.careers.part1.task4.view.TrainView;

import java.time.LocalTime;
import java.util.List;

/**Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
 * время отправления. Создайте данные в массив из пяти элементов типа Train, добавте
 * возможность сортировки элементов массива по номерам поездов. Добавте возможность
 * вывода информации о поезде, номер которого введён пользователем. Добавте
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
 * пунктами назначения должны быть упорядочены по времени отправления.*/
public class Main {
    public static void main(String[] args) {
        Depo depo = new Depo();
        TrainLogic logic = TrainLogic.getInstance();
        TrainView view = TrainView.getInstance();

        Train train1 = new Train("Москва",26,LocalTime.of(21, 43));
        Train train2 = new Train("Витебск",99,LocalTime.of(15, 32));
        Train train3 = new Train("Витебск",680,LocalTime.of(17, 32));
        Train train4 = new Train("Брест", 657,LocalTime.of(0, 27));
        Train train5 = new Train("Москва", 2,LocalTime.of(22, 8));

        depo.addAllTrain(train1, train2, train3, train4, train5);

        List<Train> sorted;
        sorted = logic.sortByNumber(depo.getTrains());
        view.print("Сортировка по номеру", sorted);

        Train number = logic.findByNumber(99, depo.getTrains());
        view.print("Поиск по номеру", number);

        sorted = logic.sortByStation(depo.getTrains());
        view.print("Сортировка по станциям", sorted);
    }
}


