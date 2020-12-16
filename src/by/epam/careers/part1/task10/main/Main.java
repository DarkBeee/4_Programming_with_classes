package by.epam.careers.part1.task10.main;

import by.epam.careers.part1.task10.entity.*;
import by.epam.careers.part1.task10.logic.AirlineLogic;
import by.epam.careers.part1.task10.view.AirlineView;

import java.time.LocalTime;
import java.util.List;

/**Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив
 * типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных
 * и вывести эти данные на консоль. Airline: пункт назначения, номер рейса,
 * тип самолёта, время вылета, дни недели.
 * Найти и вывести:
 * а) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время время вылета для которых больше
 * заданного.*/
public class Main {
    public static void main(String[] args) {
        AirlineLogic logic = AirlineLogic.getInstance();
        AirlineView view = AirlineView.getInstance();
        Airport airport = new Airport();

        Airline airline1 = new Airline("Москва", "B2 951",
                new Plane(PlaneType.BOEING, "737-800"), LocalTime.of(12, 35),
                DayOfWeek.FRIDAY);
        Airline airline2 = new Airline("Варшава", "B2 895",
                new Plane(PlaneType.EMBRAER, "175"), LocalTime.of(14, 5),
                DayOfWeek.TUESDAY);
        Airline airline3 =new Airline("Милан", "B2 881",
                new Plane(PlaneType.EMBRAER, "195"), LocalTime.of(10, 15),
                DayOfWeek.SATURDAY);
        Airline airline4 =new Airline("Лондон", "AF 1380",
                new Plane(PlaneType.AIRBUS, "A319"), LocalTime.of(21, 20),
                DayOfWeek.MONDAY);
        Airline airline5 =new Airline("Абу-Даби", "B2* 0352",
                new Plane(PlaneType.AIRBUS, "A319"), LocalTime.of(15, 0),
                DayOfWeek.MONDAY);
        airport.addAllFlight(airline1, airline2, airline3, airline4, airline5);

        List<Airline> found = logic.findDestination("Москва", airport.getListFlight());
        view.print("Список рейсов для заданного пункта назначения", found);

        found = logic.findDayOfWeek("Суббота", airport.getListFlight());
        view.print("Список рейсов для заданного дня недели", found);

        found = logic.findDepartureTime("Понедельник",16, 5, airport.getListFlight());
        view.print("Cписок рейсов для заданного дня недели, время время вылета " +
                "для которых больше заданного", found);
    }
}
