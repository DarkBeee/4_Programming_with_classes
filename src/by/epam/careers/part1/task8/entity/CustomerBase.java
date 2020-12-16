package by.epam.careers.part1.task8.entity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CustomerBase {
    private List<Customer> listCustomer;

    {
        listCustomer = new ArrayList<Customer>();
    }

    public CustomerBase() {
    }

    public CustomerBase(ArrayList<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public void addCustomer(Customer customer) {
        listCustomer.add(customer);
    }

    public void addAllCustomer(Customer ... customer) {
        Collections.addAll(listCustomer, customer);
    }

    public List<Customer> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(List<Customer> listCustomer) {
        this.listCustomer = listCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBase that = (CustomerBase) o;
        return Objects.equals(listCustomer, that.listCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listCustomer);
    }

    @Override
    public String toString() {
        return "CustomerBase{" +
                "listCustomer=" + listCustomer +
                '}';
    }
}
