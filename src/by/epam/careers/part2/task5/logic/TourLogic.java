package by.epam.careers.part2.task5.logic;

import by.epam.careers.part2.task5.entity.TourPackage;
import by.epam.careers.part2.task5.entity.TravelAgency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TourLogic {
    private static TourLogic instance;

    private TourLogic() {
    }

    public static TourLogic getInstance() {
        if (instance == null) {
            instance = new TourLogic();
        }
        return instance;
    }

    public List<TourPackage> choiceByTourType(TravelAgency tourPackages, String tourType) {
        List<TourPackage> list = new ArrayList<TourPackage>();
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            if (tourPackage.getTourType().getRealName().equalsIgnoreCase(tourType.trim())) {
                list.add(tourPackage);
            }
        }
        return list;
    }

    public List<TourPackage> selectionByMoreOptions(TravelAgency tourPackages, String transport) {
        List<TourPackage> list = new ArrayList<TourPackage>();
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            if (tourPackage.getTypeOfTransport().getRealName().equalsIgnoreCase(transport)) {
                list.add(tourPackage);
            }
        }
        return list;
    }

    public List<TourPackage> selectionByMoreOptions(TravelAgency tourPackages, int days) {
        List<TourPackage> list = new ArrayList<TourPackage>();
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            if (tourPackage.getNumberOfDays() == days) {
                list.add(tourPackage);
            }
        }
        return list;
    }

    public List<TourPackage> selectionByMoreOptions(TravelAgency tourPackages, String transport, String food) {
        List<TourPackage> list = new ArrayList<TourPackage>();
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            if (tourPackage.getTypeOfTransport().getRealName().equalsIgnoreCase(transport)
                    && tourPackage.getTypeOfFood().getRealName().equalsIgnoreCase(food)) {
                list.add(tourPackage);
            }
        }
        return list;
    }

    public List<TourPackage> selectionByMoreOptions(TravelAgency tourPackages, String transport, String food, int days) {
        List<TourPackage> list = new ArrayList<TourPackage>();
        for (TourPackage tourPackage : tourPackages.getTourPackages()) {
            if (tourPackage.getTypeOfTransport().getRealName().equalsIgnoreCase(transport) &&
                    tourPackage.getTypeOfFood().getRealName().equalsIgnoreCase(food)
                    && tourPackage.getNumberOfDays() == days) {
                list.add(tourPackage);
            }
        }
        return list;
    }

    public List<TourPackage> sortByPrice(TravelAgency tourPackages) {
        List<TourPackage> list = new ArrayList<>(tourPackages.getTourPackages());
        list.sort(Comparator.comparing(TourPackage::getPrice));
        return list;
    }

    public List<TourPackage> sortByDays(TravelAgency tourPackages) {
        List<TourPackage> list = new ArrayList<>(tourPackages.getTourPackages());
        list.sort(Comparator.comparing(TourPackage::getNumberOfDays));
        return list;
    }

    public List<TourPackage> sortByCountry(TravelAgency tourPackages) {
        List<TourPackage> list = new ArrayList<>(tourPackages.getTourPackages());
        list.sort(Comparator.comparing(TourPackage::getCountry));
        return list;
    }
}
