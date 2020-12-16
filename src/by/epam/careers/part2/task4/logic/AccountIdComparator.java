package by.epam.careers.part2.task4.logic;

import by.epam.careers.part2.task4.entity.Account;

import java.util.Comparator;

public class AccountIdComparator implements Comparator<Account> {
    private static AccountIdComparator instance;

    private AccountIdComparator() {
    }

    public static AccountIdComparator getInstance() {
        if (instance == null) {
            instance = new AccountIdComparator();
        }
        return instance;
    }

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getId() - o2.getId();
    }
}
