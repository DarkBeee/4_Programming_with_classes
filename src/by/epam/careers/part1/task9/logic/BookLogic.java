package by.epam.careers.part1.task9.logic;

import by.epam.careers.part1.task9.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
    private static BookLogic instance;

    private BookLogic() {
    }

    public static BookLogic getInstance() {
        if (instance == null) {
            instance = new BookLogic();
        }
        return instance;
    }

    public List<Book> findAuthor(String nameAuthor, List<Book> books) {
        List<Book> find = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(nameAuthor)) {
                find.add(book);
            }
        }
        return find;
    }

    public List<Book> findPublishingHouse(String publishingHouse, List<Book> books) {
        List<Book> find = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                find.add(book);
            }
        }
        return find;
    }

    public List<Book> booksAfterYear(int year, List<Book> books) {
        List<Book> find = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYear() > year) {
                find.add(book);
            }
        }
        return find;
    }
}
