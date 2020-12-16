package by.epam.careers.part2.task4.logic;

import by.epam.careers.part2.task4.entity.Account;

import java.util.Comparator;

public class AccountBalanceComparator implements Comparator<Account> {
    private static AccountBalanceComparator instance;

    private AccountBalanceComparator() {
    }

    public static AccountBalanceComparator getInstance() {
        if (instance == null) {
            instance = new AccountBalanceComparator();
        }
        return instance;
    }

    @Override
    public int compare(Account o1, Account o2) {
        return  (int) (o1.getBalance() - o2.getBalance());
    }
}
