package by.epam.careers.part2.task4.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Person> clients;

    {
        clients = new ArrayList<Person>();
    }

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public void addClient(Person person) {
        clients.add(person);
    }

    public void addClient(Person ... person) {
        Collections.addAll(clients, person);
    }

    public ArrayList<Person> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Person> clients) {
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(clients, bank.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clients);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }
}
