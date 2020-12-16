package by.epam.careers.part1.task8.entity;

import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private long creditCard;
    private long bankAccount;

    public Customer() {
    }

    public Customer(int id, String name, String surname, String patronymic,
                    String address, long creditCard, long bankAccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address; }

    public long getCreditCard() {
        return creditCard; }

    public long getBankAccount() {
        return bankAccount; }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                creditCard == customer.creditCard &&
                bankAccount == customer.bankAccount &&
                Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(patronymic, customer.patronymic) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, address, creditCard, bankAccount);
    }

    @Override
    public String toString() {
        return "Покупатель: " + surname + " " + name + " " + patronymic +
                ", адрес: " + address + ", номер кредитной карточки: " + creditCard +
                ", номер счёта: " + bankAccount;
    }

}
