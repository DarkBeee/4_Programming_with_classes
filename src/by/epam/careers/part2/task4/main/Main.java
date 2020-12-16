package by.epam.careers.part2.task4.main;

import by.epam.careers.part2.task4.entity.Account;
import by.epam.careers.part2.task4.entity.Bank;
import by.epam.careers.part2.task4.entity.Person;
import by.epam.careers.part2.task4.logic.AccountLogic;
import by.epam.careers.part2.task4.view.AccountView;

import java.util.List;

/**Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счёта. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление
 * суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/
public class Main {
    public static void main(String[] args) {
        AccountLogic logic = AccountLogic.getInstance();
        AccountView view = AccountView.getInstance();

        Bank bank = new Bank("Беларусьбанк");
        Person person = new Person("Иванов Иван");

        person.addAccount(new Account(1007032561, 435));
        person.addAccount(new Account(1003484606, -632.07));
        person.addAccount(new Account(1002999802, 1245.68));
        person.addAccount(new Account(1001864723, -189));
        bank.addClient(person);

        logic.blockAccount(bank, 1002999802);
        logic.unlockingAccount(bank, 1002999802);

        List<Account> found = logic.searchAccount(bank, 1002999802);
        view.print("Результат поиска", found);

        found = logic.sortByBalanceAccount(bank, person.getName());
        view.print("Результат сортировки по балансу", found);

        found = logic.sortByIdAccount(bank, person.getName());
        view.print("Результат сортировки по Id", found);

        view.print("Общая сумма - ", logic.commonSum(bank, person.getName()));

        view.print("Cумма по счетам, имеющим положительный баланс - ",
                logic.sumPositiveAcc(bank, person.getName()));
        view.print("Cумма по счетам, имеющим отрицательный баланс - ",
                logic.sumNegativeAcc(bank, person.getName()));
    }
}
