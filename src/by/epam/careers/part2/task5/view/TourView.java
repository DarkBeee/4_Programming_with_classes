package by.epam.careers.part2.task5.view;

import by.epam.careers.part2.task5.entity.TourPackage;
import by.epam.careers.part2.task5.entity.TravelAgency;

import java.util.List;

public class TourView {
    private static TourView instance;

    private TourView() {
    }

    public static TourView getInstance() {
        if (instance == null) {
            instance = new TourView();
        }
        return instance;
    }
    public void printTours(TravelAgency tourPackages) {
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            System.out.println(tourPackage.toString());
        }
    }

    public void printTours(String message, TravelAgency tourPackages) {
        System.out.println(message);
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            System.out.println(tourPackage.toString());
        }
    }

    public void printTours(String message, List<TourPackage> selectByType) {
        System.out.println(message);
        for (TourPackage tourPackage : selectByType) {
            System.out.println(tourPackage.toString());
        }
    }
}
