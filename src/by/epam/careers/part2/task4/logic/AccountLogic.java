package by.epam.careers.part2.task4.logic;

import by.epam.careers.part2.task4.entity.Account;
import by.epam.careers.part2.task4.entity.Bank;
import by.epam.careers.part2.task4.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class AccountLogic {
    private static AccountLogic instance;

    private AccountLogic() {
    }

    public static AccountLogic getInstance() {
        if (instance == null) {
            instance = new AccountLogic();
        }
        return instance;
    }

    public void blockAccount(Bank bank, int id) { // блокировка счёта по id аккаунта
        for (Person person : bank.getClients()) {
            for (Account account : person.getAccounts()) {
                if (account.getId() == id) {
                    account.setBlockAcc(true);
                    System.out.println("Счёт №" + account.getId() + " заблокирован");
                }
            }
        }
    }

    public void unlockingAccount(Bank bank, int id) { // разблокировка счёта по id аккаунта
        for (Person person : bank.getClients()) {
            for (Account account : person.getAccounts()) {
                if (account.getId() == id) {
                    account.setBlockAcc(false);
                    System.out.println("Счёт №" + account.getId() + " разблокирован");
                }
            }
        }
    }

    public List<Account> searchAccount(Bank bank, int id) { // поиск счёта по id аккаунта
        List<Account> list = new ArrayList<Account>();
        for (Person person : bank.getClients()) {
            for (Account account : person.getAccounts()) {
                if (account.getId() == id) {
                    list.add(account);
                }
            }
        }
        return list;
    }

    public List<Account> sortByBalanceAccount(Bank bank, String name) {
        List<Account> list = new ArrayList<Account>();
        for (Person person : bank.getClients()) {
            if (person.getName().equalsIgnoreCase(name.trim())) {
                list = person.getAccounts();
            }
        }
        list.sort(AccountBalanceComparator.getInstance());
        return list;
    }

    public List<Account> sortByIdAccount(Bank bank, String name) {
        List<Account> list = new ArrayList<Account>();
        for (Person person : bank.getClients()) {
            if (person.getName().equalsIgnoreCase(name.trim())) {
                list = person.getAccounts();
            }
        }
        list.sort(AccountIdComparator.getInstance());
        return list;
    }

    public double commonSum(Bank bank, String name) {
        double sum = 0;
        for (Person person : bank.getClients()) {
            if (person.getName().equalsIgnoreCase(name)) {
                for (Account account : person.getAccounts()) {
                    if (!account.isBlockAcc()) {
                        sum += account.getBalance();
                    }
                }
            }
        }
        return sum;
    }

    public double sumPositiveAcc(Bank bank, String name) {
        double sumPositive = 0;
        for (Person person : bank.getClients()) {
            if (person.getName().equalsIgnoreCase(name)) {
                for (Account account : person.getAccounts()) {
                    if (!account.isBlockAcc() && account.getBalance() > 0) {
                        sumPositive += account.getBalance();
                    }
                }
            }
        }
        return sumPositive;
    }

    public double sumNegativeAcc(Bank bank, String name) {
        double sumNegative = 0;
        for (Person person : bank.getClients()) {
            if (person.getName().equalsIgnoreCase(name)) {
                for (Account account : person.getAccounts()) {
                    if (!account.isBlockAcc() && account.getBalance() < 0) {
                        sumNegative += account.getBalance();
                    }
                }
            }
        }
        return sumNegative;
    }
}
