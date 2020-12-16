package by.epam.careers.part1.task4.logic;

import by.epam.careers.part1.task4.entity.Train;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainLogic {
    private static TrainLogic instance;

    private TrainLogic() {
    }

    public static TrainLogic getInstance() {
        if (instance == null) {
            instance = new TrainLogic();
        }
        return instance;
    }

    public List<Train> sortByNumber(List<Train> trains) {
        List<Train> sortTrains = new ArrayList<Train>();
        sortTrains.addAll(trains);
        sortTrains.sort(Comparator.comparing(Train::getNumber));
        return sortTrains;
    }

    public Train findByNumber(int findNumber, List<Train> trains) {
        Train t = null;
        for (Train train : trains) {
            if (train.getNumber() == findNumber) {
                t = train;
            }
        }
        if (t == null) {
            System.out.println("Поезд не найден");
        }
        return t;
    }

    public List<Train> sortByStation(List<Train> trains) {
        List<Train> sortTrains = new ArrayList<Train>();
        sortTrains.addAll(trains);
        sortTrains.sort(Comparator.comparing(Train::getStation).thenComparing(Train::getDepartureTime));
        return sortTrains;
    }
}

