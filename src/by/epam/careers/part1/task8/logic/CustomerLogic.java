package by.epam.careers.part1.task8.logic;

import by.epam.careers.part1.task8.entity.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {
    private static CustomerLogic instance;

    private CustomerLogic() {
    }

    public static CustomerLogic getInstance() {
        if (instance == null) {
            instance = new CustomerLogic();
        }
        return instance;
    }

    public List<Customer> sortBySurname(List<Customer> customers) {
        Comparator<Customer> surnameComparator = CustomerComparator.getInstance();
        List<Customer> sortCustomer = new ArrayList<Customer>(customers);
        sortCustomer.sort(surnameComparator);
        return sortCustomer;
    }

    public List<Customer> findByCreditCard(long from, long to, List<Customer> customers) {
        List<Customer> sortCustomer = new ArrayList<Customer>();
        for (Customer customer : customers) {
            if (customer.getCreditCard() > from && customer.getCreditCard() < to) {
                sortCustomer.add(customer);
            }
        }
        return sortCustomer;
    }
}
