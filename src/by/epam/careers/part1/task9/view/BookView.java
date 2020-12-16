package by.epam.careers.part1.task9.view;

import by.epam.careers.part1.task9.entity.Book;

import java.util.List;

public class BookView {
    private static BookView instance;

    private BookView() {
    }

    public static BookView getInstance() {
        if (instance == null) {
            instance = new BookView();
        }
        return instance;
    }

    public void print(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void print(String message, List<Book> books) {
        System.out.println(message);
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
