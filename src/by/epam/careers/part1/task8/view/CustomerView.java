package by.epam.careers.part1.task8.view;

import by.epam.careers.part1.task8.entity.Customer;

import java.util.List;

public class CustomerView {
    private static CustomerView instance;

    private CustomerView() {
    }

    public static CustomerView getInstance() {
        if (instance == null) {
            instance = new CustomerView();
        }
        return instance;
    }

    public void print(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void print(String message, List<Customer> customers) {
        System.out.println(message);
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}
