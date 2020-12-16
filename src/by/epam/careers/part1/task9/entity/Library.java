package by.epam.careers.part1.task9.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Library {
    private List<Book> listBook;

    public Library() {
    }

    public Library(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    {
        listBook = new ArrayList<Book>();
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    public void addBook(Book book) {
        listBook.add(book);
    }

    public void addAllBook(Book ... book) {
        Collections.addAll(listBook, book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(listBook, library.listBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listBook);
    }

    @Override
    public String toString() {
        return "Library{" +
                "listBook=" + listBook +
                '}';
    }
}
