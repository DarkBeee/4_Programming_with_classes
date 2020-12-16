package by.epam.careers.part1.task4.view;

import by.epam.careers.part1.task4.entity.Train;

import java.util.List;

public class TrainView {
    private static TrainView instance;

    private TrainView() {
    }

    public static TrainView getInstance() {
        if (instance == null) {
            instance = new TrainView();
        }
        return instance;
    }

    public void print(String message, List<Train> trains) {
        System.out.println(message);
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }

    public void print(String message, Train train) {
        System.out.println(message);
        System.out.println(train.toString());
    }

    public void print(Train train) {
        System.out.println(train.toString());
    }
}
