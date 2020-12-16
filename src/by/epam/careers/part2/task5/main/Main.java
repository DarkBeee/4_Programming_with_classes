package by.epam.careers.part2.task5.main;

import by.epam.careers.part2.task5.entity.*;
import by.epam.careers.part2.task5.logic.TourLogic;
import by.epam.careers.part2.task5.view.TourView;

import java.util.List;

/**Туристические путёвки. Сформировать набор предложений клиенту по выбору туристической путёвки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путёвок.*/
public class Main {
    public static void main(String[] args) {
        TourLogic logic = TourLogic.getInstance();
        TourView view = TourView.getInstance();

        Client client = new Client("Иван", "Иванов");
        TravelAgency tourist = new TravelAgency("Tourist");
        tourist.addTourPackage(new TourPackage("Египет", "Хургада", TourType.RELAXATION,
                TypeOfTransport.PLANE, TypeOfFood.BREAKFAST, 7, 637.72));
        tourist.addTourPackage(new TourPackage("Польша", "Варшава", TourType.SHOPPING,
                TypeOfTransport.BUS, TypeOfFood.NOT_INCLUDED, 2, 70.00));
        tourist.addTourPackage(new TourPackage("Македония", "Тирана", TourType.TREATMENT,
                TypeOfTransport.TRAIN, TypeOfFood.ALL_INCLUSIVE, 14, 1507.50));
        tourist.addTourPackage(new TourPackage("Турция", "Стамбул", TourType.EXCURSION,
                TypeOfTransport.PLANE, TypeOfFood.BREAKFAST, 4, 2004.00));
        tourist.addTourPackage(new TourPackage("Швеция", "Стокгольм", TourType.CRUISE,
                TypeOfTransport.SHIP, TypeOfFood.ALL_INCLUSIVE, 4, 443.82));


        List<TourPackage> list = logic.choiceByTourType(tourist, "Экскурсия");
        view.printTours("Выбор по типу путёвки", list);

        list = logic.selectionByMoreOptions(tourist, "Самолёт");
        view.printTours("Выбор по транспорту", list);

        list = logic.selectionByMoreOptions(tourist, 2);
        view.printTours("Выбор по количеству дней", list);

        list = logic.selectionByMoreOptions(tourist, "Самолёт", "Завтрак");
        view.printTours("Выбор по транспорту и питанию", list);

        list = logic.selectionByMoreOptions(tourist, "Поезд", "Всё включено", 14);
        view.printTours("Выбор по транспорту, питанию и количеству дней", list);

        list = logic.sortByPrice(tourist);
        view.printTours("Сортировка по цене", list);

        list = logic.sortByDays(tourist);
        view.printTours("Сортировка по дням", list);

        list = logic.sortByCountry(tourist);
        view.printTours("Сортировка по стране", list);
        client.setTourPackage(list.get(0));
        tourist.getClients().add(client);
    }
}
