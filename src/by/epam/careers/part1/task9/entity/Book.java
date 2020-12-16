package by.epam.careers.part1.task9.entity;

import java.util.Objects;

public class Book {
    private int id;
    private String tittle;
    private String author;
    private String publishingHouse;
    private int year;
    private int pages;
    private double price;
    private String binding;

    public Book() {
    }

    public Book(int id, String tittle, String author, String publishingHouse,
                int year, int pages, double price, String binding) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getBinding() {
        return binding;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                pages == book.pages &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(tittle, book.tittle) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(binding, book.binding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tittle, author, publishingHouse, year, pages, price, binding);
    }

    @Override
    public String toString() {
        return "Книга " + "'" + tittle + "'" +  ", автор '" + author +
                "', издательство '" + publishingHouse + "', год издания " + year +
                ", страниц " + pages +
                ", цена " + price +
                ", переплёт: " + binding;
    }
}
