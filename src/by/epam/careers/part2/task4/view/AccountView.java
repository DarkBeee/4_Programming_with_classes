package by.epam.careers.part2.task4.view;

import by.epam.careers.part2.task4.entity.Account;

import java.util.List;

public class AccountView {
    private static AccountView instance;

    private AccountView() {
    }

    public static AccountView getInstance() {
        if (instance == null) {
            instance = new AccountView();
        }
        return instance;
    }

    public void print(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void print(String message, List<Account> accounts) {
        System.out.println(message);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void print(String message, double sum) {
        System.out.println(message + sum);
    }
}
