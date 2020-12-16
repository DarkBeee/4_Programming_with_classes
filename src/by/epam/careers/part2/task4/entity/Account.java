package by.epam.careers.part2.task4.entity;

import java.util.Objects;

public class Account {
    private int id;
    private double balance;
    private boolean blockAcc = false;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlockAcc() {
        return blockAcc;
    }

    public void setBlockAcc(boolean blockAcc) {
        this.blockAcc = blockAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Double.compare(account.balance, balance) == 0 &&
                blockAcc == account.blockAcc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, blockAcc);
    }

    @Override
    public String toString() {
        return "Счёт №" + id + ", баланс: " + balance;
    }
}
