package by.epam.careers.part1.task8.logic;

import by.epam.careers.part1.task8.entity.Customer;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    private static CustomerComparator instance;

    private CustomerComparator() {
    }

    public static CustomerComparator getInstance() {
        if (instance == null) {
            instance = new CustomerComparator();
        }
        return instance;
    }
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
