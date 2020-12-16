package by.epam.careers.part1.task9.main;

import by.epam.careers.part1.task9.entity.Book;
import by.epam.careers.part1.task9.entity.Library;
import by.epam.careers.part1.task9.logic.BookLogic;
import by.epam.careers.part1.task9.view.BookView;

import java.util.List;

/**Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив
 * типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных
 * и вывести эти данные на консоль. Book: id, название, автор(ы), издательство,
 * год издания, количество страниц, цена, тип переплёта.
 * Найти и вывести:
 * а) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.*/
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        BookLogic logic = BookLogic.getInstance();
        BookView view = BookView.getInstance();

        Book book1 = new Book(10407993, "Философия Java", "Брюс Эккель",
                "Питер", 2019, 1168, 79.65,
                "Твёрдый переплёт");
        Book book2 = new Book(10234323, "Изучаем Java",
                "Берт Бейтс, Кэти Сьерра", "Эксмо", 2015,
                720, 46.66, "Твёрдый переплёт");
        Book book3 = new Book(10302042,"Java для \"чайников\"","Барри Бёрд",
                "Диалектика",2013,384,53.78,
                "Мягкая обложка");
        Book book4 = new Book(10302042, "Java. Руководство для начинающих",
                "Герберт Шилдт","Вильямс",
                2019, 816, 90.10, "Мягкая обложка");
        Book book5 = new Book(10883341,"Java. Библиотека профессионала. Том 1. Основы",
                "Кей Хорстманн","Диалектика",2019,864,
                85.30, "Твёрдый переплёт");
        library.addAllBook(book1, book2, book3, book4, book5);

        List<Book> found = logic.findAuthor("Брюс Эккель", library.getListBook());
        view.print("Список книг заданного автора", found);

        found = logic.findPublishingHouse("Диалектика", library.getListBook());
        view.print("Список книг, выпущенных заданным издательство", found);

        found = logic.booksAfterYear(2018, library.getListBook());
        view.print("Список книг, выпущенных после заданного года", found);

    }
}
